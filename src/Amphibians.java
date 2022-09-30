public class Amphibians extends Animals {
    private String area;
    private final String form;

    public Amphibians(String form, String name, int age, String area) {
        super(name, age);
        this.form = (form != null && !form.isEmpty() && !form.isBlank()) ? form : "земноводное";
        setArea(area);
    }

    public String getForm() {
        return form;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = (area != null && !area.isEmpty() && !area.isBlank()) ? area : "неизвестно";
    }

    @Override
    public void eat() {
        System.out.println("Ем добычу");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю в укрытии");
    }

    @Override
    public void move() {
        System.out.println("Передвигаюсь");
    }

    public void hunt() {
        System.out.println("Ловлю");
    }

    @Override
    public String toString() {
        return "Животное " + getForm() + " по кличке " + getName() + ", " + getAge() + " лет. Среда обитания "
                + getArea() + ". Относится к классу " + getClass();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibians that = (Amphibians) o;
        return form.equals(that.form);
    }
}
