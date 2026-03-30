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


public class inheritence {

    public static void main (String [] args){

        Animal myAnimal = new Dog();

        myAnimal.makeSound();

    }

}