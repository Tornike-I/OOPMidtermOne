package week9.tornike_kadeishvili_1.task3;

public class Chore {
    private String name, importance;
    private int duration; // it is measured in the number of minutes
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getImportance() {
        return importance;
    }
    public void setImportance(String importance) {
        this.importance = importance;
    }
}
