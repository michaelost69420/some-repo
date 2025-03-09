package ObjectsAndClassesMoreExercise.RawData;

public class Car {

    private String model;
    private int engineSpeed;
    private int enginePower;
    private int cargoWeight;
    private String cargoType;
    private double tier1pressure;
    private int tier1age;
    private double tier2pressure;
    private int tier2age;
    private double tier3pressure;
    private int tier3age;
    private double tier4pressure;
    private int tier4age;

    public Car(String model, int engineSpeed, int enginePower, int cargoWeight, String cargoType, double tier1pressure, int tier1age, double tier2pressure, int tier2age, double tier3pressure, int tier3age, double tier4pressure, int tier4age) {
        this.model = model;
        this.engineSpeed = engineSpeed;
        this.enginePower = enginePower;
        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
        this.tier1pressure = tier1pressure;
        this.tier1age = tier1age;
        this.tier2pressure = tier2pressure;
        this.tier2age = tier2age;
        this.tier3pressure = tier3pressure;
        this.tier3age = tier3age;
        this.tier4pressure = tier4pressure;
        this.tier4age = tier4age;
    }

    public double getTier1pressure() {
        return tier1pressure;
    }

    public double getTier2pressure() {
        return tier2pressure;
    }

    public double getTier3pressure() {
        return tier3pressure;
    }

    public double getTier4pressure() {
        return tier4pressure;
    }

    public String getCargoType() {
        return cargoType;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public String getModel() {
        return model;
    }
}
