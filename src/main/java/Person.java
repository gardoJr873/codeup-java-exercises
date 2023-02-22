import java.util.Scanner;
import java.util.Objects;
public class Person {
    private String name;
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String sayHello() {
        return String.format("Say hello " + this.name);
    }
    public static void main(String[] args) {
        Person edgardo = new Person();
        Person emily = new Person();
        edgardo.name = "Edgardo";
        emily.name = "Emily";
        System.out.println(edgardo.sayHello());

    }

}
