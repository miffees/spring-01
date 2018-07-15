package cn.tedu.test;
import cn.tedu.pojo.HelloWorld;
import cn.tedu.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.TestExecutionListeners;

public class Test {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) context.getBean("person");
        person.getName();
        person.getAge();
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloworld");


    }




}
