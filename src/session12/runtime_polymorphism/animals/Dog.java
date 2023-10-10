package session12.runtime_polymorphism.animals;

import session12.runtime_polymorphism.animals.Animal;

public class Dog extends Animal {

    @Override
    public String sound() {
        return "Dog barks.";
    }
}
