import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld firstHelloWorldBean = applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld secondHelloWorldBean = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(firstHelloWorldBean == secondHelloWorldBean);

        Cat firstCatBean  = applicationContext.getBean("cat", Cat.class);
        Cat secondCatBean = applicationContext.getBean("cat", Cat.class);
        System.out.println(firstCatBean == secondCatBean);

    }
}