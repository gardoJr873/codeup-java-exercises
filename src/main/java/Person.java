public class Person {
    public String name;
    public Person(String name){
        this.name = name;
    }
    public String getInfo() {
        return String.format("%s says hello", this.name);
    }
    public static void main(String[] args) {
        Person minPerson = new Person("Sam");
        System.out.println(minPerson.getInfo());
    }
}