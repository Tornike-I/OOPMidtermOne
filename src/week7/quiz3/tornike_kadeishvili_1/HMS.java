package week7.quiz3.tornike_kadeishvili_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class HMS {
    private Map<Integer, Room> rooms;
    private Map<String, Room> guests;

    public HMS() {
        this.rooms = new HashMap<>();
        this.guests = new HashMap<>();
        // Initialize rooms from 1 to 100
        for (int i = 1; i <= 100; i++) {
            rooms.put(i, new Room(i));
        }
    }

    public void checkIn(String occupantId) {
        // Find an available room for the guest
        for (Map.Entry<Integer, Room> entry : rooms.entrySet()) {
            int roomNumber = entry.getKey();
            Room room = entry.getValue();
            if (room.getOccupantId() == null) {
                room.checkIn(occupantId);
                guests.put(occupantId, room);
                return;
            }
        }
        System.out.println("No available rooms");
    }

    public void checkOut(String occupantId) {
        Room room = guests.get(occupantId);
        if (room == null) {
            System.out.println("Occupant " + occupantId + " not found in any room");
            return;
        }
        room.checkOut();
        guests.remove(occupantId);
    }

    public void displayInfo() {
        for (Map.Entry<String, Room> entry : guests.entrySet()) {
            String occupantId = entry.getKey();
            Room room = entry.getValue();
            if (occupantId != null && room != null) {
                System.out.println("Occupant " + occupantId + " is in room " + room.getRoomNumber());
            }
        }
    }

    public static void main(String[] args) {
        HMS hms = new HMS();

        // Get the list of persons
        List<Person> persons = PersonManager.getPersons();

        // Check-in with your name and surname
        Person yourself = new Person("15", "Tornike", "Kadeishvili");
        hms.checkIn(yourself.getId());

        // Check-in with a person from the list
        if (!persons.isEmpty()) {
            Person randomPerson = persons.get(0);
            hms.checkIn(randomPerson.getId());
        }

        // Display hotel guests and room information
        hms.displayInfo();
    }
}