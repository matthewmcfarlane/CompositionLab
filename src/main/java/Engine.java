public class Engine {

    private String fuelType;
    private int size;

    public Engine(String fuelType, int size) {
        this.fuelType = fuelType;
        this.size = size;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
