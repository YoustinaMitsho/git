import java.util.Objects;

public class trial {
    private String name;
    private int age;

    public trial(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        trial trial = (trial) o;
        return age == trial.age && Objects.equals(name, trial.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}