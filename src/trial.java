public class trial {
    private String name;
    private int age;

    public trial(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "trial{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}