package com.qht.auth.service;

import com.qht.auth.util.JwtAuthenticationRequest;

/**
 * 权限验证
 * @author 草原狼
 * @date Nov 10, 2018 6:04:16 PM
 */
public interface AuthService {
	String login(JwtAuthenticationRequest authenticationRequest) throws Exception;
	String refresh(String oldToken) throws Exception;
	void validate(String token) throws Exception;
}