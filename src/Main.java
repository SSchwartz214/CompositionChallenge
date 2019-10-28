public class Main {

    public static void main(String[] args) {


        Stove kitchenAide = new Stove(4, "gas");
        Table woodTable = new Table("wood", 8, false);

        Room kitchen = new Room(kitchenAide, woodTable);

        kitchen.prepareDinner();
        kitchen.getStove().turnOn();
        kitchen.cookMeal();

    }
}
