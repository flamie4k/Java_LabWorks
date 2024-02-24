package Lab_3;

import Lab_3.AnimalTypes;
import Lab_3.AreaCalculation;

public class oopconcepts {
    public static void main(String[] args){
        AnimalTypes at = new AnimalTypes();
        AreaCalculation ac = new AreaCalculation();
        Dog d = new Dog();
        d.sound();
        
        // Create an object of the Triangle class and call its method
        Triangle tri = new Triangle(9, 10);
        tri.areaOfTriangle();
    }
}
