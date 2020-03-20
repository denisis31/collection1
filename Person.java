
public class Person {

    private String name; // имя
    private int age; // возраст
    private boolean male; // true - мужской пол

    public Person(String name, int age, boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
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

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    @Override
    public String toString() {
        return "Хозяин{" +
                "имя='" + name + '\'' +
                ", возраст=" + age +
                ", пол=" + (male ? "мужской" : "женский") +
                '}';
    }

}
