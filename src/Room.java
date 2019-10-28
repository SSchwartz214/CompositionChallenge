public class Room {

    private Stove stove;
    private Table table;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;

    public Room(Stove stove, Table table, Wall wall1, Wall wall2, Wall wall3, Wall wall4) {
        this.stove = stove;
        this.table = table;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
    }

    public Stove getStove() {
        return stove;
    }

    public void cookMeal() {
        getStove().turnOn();
        System.out.println("Cooking dinner");
    }

    public void prepareDinner() {
        table.isSet(6);
        System.out.println("Preparing dinner");
    }



}
