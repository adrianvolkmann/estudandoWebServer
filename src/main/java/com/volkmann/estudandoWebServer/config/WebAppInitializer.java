package com.volkmann.estudandoWebServer.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// podemos informar a classe de configuração dos outros componentes da aplicação
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		// nos permite informar qual classe será utilizada
		// para configurar os controllers da aplicação.
		return new Class<?>[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		// Com a URL “/�?, estamos dizendo que todas as
		// requisições devem ser tratadas pelo Spring MVC.
		return new String[] { "/" };
	}

}
