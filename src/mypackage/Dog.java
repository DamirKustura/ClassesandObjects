package mypackage;


public class Dog extends Animal {

    public String getTypeOfDog() {
        return typeOfDog;
    }

    public void setTypeOfDog(String typeOfDog) {
        this.typeOfDog = typeOfDog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    private String owner;
    private String name;
    private String typeOfDog;

    public Dog() {

    }

    public Dog(String type, int age, String color, String sex, String owner, String name, String typeOfDog) {
        super(color, type, sex, age);
        this.owner = owner;
        this.name = name;
        this.typeOfDog = typeOfDog;

    }

    @Override
    public String getInfo() {
        return "Type " + this.getType() + "\n" +
                "Gender of dog " + this.getSex() + "\n" +
                "Color " + this.getColor() + "\n" +
                "Age " + this.getAge() + "\n" +
                "Owner " + this.owner + "\n" +
                "Type of Dog: " + this.typeOfDog + "\n" +
                "Dog name: " + this.name + "\n";


    }
}
