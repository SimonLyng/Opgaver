import java.util.ArrayList;

//2.D
public class Building {
    private final ArrayList<Room> rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    //2.E
    public Building(ArrayList<Room> _rooms, int _numberOfBathrooms, int _numberOfFloors, boolean _isOfficeBuilding){
        this.rooms = _rooms;
        this.numberOfBathrooms = _numberOfBathrooms;
        this.numberOfFloors = _numberOfFloors;
        this.isOfficeBuilding = _isOfficeBuilding;
    }

    //2.F
    public ArrayList<Room> getRooms(){
        return rooms;
    }
    public int getNumberOfBathrooms(){
        return numberOfBathrooms;
    }
    public int getNumberOfFloors() {
        return numberOfFloors;
    }
    public boolean getIsOfficeBuilding(){
        return isOfficeBuilding;
    }
}