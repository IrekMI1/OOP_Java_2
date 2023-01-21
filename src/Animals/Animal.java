package Animals;
import FamilyTree.Person;

public interface Animal {
    public default void voice() {
        System.out.println("Не издает звуков.");
    }

    public void callReply(Person person);
}
