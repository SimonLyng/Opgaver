public class Room {
    int Walls;
    int numberOfDoors;
    int numberOfLamps;
    int numberOfWindows;

    public Room(int walls, int numberOfDoors, int numberOfLamps, int numberOfWindows) {
        Walls = walls;
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    public int getWalls() {
        return Walls;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }
}
