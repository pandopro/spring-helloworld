import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Boolean answer = bean1 == bean2;
        System.out.println(bean1.getMessage());
        Cat beanCat1 = (Cat) applicationContext.getBean("cat");
        Cat beanCat2 = (Cat) applicationContext.getBean("cat");
        Boolean answer2 = beanCat1 == beanCat2;
        System.out.println("1. helloWorld1 == helloworld2:  " + answer);
        System.out.println("1. cat1 == cat2:  " + answer2);

    }
}