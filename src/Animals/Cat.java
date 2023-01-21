package Animals;

import FamilyTree.Person;

public class Cat extends Pet{

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, Person owner) {
        super(name, owner);
    }

    @Override
    public void voice() {
        System.out.println("Мяу-Мяу");
    }
}
