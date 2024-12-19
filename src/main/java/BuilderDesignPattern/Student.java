package BuilderDesignPattern;

public class Student {

    int rollNumner;
    int age;
    String name;
    String fathersName;
    String mothersName;
    String course;
    String fees;


    public Student(StudentBuilder studentBuilder) {
        this.rollNumner= studentBuilder.rollNumner;
        this.age=studentBuilder.age;
        this.name=studentBuilder.name;
        this.fathersName=studentBuilder.fathersName;
        this.mothersName=studentBuilder.mothersName;
        this.course= studentBuilder.course;
        this.fees= studentBuilder.fees;
    }
}
