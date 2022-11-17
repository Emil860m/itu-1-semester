public class RoomAlreadyBookedException extends RuntimeException {
    int floor;
    int room;
    public RoomAlreadyBookedException(int requestedFloor, int requestedRoom) {
        super("Room already booked");
        floor = requestedFloor;
        room = requestedRoom;
    }
    
    public String getRoom() {
        return "Requested room: floor " + floor + ", room " + room;
    }
}