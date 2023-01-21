import Animals.Animal;
import Animals.Dog;
import Animals.Pet;
import FamilyTree.*;


public class Main {
    public static void main(String[] args) {
        Person dad = new Person("Dad");
        Person mom = new Person("Mom");
        dad.setSpouse(mom);

        TreeNode son = new Person("son", dad, mom);
        TreeNode daughter = new Person("daughter", dad, mom);

        Person grandpa = new Person("grandpa");
        dad.setParent(grandpa);

        System.out.println(grandpa.getChildren());
        System.out.println(dad.getChildren());
        System.out.println(dad.getParent());
        System.out.println(mom.getChildren());
        System.out.println(mom.getParent());
        System.out.println(son.getParent());
        System.out.println(daughter.getParent());
        System.out.println(dad.getSpouse());
        System.out.println(mom.getSpouse());

        Dog dog = new Dog("Jack", dad);
        dog.callReply(mom);
        dog.voice();
        System.out.println(dog);
        dad.callPet(dog);
    }
}

