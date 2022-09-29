public class Bus extends Transport{
    public Bus(String brand, String model, int prodYear, String prodCountry, String color, int maxSpeed) {
        super(brand, model, prodYear, prodCountry, color, maxSpeed);
    }

    public void refill() {
        System.out.print("Автобус " + getBrand() + ": ");
        if (this.getFuel() != null && this.getFuel().equals("дизель")) {
            System.out.println("Заправляется дизелем на заправке.");
            return;
        }
        if (this.getFuel() != null && this.getFuel().equals("бензин")) {
            System.out.println("Заправляется бензином на заправке.");
            return;
        }
        System.out.println("Нет данных о заправке.");
    }

    @Override
    public String toString() {
        return "Автобус " + getBrand() + " модель " + getModel() + ", " + getProdYear() + " года, произведен в стране "
                + getProdCountry() + ". Цвет " + getColor() + ", максимальная скорость " + getMaxSpeed() + "км/ч.";
    }
}
