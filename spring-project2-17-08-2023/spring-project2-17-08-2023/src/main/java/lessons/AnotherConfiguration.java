package lessons;

import lessons.services.BeanWithDependency;
import lessons.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnotherConfiguration {
    @Autowired
    IGreetingService igreetingService;
    @Bean
    BeanWithDependency beanWithDependency(){
        return new BeanWithDependency();
    }
}
