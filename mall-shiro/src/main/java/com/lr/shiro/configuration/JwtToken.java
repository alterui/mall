package com.lr.shiro.configuration;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author liurui
 * @date 2020/8/29 9:14
 */
public class JwtToken implements AuthenticationToken {
    private String token;
    public JwtToken(String token) {
        this.token = token;
    }
    @Override
    public Object getPrincipal() {
        return token;
    }
    @Override
    public Object getCredentials() {
        return token;
    }
}

