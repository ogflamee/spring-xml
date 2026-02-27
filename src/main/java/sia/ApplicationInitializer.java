package sia;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import sia.config.AppConfig;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

        @Override
        protected Class<?>[] getRootConfigClasses() {
            return new Class[0];
        }

        @Override
        protected Class<?>[] getServletConfigClasses() {
            return new Class<?>[] { AppConfig.class };
        }

        @Override
        protected String[] getServletMappings() {
            return new String[] { "/" };
        }
    }

