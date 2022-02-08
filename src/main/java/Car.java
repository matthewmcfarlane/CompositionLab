public class Car extends Vehicle{

    private Engine engine;
    private Gearbox gearbox;
    private int price;

    public Car(String make, String model, String colour, Engine engine, Gearbox gearbox, int price) {
        super(make, model, colour);
        this.engine = engine;
        this.gearbox = gearbox;
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Gearbox getGearbox() {
        return gearbox;
    }

    public void setGearbox(Gearbox gearbox) {
        this.gearbox = gearbox;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfGears() {
        return this.gearbox.getNoOfGears();
    }

    public int getEngineSize() {
        return this.engine.getSize();
    }

    public String getEngineFuelType() {
        return this.engine.getFuelType();
    }

}
