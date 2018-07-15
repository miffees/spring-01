package cn.tedu.pojo;

public class Person {
    private String name;
    private int age;

    public void Person(){
        System.out.println("hvhvhvhv");
    }

    public void setName(String name) {
        System.out.println("sya ooo");
        this.name = name;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void setAge(int age) {
        System.out.println("shezhi ninaling");
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
