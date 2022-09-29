public class Train extends Transport {
    private int tripPrice;
    private int tripTime;
    private String startStation;
    private String endStation;
    private int numberOfCarriages;

    public Train(String brand, String model, int prodYear, String prodCountry,
                 String color, int maxSpeed, int tripPrice, int tripTime,
                 String startStation, String endStation, int numberOfCarriages) {
        super(brand, model, prodYear, prodCountry, color, maxSpeed);
        this.tripPrice = tripPrice;
        this.tripTime = tripTime;
        this.startStation = startStation;
        this.endStation = endStation;
        this.numberOfCarriages = numberOfCarriages;
    }

    public int getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(int tripPrice) {
        this.tripPrice = tripPrice;
    }

    public int getTripTime() {
        return tripTime;
    }

    public void setTripTime(int tripTime) {
        this.tripTime = tripTime;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public int getNumberOfCarriages() {
        return numberOfCarriages;
    }

    public void setNumberOfCarriages(int numberOfCarriages) {
        this.numberOfCarriages = numberOfCarriages;
    }

    @Override
    public String toString() {
        return "Поезд " + getBrand() + ", модель " + getModel() + ", " + getProdYear() + " год выпуска в стране "
                + getProdCountry() + ", скорость передвижения – " + getMaxSpeed() + " км/ч, отходит от станции "
                + getStartStation() + " и следует до станции " + getEndStation() + ". Цена поездки - " + getTripPrice()
                + " рублей, в поезде " + getNumberOfCarriages() + " вагонов.";
    }
}
