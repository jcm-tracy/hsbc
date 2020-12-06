import java.math.BigDecimal;

public class Person {

    String name;
    int    age;
    BigDecimal saraly;

    public Person(String name, int age, BigDecimal saraly) {
        this.name = name;
        this.age = age;
        this.saraly = saraly;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getSaraly() {
        return saraly;
    }

    public void setSaraly(BigDecimal saraly) {
        this.saraly = saraly;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", saraly=" + saraly +
                '}';
    }
}
