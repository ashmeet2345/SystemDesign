package CompositeDesignPattern.Solution1;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    String directoryName;
    List<FileSystem> fileSystems;

    Directory(String name){
        this.directoryName=name;
        fileSystems=new ArrayList<>();
    }

    public void addFileSystems(FileSystem fileSystem){
        fileSystems.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Directory name: "+directoryName);

        for(FileSystem fs: fileSystems){
           fs.ls();
        }
    }
}
