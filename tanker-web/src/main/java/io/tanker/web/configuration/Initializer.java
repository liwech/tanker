package io.tanker.web.configuration;

import org.slf4j.bridge.SLF4JBridgeHandler;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.*;
import java.util.EnumSet;

public class Initializer implements WebApplicationInitializer {

    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext mvcContext = getAnnotationConfigWebApplicationContext(servletContext);
        configureDispatcher(servletContext, mvcContext);
        installJavaUtilLoggingBridge();
    }

    private AnnotationConfigWebApplicationContext getAnnotationConfigWebApplicationContext(ServletContext servletContext) {
        AnnotationConfigWebApplicationContext mvcContext = new AnnotationConfigWebApplicationContext();
        mvcContext.setServletContext(servletContext);
        mvcContext.register(MvcConfig.class);

        // spring security
        DelegatingFilterProxy delegatingFilterProxy = new DelegatingFilterProxy("springSecurityFilterChain", mvcContext);
        FilterRegistration fr = servletContext.addFilter("securityFilter", delegatingFilterProxy);
        fr.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD), true, "/*");

        return mvcContext;
    }

    private void configureDispatcher(ServletContext servletContext, AnnotationConfigWebApplicationContext mvcContext) {
        ServletRegistration.Dynamic dispatcher =
                servletContext.addServlet("dispatcher", new DispatcherServlet(mvcContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }

    private void installJavaUtilLoggingBridge() {
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
    }

}
