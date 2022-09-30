public abstract class Mammals extends Animals {
    private String area;
    private int speed;

    public Mammals(String name, int age, String area, int speed) {
        super(name, age);
        setArea(area);
        setSpeed(speed);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = (area != null && !area.isEmpty() && !area.isBlank()) ? area : "неизвестно";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = Math.abs(speed);
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void move();

    public abstract void stroll();
}
