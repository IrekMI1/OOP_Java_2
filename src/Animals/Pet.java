package Animals;

import FamilyTree.Person;

public abstract class Pet implements Animal {
    private final String name;
    private Person owner;

    public Pet(String name) {
        this.name = name;
    }

    public Pet(String name, Person owner) {
        this(name);
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    @Override
    public void callReply(Person person) {
        System.out.printf("Бежит навстречу к %s\n", person.getFullName());
    }

    @Override
    public String toString() {
        return String.format("Кличка: %s, Хозяин: %s\n", name, owner.getFullName());
    }
}
