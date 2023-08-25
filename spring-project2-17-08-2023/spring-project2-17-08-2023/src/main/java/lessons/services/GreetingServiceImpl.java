package lessons.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("igreetingService")
@Qualifier("main")
@Scope("prototype")

public class GreetingServiceImpl implements IGreetingService, InitializingBean, DisposableBean {
    private static final Logger logger = LogManager.getLogger(IGreetingService.class);

    @Override
    public String sayGreeting() {
        return "Greeting, user!";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("invoke afterPropertiesSet method");
    }

    @Override
    public void destroy() throws Exception {
        logger.info("invoke destroy method");
    }

    public void initMethod() {
        logger.info("invoke initMethod method");
    }

    public void destroyMethod() {
        logger.info("invoke destroyMethod method");
    }

    @PostConstruct
    public void postConctructMethod() {
        logger.info("invoke postConctructMethod method");
    }

    @PostConstruct
    public void anotherPostConctructMethod() {
        logger.info("invoke anotherPostConctructMethod method");
    }

    @PreDestroy
    public void preDestroyMethod() {
        logger.info("invoke preDestroyMethod method");
    }
}
