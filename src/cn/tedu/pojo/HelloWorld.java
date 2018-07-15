package cn.tedu.pojo;

public class HelloWorld {
    public static HelloWorld getInstance(){
        System.out.println("beans");
        return new HelloWorld();
    }
}
