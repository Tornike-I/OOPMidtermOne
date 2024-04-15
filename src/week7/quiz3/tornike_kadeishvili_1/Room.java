package week7.quiz3.tornike_kadeishvili_1;


class Room {
    private int roomNumber;
    private String occupantId;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.occupantId = null;
    }

    public void checkIn(String occupantId) {
        this.occupantId = occupantId;
        //System.out.println("Occupant " + occupantId + " checked in to room " + roomNumber);
    }

    public void checkOut() {
        //System.out.println("Occupant " + occupantId + " checked out from room " + roomNumber);
        this.occupantId = null;
    }

    public String getOccupantId() {
        return occupantId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
