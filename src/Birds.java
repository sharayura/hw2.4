public abstract class Birds extends Animals {
    private String moveType;

    public Birds(String name, int age, String area) {
        super(name, age);
        setArea(area);
    }

    public String getArea() {
        return moveType;
    }

    public void setArea(String area) {
        this.moveType = (area != null && !area.isEmpty() && !area.isBlank()) ? area : "неизвестно";
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void move();

    public abstract void hunt();

}
