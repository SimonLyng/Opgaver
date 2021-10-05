public class Main {
    static ArrayList<Room> rooms;
    static int numberOfLamps;
    public static void main(String[] args) {
       //1
        Driver d1 = new Driver("Simon", 21);
        Car c1 = new Car("Audi","A3",2021,"Sportsback","Simon");
        Car c2 = new Car("Ford","Mustang",1969,"Fastback","Simon");
        c1.setDriver(d1);
        c2.setDriver(d1);
        System.out.println(c1);
        System.out.println(d1);
        System.out.println(c2);
        System.out.println(d1);
        //2
        Room r1 = new Room(4,2,1,2);
        Room r2 = new Room(4,1,2,1);
        Room r3 = new Room(4,3,4,2);

        rooms.add(room);
        rooms.add(room1);
        rooms.add(room2);

        //2.I
        Building building = new Building(rooms, 2, 2, true);

        for(Room _room : rooms){
            numberOfLamps += _room.getNumberOfLamps();
        }
        System.out.println("total number of lamps "+numberOfLamps);

        //2.K
        if(building.getNumberOfFloors() > building.getRooms().size()){
            System.out.println("This is an odd building");
        }
    }
}