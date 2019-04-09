 	package br.usjt.previsaoTempo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import br.usjt.previsaoTempo.Validador.Validador;



@Configuration
public class Config implements WebMvcConfigurer {
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new Validador()).
			addPathPatterns("/**").
			excludePathPatterns("/login", "/", "/fazerLogin");
	}
}