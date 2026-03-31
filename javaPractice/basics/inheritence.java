// --- Class Inheritance ---

class Animal {

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// --- Interface Implementation ---

interface Vehicle {

    void move();
}

class Car implements Vehicle {

    @Override
    public void move() {
        System.out.println("Car moves");
    }

    void honk() {
        System.out.println("honk honk!!");
    }
}

// --- Main ---

public class inheritence {

    public static void main(String[] args) {

        // Polymorphism via class inheritance
        Animal myAnimal = new Dog();
        myAnimal.makeSound();

        // Interface implementation
        Car myVehicle = new Car();
        myVehicle.move();
        myVehicle.honk();
    }
}