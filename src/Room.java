public class Room {

    private Stove stove;
    private Table table;

    public Room(Stove stove, Table table) {
        this.stove = stove;
        this.table = table;
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
