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
        private int[] insTerm = new int[3];
        private int insPrice;
        private String insNumber;

        public Insurance(int[] insTerm, int insPrice, String insNumber) {
            this.insTerm = insTerm;
            this.insPrice = insPrice;
            this.insNumber = insNumber;
        }

        public Insurance() {
            this(new int[]{LocalDate.now().getYear() + 1, LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth()},
                    10000, "123456789");
        }

        public int[] getInsTerm() {
            return insTerm;
        }

        public int getInsPrice() {
            return insPrice;
        }

        public String getInsNumber() {
            return insNumber;
        }

        public void setInsTerm(int year, int month, int day) {
            this.insTerm[0] = year;
            this.insTerm[1] = month;
            this.insTerm[2] = day;
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
            if ((insTerm[0] * 10000 + insTerm[1] * 100 + insTerm[2]) <= LocalDate.now().getYear() * 10000 +
                    LocalDate.now().getMonthValue() * 100 + LocalDate.now().getDayOfMonth()) {

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
