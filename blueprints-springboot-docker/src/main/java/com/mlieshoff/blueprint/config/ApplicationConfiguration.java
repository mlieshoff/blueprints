package com.mlieshoff.blueprint.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Validated
@EnableWebMvc
@Configuration
@ComponentScan("com.mlieshoff.blueprint")
@EnableAutoConfiguration
public class ApplicationConfiguration {}
