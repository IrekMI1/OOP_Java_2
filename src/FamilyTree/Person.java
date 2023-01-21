package FamilyTree;

import Animals.Animal;

public class Person extends Member {

    public Person(String fullName, TreeNode parent1, TreeNode parent2) {
        super(fullName, parent1, parent2);
    }

    public Person(String fullName, TreeNode parent) {
        super(fullName, parent);
    }

    public Person(String fullName) {
        super(fullName);
    }

    @Override
    public String toString() {
        return this.getFullName();
    }

    public void callPet(Animal animal) {
        animal.callReply(this);
    }
}
