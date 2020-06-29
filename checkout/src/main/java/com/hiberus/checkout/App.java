package com.hiberus.checkout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

/**
 * 
 * @author Jorge Torres
 *
 */
@SpringBootApplication
@Import(SwaggerConfiguration.class)
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "It works!!!" );
        SpringApplication.run(App.class, args);
    }
    
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
          .addResourceLocations("classpath:/META-INF/resources/");
     
    }
    
    @Configuration
    class RestTemplateConfig {
    	
    	// Create a bean for restTemplate to call services
    	@Bean
    	public RestTemplate restTemplate() {
    	    return new RestTemplate();
    	}
    }
}
