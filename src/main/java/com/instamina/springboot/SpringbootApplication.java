package com.instamina.springboot;



import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
		//关闭banner显示
		/*SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringbootApplication.class);
		builder.bannerMode(Banner.Mode.OFF).run(args);*/
	}
	
	@Bean
	public TomcatServletWebServerFactory tomcatServletWebServerFactory(Connector connector){
		TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory(){
			@Override 
			protected void postProcessContext(Context context) { 
				SecurityConstraint securityConstraint = new SecurityConstraint(); 
				securityConstraint.setUserConstraint("CONFIDENTIAL"); 
				SecurityCollection collection = new SecurityCollection(); 
				collection.addPattern("/*"); 
				securityConstraint.addCollection(collection); 
				context.addConstraint(securityConstraint); 
				} 
		}; 
		tomcat.addAdditionalTomcatConnectors(connector); 
		return tomcat; 
	}

	@Bean
    public Connector httpConnector() {
        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
        connector.setScheme("http");
        //Connector监听的http的端口号
        connector.setPort(8080);
        connector.setSecure(false);
        //监听到http的端口号后转向到的https的端口号
        connector.setRedirectPort(8082);
        return connector;
    }
}
