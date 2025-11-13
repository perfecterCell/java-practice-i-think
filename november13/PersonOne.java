package november13;
public class PersonOne {
    String name;
    int age;

    public void sayHello(){
        System.out.println("Hello, my names is " + name);
    }

    public class Main{
        public static void main(String[] args) {
            PersonOne p = new PersonOne();
            p.name = "Alice";
            p.sayHello();
        }
    }
}
