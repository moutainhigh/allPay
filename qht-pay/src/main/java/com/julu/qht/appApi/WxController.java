package com.julu.qht.appApi;

import io.swagger.annotations.Api;

import com.github.binarywang.wxpay.bean.notify.WxPayOrderNotifyResult;
import com.github.binarywang.wxpay.bean.order.WxPayMpOrderResult;
import com.github.binarywang.wxpay.bean.request.WxPayUnifiedOrderRequest;
import com.github.binarywang.wxpay.bean.result.BaseWxPayResult;
import com.github.binarywang.wxpay.service.WxPayService;
import com.julu.qht.entity.dto.CodeMessage;
import com.julu.qht.service.IExtractRecordService;
import com.julu.qht.service.IIntegralBagService;
import com.julu.qht.service.IRechargeRecordService;
import com.julu.qht.util.IDUtils;
import com.julu.qht.util.IpUtil;

import cn.binarywang.wx.miniapp.api.WxMaService;

import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 关于微信的Api
 */
@Api(tags = "关于微信的Api")
@RestController
public class WxController {
	private final Log logger = LogFactory.getLog(WxController.class);
	@Autowired
	private WxMaService wxService;

	@Autowired
	private WxPayService wxPayService;

	@Autowired
	private PlatformTransactionManager txManager;
	
	@Autowired
	private IIntegralBagService integralBagService;

	@Autowired
	private IRechargeRecordService rechargeRecordService;
	
	@Autowired
	private IExtractRecordService extractRecordService;

	/**
	 * 微信支付
	 */
	@PostMapping("order_pay")
	public CodeMessage order_pay(Integer order_id, HttpServletRequest request) {

		// TODO 1.判断订单状态
		// TODO 2.已支付、已取消 提示
		WxPayMpOrderResult result = null;
		try {
			WxPayUnifiedOrderRequest orderRequest = new WxPayUnifiedOrderRequest();
			orderRequest.setOutTradeNo("CZ"+IDUtils.genImageName());
			orderRequest.setTradeType("APP");
			orderRequest.setBody("订单：");
			// 微信分为单位
			orderRequest.setTotalFee(100);
			orderRequest.setSpbillCreateIp(IpUtil.getIpAddr(request));
			result = wxPayService.createOrder(orderRequest);
			System.out.println(result.toString());
			// 缓存prepayID用于后续模版通知
			String prepayId = result.getPackageValue();
			prepayId = prepayId.replace("prepay_id=", "");
		} catch (Exception e) {
			logger.error(500, e);
			return CodeMessage.erro_service_erro();
		}

		return CodeMessage.success("登录成功", null);
	}

	/**
	 * 付款成功回调接口
	 */
	@PostMapping("order_pay_notify")
	public CodeMessage order_pay_notify(HttpServletRequest request, HttpServletResponse response) {
		try {
			String xmlResult = IOUtils.toString(request.getInputStream(), request.getCharacterEncoding());
			WxPayOrderNotifyResult result = wxPayService.parseOrderNotifyResult(xmlResult);
			String orderSn = result.getOutTradeNo();
			String payId = result.getTransactionId();
			String totalFee = BaseWxPayResult.fenToYuan(result.getTotalFee());

		} catch (Exception e) {

		}
		return CodeMessage.success("登录成功", null);
	}
	
	
}
