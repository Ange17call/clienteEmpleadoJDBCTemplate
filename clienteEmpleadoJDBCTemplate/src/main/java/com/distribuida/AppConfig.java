package com.distribuida;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

import com.distribuida.dao.ServicioEmpleadoJDBC;


@Configuration
@ComponentScan("com")
public class AppConfig {
	
	@Bean("servicioEmpleadosCliente")
	public HttpInvokerProxyFactoryBean servicioEmpleados(){
		HttpInvokerProxyFactoryBean proxy = new HttpInvokerProxyFactoryBean();
		proxy.setServiceUrl("http://localhost:9090/servicioEmpleado");
		proxy.setServiceInterface(ServicioEmpleadoJDBC.class);
		return proxy;
	}

}
