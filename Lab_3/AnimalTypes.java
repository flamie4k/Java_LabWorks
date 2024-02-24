package Lab_3;
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog Barks...");
    }    
    void color() {
        System.out.println("Black...");
    }
}

public class AnimalTypes {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.color();
        d.sound();
    }
}
