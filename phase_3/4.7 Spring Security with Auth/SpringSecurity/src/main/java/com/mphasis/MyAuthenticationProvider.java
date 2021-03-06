package com.mphasis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * AuthenticationProvider
 */
@Component
public class MyAuthenticationProvider implements AuthenticationProvider {

    private static final Logger logger = LoggerFactory.getLogger(MyAuthenticationProvider.class);

    private final RestTemplate restTemplate;

    public MyAuthenticationProvider(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        Object username = authentication.getPrincipal();
        Object password = authentication.getCredentials();
        logger.info("username = {}, password = {}", username, password);

        MultiValueMap<String, String> formParams = new LinkedMultiValueMap<>();
        formParams.add("username", username.toString());
        formParams.add("password", password.toString());

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_FORM_URLENCODED_VALUE);

        RequestEntity<MultiValueMap<String, String>> requestEntity =
                new RequestEntity<>(formParams, httpHeaders, HttpMethod.POST,
                        URI.create("http://localhost:9000/auth"));

        try {

            ResponseEntity<String> responseEntity = restTemplate.exchange(requestEntity, String.class);
            logger.info("login success???(status???" + responseEntity.getStatusCode() + ")");
            UsernamePasswordAuthenticationToken user = new UsernamePasswordAuthenticationToken(username, password, AuthorityUtils.createAuthorityList("ROLE_USER"));
            return user;
        } catch (RestClientException e) {
            logger.error("login failure...");
            throw new BadCredentialsException("Username or password are invalid! ", e);
        }
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.isAssignableFrom(UsernamePasswordAuthenticationToken.class);
    }
}
