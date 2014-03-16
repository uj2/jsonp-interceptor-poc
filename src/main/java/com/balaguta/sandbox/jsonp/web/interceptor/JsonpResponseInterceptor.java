package com.balaguta.sandbox.jsonp.web.interceptor;

import org.springframework.http.MediaType;
import org.springframework.util.Assert;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author: Andrey
 * @version: 1
 */
public class JsonpResponseInterceptor implements HandlerInterceptor {
    
    private static final String ACCEPT_HEADER = "accept";
    private String callbackParameter = "callback";
    private ContentNegotiationManager contentNegotiationManager;

    public void setCallbackParameter(String callbackParameter) {
        Assert.notNull(callbackParameter, "callbackParameter must not be null");
        this.callbackParameter = callbackParameter;
    }

    public void setContentNegotiationManager(ContentNegotiationManager contentNegotiationManager) {
        this.contentNegotiationManager = contentNegotiationManager;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        List<MediaType>
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }

    
}
