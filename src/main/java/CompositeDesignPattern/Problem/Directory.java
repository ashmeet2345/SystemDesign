package CompositeDesignPattern.Problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Directory {
    String directoryName;
    List<Object> objectList;

    Directory(String name){
        this.directoryName=name;
        objectList=new ArrayList<>();
    }

    public void addObject(Object object){
        objectList.add(object);
    }

    public void ls(){
        System.out.println("Directory name: "+directoryName);

        for(Object object:objectList){
            if(object instanceof File){
                ((File) object).ls();
            } else if(object instanceof Directory){
                ((Directory) object).ls();
            }
        }
    }
}
