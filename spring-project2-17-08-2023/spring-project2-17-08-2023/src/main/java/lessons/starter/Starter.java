package lessons.starter;


import lessons.LessonsConfiguration;
import lessons.services.BeanWithDependency;
import lessons.services.IGreetingService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

public class Starter {
    private static final Logger logger = LogManager.getLogger(Starter.class);
    public static void main(String[] args) {
        logger.info("Starting configuration... ");

        ApplicationContext context = new AnnotationConfigApplicationContext(LessonsConfiguration.class);
        logger.info("Message: " + context.getMessage("message",null, Locale.getDefault()));
        logger.info("Argument.required: " + context.getMessage("argument.required", new Object[]{"Test_Argument"},Locale.getDefault()));

        IGreetingService greetingService = context.getBean(IGreetingService.class);
        BeanWithDependency beanWithDependency = context.getBean(BeanWithDependency.class);
        logger.info(greetingService.sayGreeting());
        logger.info(beanWithDependency.printText());
    }
}