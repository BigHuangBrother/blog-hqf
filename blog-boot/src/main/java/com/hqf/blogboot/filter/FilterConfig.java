package com.hqf.blogboot.filter;

import org.ebaysf.web.cors.CORSFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean corsFilter() {
        CORSFilter filter = new CORSFilter();
        Map<String,String> initParam = new HashMap<String, String>(16);
        initParam.put("cors.allowed.origins","*");
        initParam.put("cors.allowed.methods","GET,POST,HEAD,OPTIONS,PUT");
        initParam.put("cors.allowed.headers","Content-Type,X-Requested-With,Set-Cookie,accept,Origin,Access-Control-Request-Method,Access-Control-Request-Headers,token,username,authkey,content-type,sessionid");
        initParam.put("cors.exposed.headers","");
        initParam.put("cors.support.credentials","true");
        initParam.put("cors.logging.enabled","true");
        initParam.put("cors.preflight.maxage","60");
        //initParam.put("Access-Control-Request-Headers","authkey,content-type,sessionid")
        //initParam.put("Access-Control-Request-Method","GET,POST,HEAD,OPTIONS,PUT")
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setInitParameters(initParam);
        registration.setFilter(filter);
        registration.addUrlPatterns("/*");
        registration.setOrder(1);
        return registration;
    }

}
