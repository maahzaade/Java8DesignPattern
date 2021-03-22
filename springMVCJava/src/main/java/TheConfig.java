package main.java;/*
 * Created by Mahdiye on 2021, Mar, 22
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan("main.java")
public class TheConfig extends WebMvcConfigurerAdapter {
}
