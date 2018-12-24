package my.examples.ioexam;

import java.util.List;

public class IOExam03 {
    public static void main(String[] args) {
        Folder folder = FileManager.scan("C:\\Users\\chlwn\\Desktop");
        System.out.println(folder);
        List<Folder> folders = folder.getFolders();
        for(Folder folder1 : folders){
            System.out.println(folder1.getParentFolder()+"\\" + folder1.getName());
        }


    }
}


