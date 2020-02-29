package com.starter;

import com.lib.HelloService;
import com.lib.TypicalHelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// TODO-24: Note that hello-starter has its own configuration class,
//          in which TypicalHelloService bean is configured.
@Configuration

// TODO-33: Add @ConditionalOnClass(HelloService.class)

public class HelloAutoConfig {

    // TODO-34: Add @ConditionalOnMissingBean(HelloService.class)

    @Bean
    HelloService helloService() {
        return new TypicalHelloService();
    }

}

