package java;/*
 * Created by Mahdiye on 2021, Mar, 22
 */

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class TheFrontController extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {TheConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{TheConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
