package Animals;

import FamilyTree.Person;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, Person owner) {
        super(name, owner);
    }

    @Override
    public void voice() {
        System.out.println("Гав-гав\n");
    }
}