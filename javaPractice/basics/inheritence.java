public class Animal {

    public void makeSound(){
        System.out.println("Animal makes a sound");
    }
    
}

public class Dog extends Animal{

    public void makeSound(){
        System.out.println("Dog barks");
    }
}

interface vehicle{

    void move();

}

public class car implements vehicle{
    void honk(){
        System.out.println("honk honk!!");

    }


}


public class inheritence {

    public static void main (String [] args){

        Animal myAnimal = new Dog();

        myAnimal.makeSound();

        car myVehicle = new car();

        myVehicle.honk();

    }

}