public class Stove {

    private int numOfBurners;
    private String heatType;

    public Stove(int numOfBurners, String heatType) {
        this.numOfBurners = numOfBurners;
        this.heatType = heatType;
    }

    public void turnOn() {
        System.out.println("Turing on stove");
    }
}
