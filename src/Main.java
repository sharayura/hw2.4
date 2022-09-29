public class Main {
    public static void main(String[] args) {
        Car honda = new Car("Honda", "Civic", null, "Yellow", 220, 2013,
                "Japan", "auto", null, "5", null, 5);


        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия",
                null, 301, 3500, 0, "Белорусский вокзал",
                "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия",
                null, 270, 1700, 0, "Ленинградский вокзал",
                "Ленинград-Пассажирский", 8);
        System.out.println(lastochka);
        System.out.println(leningrad);

        Bus mercedes = new Bus("Mercedes", "A45", 2009, "Германия", "зеленый", 220);
        Bus ikarus = new Bus("Икарус", "2056", 1996, "Болгария", "красный", 180);
        Bus bmw = new Bus("BMW", "45a", 2012, "Германия", "желтый", 200);
        System.out.println(mercedes);
        System.out.println(ikarus);
        System.out.println(bmw);

        honda.setFuel("электричество");
        lastochka.setFuel("дизель");
        mercedes.setFuel("бензин");

        honda.refill();
        lastochka.refill();
        leningrad.refill();
        mercedes.refill();
        bmw.refill();

    }
}