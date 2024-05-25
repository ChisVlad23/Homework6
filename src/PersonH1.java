// 1) create an object that represents a Person

public class PersonH1 {
    private String name;
    private Integer age;
    private boolean married;

    public PersonH1(String name, Integer age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    String getName() {
        return name;
    }

    Integer getAge() {
        return age;
    }

    boolean getMarried() {
        return married;
    }

    @Override
    public String toString() {
        return "PersonH1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", married=" + married +
                '}';
    }
}
