import mypackage.*;
import mypackage.Dog;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.setType("Leon");
        animal1.setAge(23);
        animal1.setColor("Red");
        animal1.setSex("Male");
        animal1.getInfo();
        animal1.runAnimal();

        Dog dog1 = new Dog();

        dog1.setTypeOfDog("Cane Corso");
        dog1.setName("Pato");
        dog1.setAge(23);
        dog1.setType("Dog");
        dog1.setColor("Black");
        dog1.setSex("Female");
        dog1.setOwner("Dado");
        dog1.getInfo();
        dog1.runAnimal();


        String massage = animal1.getInfo();
        String massage2 = dog1.getInfo();

        System.out.println(massage + massage2);





    }
}
