package main.com.telusko;/*
 * Created by Mahdiye on 2021, Mar, 22
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"main.com.telusko"})
public class TeluscoConfig {

    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver vr = new InternalResourceViewResolver();
        vr.setPrefix("/WEB-INF/views/");
        vr.setSuffix(".jsp");

        return vr;
    }
}
