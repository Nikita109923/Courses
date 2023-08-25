package lessons.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;

import java.util.Map;

public class AutowiredClass {
    @Autowired
    @Qualifier("main")
    //@Autowired(required = false) //чтобы не бросалось исключение,
    //если не с кем связать
    //рекомендуется использовать @Required

    private IGreetingService igreetingService;

    @Autowired //к полям класса в виде массива или коллекции
    private IGreetingService [] igreetingServices;

    @Autowired //к Map, где ключами являются имена бинов, значения - сами бины
    private Map<String,IGreetingService> serviceMap;
    @Autowired //к конструктору
    public AutowiredClass(@Qualifier("main") IGreetingService igreetingService){}

    @Autowired //к обычным методам с произвольным названием аргументов и их количеством
    public void prepare (IGreetingService prepareContext){}

    //@Resourse
    private ApplicationContext context;

    @Autowired //к "традиционному" setter-методу
   // @Resource(name="greetingService ")
    public void setContext(IGreetingService service){
        this.igreetingService = service;
    }
}
