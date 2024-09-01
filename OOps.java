import encapsulation.EncapsulationIntro;

public class OOps {
    public static void main(String[] args){
        System.out.println("Holla");
        Person p1 = new Person();
        p1.age = 24;
        p1.name = "Tathagata";

        Person p2 = new Person(20, "Arundhati");
        // p2.name = "Arundhati";
        // p2.age = 20;
        //System.out.println(p1.name + " " +p1.age+ "Another person:"+ p2.name+ " " +p2.age);
        // p1.run();
        // p2.walk();
        // p2.walk(23);
        // System.out.println(Person.count);
        //Developer d1 = new Developer(89, "Anuj");
        //d1.walk();

        EncapsulationIntro obj = new EncapsulationIntro();
        obj.doWork();
    }    
}
class Developer extends Person{
    public Developer(int age, String name){
        super(age, name);

    }
    void walk(){
        System.out.println(name + "DEVELOPER is walking differently");
    }
}

class Person{
    String name;
    int age;
    static int count = 0;
    
    public Person(){
        
        count++;
        System.out.println("constructor is made");
    }
    public Person(int newAge, String newName){
        name = newName;
        age = newAge;
    }

    void walk(){
        System.out.println(name+ " is walking.");
    } 
    void run(){
        System.out.println(name + " is running.");
    
        
    }
    void walk(int steps){
        System.out.println(name+ " walked "+steps+ " steps");
    }
}
