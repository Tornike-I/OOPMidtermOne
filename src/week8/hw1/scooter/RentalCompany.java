package week8.hw1.scooter;

import java.util.ArrayList;
import java.util.List;

public class RentalCompany {

    private int uid = 0;

    List<Scooter> scooters = new ArrayList<>();

    public List<Scooter> availableScooters() {
        List<Scooter> result = new ArrayList<>();
        for (Scooter scooter: scooters) {
            if (scooter.isAvailable()) {
                result.add(scooter);
            }
        }
        return result;
    }

    public void addScooter(Scooter scooter) {
        scooter.setId(uid++);
        scooters.add(scooter);
    }

    public boolean removeScooter(int id) {
        boolean removed = false;
        for (Scooter scooter: scooters) {
            if (scooter.getId() == id) {
                scooters.remove(scooter);
                removed = true;
                break;
            }
        }
        return removed;
    }

    public void rentScooter(int id) {
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id && scooter.isAvailable()) {
                scooter.setAvailable(false);
                System.out.println("Scooter rented: " + scooter.getModel());
                return;
            }
        }
        System.out.println("Scooter with ID " + id + " is not available for rent.");
    }

    public void returnScooter(int id, double x, double y) {
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id) {
                scooter.setAvailable(true);
                scooter.setX(x);
                scooter.setY(y);
                System.out.println("Scooter returned: " + scooter.getModel());
                return;
            }
        }
        System.out.println("Scooter with ID " + id + " not found.");
    }

    public void displayAllScooters() {
        System.out.println("All Scooters:");
        for (Scooter scooter : scooters) {
            System.out.println(scooter);
        }
    }
}