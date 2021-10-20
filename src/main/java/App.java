import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorldBean = (HelloWorld) applicationContext.getBean("helloWorld");
        HelloWorld twoHelloWorldBean = (HelloWorld) applicationContext.getBean("helloWorld");

        Cat catBean = (Cat) applicationContext.getBean("cat");
        Cat twoCatBean = (Cat) applicationContext.getBean("cat");

        boolean helloWorldBeanCompare = helloWorldBean == twoHelloWorldBean;
        boolean catBeanCompare = catBean == twoCatBean;

        System.out.println(helloWorldBeanCompare);
        System.out.println(catBeanCompare);
    }
}