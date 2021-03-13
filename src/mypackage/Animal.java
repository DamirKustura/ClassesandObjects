package mypackage;

public class Animal {

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private String color;
    private String type;
    private String sex;
    private int age;

    public Animal() {

    }

    Animal(String color, String type, String sex, int age) {
        this.type = type;
        this.color = color;
        this.age = age;
        this.sex = sex;
    }

    public void runAnimal() {
        System.out.println("This " + this.type + " can run!");
    }

    public  String getInfo() {
        return ("Type of Animal: " + type + "\n" +
                "Age of Animal: " + age + "\n"
                + "Color of Animal: " + color + "\n"
                + "Gender of Animal:  " + sex + "\n");

    }
}
