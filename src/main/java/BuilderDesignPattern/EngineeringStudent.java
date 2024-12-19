package BuilderDesignPattern;

public class EngineeringStudent {
    StudentBuilder studentBuilder;

    EngineeringStudent(int rollNumber, String name, String fathersName){
        initialize(rollNumber,name,fathersName);
    }

    public void initialize(int rollNumber, String name, String fathersName){
        studentBuilder.setRollNumner(rollNumber)
                .setName(name)
                .setFathersName(fathersName)
                .setCourse("Engineering")
                .build();
    }
}
