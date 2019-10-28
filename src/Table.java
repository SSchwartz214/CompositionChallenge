public class Table {

    private String material;
    private int capacity;
    private boolean isSet;

    public Table(String material, int capacity, boolean isSet) {
        this.material = material;
        this.capacity = capacity;
        this.isSet = isSet;
    }

    private String getMaterial() {
        return material;
    }

    private void setMaterial(String material) {
        this.material = material;
    }

    private int getCapacity() {
        return capacity;
    }

    private void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isSet(int time) {
        if (time > 5) {
            return true;
        } else {
            return false;
        }
    }

    private void setSet(boolean set) {
        isSet = set;
    }
}
