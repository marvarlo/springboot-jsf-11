package com.mavlsoft.jsfboot11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {
    private final static Logger LOG = LoggerFactory.getLogger(AppConfig.class);

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        LOG.info("Configuring addViewControllers...");
        registry.addViewController("/").setViewName("/index.xhtml");
    }
}
