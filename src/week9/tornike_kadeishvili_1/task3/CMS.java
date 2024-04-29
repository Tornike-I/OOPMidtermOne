package week9.tornike_kadeishvili_1.task3;

import week9.tornike_kadeishvili_1.task3.Chore;

import java.util.ArrayList;
import java.util.List;
public class CMS {
    // Mapping with Book and the number of this book in the library
    private List<Chore> storage = new ArrayList<Chore>();
    // adds the book to the library
    public void addChore(Chore chore) {
        storage.add(chore);
    }
    // removes the book from the library
    public boolean removeChore(Chore chore) {
        boolean removed = false;
        for (int i = 0; i < storage.size(); i++) {
            Chore sampleChore = storage.get(i);
            if (sampleChore.getName().equals(chore.getName()) &&
                    sampleChore.getImportance().equals(chore.getImportance()) &&
                    sampleChore.getDuration() == (chore.getDuration())) {
                storage.remove(i);
                removed = true;
                break;
            }
        }
        return removed;
    }
    public void printStorage() {
        if (storage.isEmpty()) {
            System.out.println("The storage is empty");
        } else {
            for (Chore sampleChore: storage) {
                System.out.println(sampleChore.getName() + ", " + sampleChore.getImportance() + ", " + sampleChore.getDuration() + " minutes");
                System.out.println();
            }
        }
    }
}
