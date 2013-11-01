package io.tanker.web.configuration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class Initializer implements WebApplicationInitializer {

    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext mvcContext = getAnnotationConfigWebApplicationContext(servletContext);
        configureDispatcher(servletContext, mvcContext);
    }

    private AnnotationConfigWebApplicationContext getAnnotationConfigWebApplicationContext(ServletContext servletContext) {
        AnnotationConfigWebApplicationContext mvcContext = new AnnotationConfigWebApplicationContext();
        mvcContext.setServletContext(servletContext);
        mvcContext.register(MvcConfig.class);
        return mvcContext;
    }

    private void configureDispatcher(ServletContext servletContext, AnnotationConfigWebApplicationContext mvcContext) {
        ServletRegistration.Dynamic dispatcher =
                servletContext.addServlet("dispatcher", new DispatcherServlet(mvcContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }

}
