import java.util.Objects;

public class FlyingBirds extends Birds{
    private String moveType;
    private final String form;

    public FlyingBirds(String form, String name, int age, String area, String moveType) {
        super(name, age, area);
        this.form = (form != null && !form.isEmpty() && !form.isBlank()) ? form : "летающая птица";
        setMoveType(moveType);
    }

    public String getForm() {
        return form;
    }

    public String getMoveType() {
        return moveType;
    }

    public void setMoveType(String moveType) {
        this.moveType = (moveType != null && !moveType.isEmpty() && !moveType.isBlank()) ? moveType : "неизвестно";
    }

    @Override
    public void eat() {
        System.out.println("Ем");
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
    public void hunt() {
        System.out.println("Охочусь");
    }

    public void fly() {
        System.out.println("Летаю");
    }

    @Override
    public String toString() {
        return "Птица " + getForm() + " по кличке " + getName() + ", " + getAge() + " лет. Среда обитания "
                + getArea() + ", тип перемещения " + getMoveType() + ". Относится к классу " + getClass();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlyingBirds that = (FlyingBirds) o;
        return form.equals(that.form);
    }

}
