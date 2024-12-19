package BuilderDesignPattern;

public class StudentBuilder {

    int rollNumner;
    int age;
    String name;
    String fathersName;
    String mothersName;
    String course;
    String fees;

    public StudentBuilder setRollNumner(int rollNumner) {
        this.rollNumner = rollNumner;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setFathersName(String fathersName) {
        this.fathersName = fathersName;
        return this;
    }

    public StudentBuilder setMothersName(String mothersName) {
        this.mothersName = mothersName;
        return this;
    }

    public StudentBuilder setCourse(String course) {
        this.course = course;
        return this;
    }

    public StudentBuilder setFees(String fees) {
        this.fees = fees;
        return this;
    }

    public Student build(){
        return new Student(this);
    }
}
