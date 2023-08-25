package lessons.services;

public class BeanWithDependency {
    public BeanWithDependency(){}

    public BeanWithDependency(IGreetingService igreetingService){}
    public String printText(){
        return "Some text";
    }
}
