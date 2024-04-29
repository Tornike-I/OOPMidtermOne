package week9.tornike_kadeishvili_1.task3;

public class ChoresTester {
    public static void main(String[] args) {
        Chore chore1 = new Chore();
        chore1.setName("Doing the dishes");
        chore1.setDuration(35); //doing the dishes will require 35 minutes
        chore1.setImportance("moderately urgent");
        Chore chore2 = new Chore();
        chore2.setName("Clean up the living room");
        chore2.setDuration(15); //cleaning up the living room will require 15 minutes
        chore2.setImportance("not urgent");
        Chore chore3 = new Chore();
        chore3.setName("Doing laundry");
        chore3.setDuration(10);
        chore3.setImportance("very urgent");
        CMS cms = new CMS();
        cms.addChore(chore1);
        cms.addChore(chore2);
        cms.addChore(chore3);
        cms.removeChore(chore3); //chore 3 has been completed and therefore removed from the list
        cms.printStorage();
    }
}
