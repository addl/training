package addl.lion.training.config.custom;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import addl.lion.training.service.HelloService;
import addl.lion.training.service.HelloServiceImpl;

@Configuration
@ConditionalOnClass(HelloService.class)
public class HelloServiceAutoConfiguration {
	
	//conditional bean creation
    @Bean
    @ConditionalOnMissingBean
    public HelloService helloService(){

        return new HelloServiceImpl();
    }

}
