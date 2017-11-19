package com.lotto.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lotto.services.LottoService;

@Configuration
public class ServiceLocator {
	private static final String conf = "applicationContext.xml";
 
	/**
	 * instancier le context spring dans la class main
	 * 
	 */
	public static AbstractApplicationContext initContext(){
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(conf);
		context.registerShutdownHook();
	
		return context;
	}
	private static <T> T getService(Class<T> clazz) {
		T bean = ServiceLocator.initContext().getBean(clazz);

		return bean;
	}

	public static final LottoService getLottoService() {
		return getService(LottoService.class);
	}

}
