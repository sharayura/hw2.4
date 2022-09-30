public abstract class Animals {
    private final String name;
    private int age;

    public Animals(String name, int age) {
        this.name = (name != null && !name.isEmpty() && !name.isBlank()) ? name : "без клички";
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = Math.abs(age);
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void move();


}
