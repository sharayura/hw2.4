public abstract class Transport {
    private final String brand;
    private final String model;
    private final int prodYear;
    private final String prodCountry;
    private String color;
    private int maxSpeed;

//    static final String[] carFuel = {"бензин","дизель","электричество"};
//    static final String[] busFuel = {"бензин","дизель"};
//    static final String[] trainFuel = {"дизель"};
    private String fuel;

    public Transport(String brand, String model, int prodYear, String prodCountry, String color, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.prodYear = prodYear;
        this.prodCountry = prodCountry;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public abstract void refill();

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProdYear() {
        return prodYear;
    }

    public String getProdCountry() {
        return prodCountry;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        if (color != null && !color.isBlank() && !color.isEmpty()) {
            this.color = color;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 20) {
            this.maxSpeed = maxSpeed;
        }
    }
}
