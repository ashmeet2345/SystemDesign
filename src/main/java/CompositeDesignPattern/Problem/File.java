package CompositeDesignPattern.Problem;

public class File {

    String fileName;
    File(String name){
        this.fileName=name;
    }

    public void ls(){
        System.out.println("File name: "+fileName);
    }
}
