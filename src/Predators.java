public class Predators extends Mammals {
    private String food;
    private final String form;

    public Predators(String form, String name, int age, String area, int speed, String food) {
        super(name, age, area, speed);
        this.form = (form != null && !form.isEmpty() && !form.isBlank()) ? form : "хищник";
        setFood(food);
    }

    public String getForm() {
        return form;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = (food != null && !food.isEmpty() && !food.isBlank()) ? food : "неизвестно";
    }

    @Override
    public void eat() {
        System.out.println("Ем что нашел");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю");
    }

    @Override
    public void move() {
        System.out.println("Передвигаюсь");
    }

    @Override
    public void stroll() {
        System.out.println("Гуляю");
    }

    public void hunt() {
        System.out.println("Охочусь");
    }

    @Override
    public String toString() {
        return "Животное " + getForm() + " по кличке " + getName() + ", " + getAge() + " лет. Среда обитания "
                + getArea() + ", максимальная скорость " + getSpeed() + " км/ч, тип пищи " + getFood()
                + ". Относится к классу " + getClass();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predators that = (Predators) o;
        return form.equals(that.form);
    }
}
