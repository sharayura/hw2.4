public class Bus extends Transport{
    public Bus(String brand, String model, int prodYear, String prodCountry, String color, int maxSpeed) {
        super(brand, model, prodYear, prodCountry, color, maxSpeed);
    }

    @Override
    public String toString() {
        return "Автобус " + getBrand() + " модель " + getModel() + ", " + getProdYear() + " года, произведен в стране "
                + getProdCountry() + ". Цвет " + getColor() + ", максимальная скорость " + getMaxSpeed() + "км/ч.";
    }
}
