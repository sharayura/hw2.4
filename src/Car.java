import java.time.LocalDate;
import java.util.regex.Pattern;


public class Car extends Transport {
    private Double volume;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private String seasonRubber;
    private final Integer seatsNumber;
    private Insurance insurance;

    public Insurance getInsurance() {
        return insurance;
    }

    public Car(String brand,
               String model,
               Double volume,
               String color,
               int maxSpeed,
               int prodYear,
               String prodCountry,
               String transmission,
               String bodyType,
               String regNumber,
               String seasonRubber,
               Integer seatsNumber) {
        super(brand, model, prodYear, prodCountry, color, maxSpeed);
        this.volume = volume;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.regNumber = regNumber;
        this.seasonRubber = seasonRubber;
        this.seatsNumber = seatsNumber;
        insurance = new Insurance();
    }

    public class Insurance {
        private LocalDate insTerm;
        private int insPrice;
        private String insNumber;

        public Insurance(LocalDate insTerm, int insPrice, String insNumber) {
            this.insTerm = insTerm;
            this.insPrice = insPrice;
            this.insNumber = insNumber;
        }

        public Insurance() {
            this(LocalDate.now().plusYears(1), 10000, "123456789");
        }

        public LocalDate getInsTerm() {
            return insTerm;
        }

        public int getInsPrice() {
            return insPrice;
        }

        public String getInsNumber() {
            return insNumber;
        }

        public void setInsTerm(int year, int month, int day) {
            this.insTerm = LocalDate.of(year, month, day);
        }

        public void setInsPrice(int insPrice) {
            this.insPrice = insPrice;
        }

        public void setInsNumber(String insNumber) {
            if (insNumber.length() == 9) {
                this.insNumber = insNumber;
            }
        }

        public void checkInsTerm() {
            if (LocalDate.now().isAfter(insTerm)) {
                System.out.println("Страховка просрочена");
            }
        }
    }

    public Double getVolume() {
        return volume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getSeasonRubber() {
        return seasonRubber;
    }

    public Integer getSeatsNumber() {
        return seatsNumber;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegNumber(String regNumber) {
        if (Pattern.matches("[а-я]\\d{3}[а-я]{2}\\d{3}", regNumber)) {
            this.regNumber = regNumber;
        } else {
            this.regNumber = "х000хх000";
        }
    }

    public void setSeasonRubber() {
        int month = LocalDate.now().getMonthValue();
        this.seasonRubber = (month > 3 && month < 11) ? "летняя" : "зимняя";
    }
}
