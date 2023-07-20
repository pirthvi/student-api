package com.webservice.studentapi.config;

import com.webservice.studentapi.populators.StudentPopulator;
import com.webservice.studentapi.populators.impl.StudentPopulatorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public StudentPopulator getStudentPopulator(){
        return new StudentPopulatorImpl();
    }
}
