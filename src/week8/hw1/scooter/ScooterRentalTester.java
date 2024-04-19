package week8.hw1.scooter;

public class ScooterRentalTester {

    public static void main(String[] args) {
        // Creating a rental company for testing
        RentalCompany rentalCompany = new RentalCompany();

        // Creating a new scooter named "Scooter 1" and add it to the rental company
        Scooter scooter = new Scooter();
        scooter.setModel("Scooter 1");
        rentalCompany.addScooter(scooter);

        // Renting the scooter and going from home to the University coordinates
        rentalCompany.rentScooter(scooter.getId());
        System.out.println("Scooter rented. Going from home to the University...");

        // Once at the university leave the scooter at the given coordinates
        rentalCompany.returnScooter(scooter.getId(), 41.7121106, 44.7489232);
        System.out.println("Scooter left at the University.");

        // Let one hour pass using sleep function, (its usful to change this number for testing)
        try {
            Thread.sleep(1000 * 60 * 60); // 1 hour = 1000 milliseconds * 60 seconds * 60 minutes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Renting the scooter again and going back home
        rentalCompany.rentScooter(scooter.getId());
        System.out.println("Scooter rented again. Going from the University back home...");

        // After reaching home, leave the scooter at the coordinates of the home
        rentalCompany.returnScooter(scooter.getId(), 41.711299, 44.758267);
        System.out.println("Scooter left near home.");
    }
}
