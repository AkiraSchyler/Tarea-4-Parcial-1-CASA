package house;

public class House{

    public static final int MAX_ROOMS = 10;
    int indexBedRooms = 0;
    int indexRestRooms = 0;

    private Kitchen kitchen;
    private RestRoom[] restRooms = new RestRoom[MAX_ROOMS];
    private BedRoom[] bedRooms = new BedRoom[MAX_ROOMS];
    private Yard yard;
    private LivingRoom livingRoom;

    public void addRoom(BedRoom bedRoom){
        if(indexBedRooms < 10)
            bedRooms[indexBedRooms++] = bedRoom;
        else    
            System.out.println("Ya no hay lugar\n");
    }
    public void addRoom(RestRoom restRoom){
        if(indexBedRooms < 10)
            restRooms[indexRestRooms++] = restRoom;
        else
            System.out.println("Ya no hay lugar\n");
    }
}