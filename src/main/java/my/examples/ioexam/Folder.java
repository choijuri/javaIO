package my.examples.ioexam;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Node {
    private List<Node> list;

    public Folder(String parentFolder, String name){
        super(parentFolder, name);
        list = new ArrayList<>();
    }

    public void add(File file){
        list.add(file);
    }

    public void add(Folder folder){
        list.add(folder);
    }

    public List<Folder> getFolders(){
        List<Folder> folderlist = new ArrayList<>();
        for(Node node : list){
            if(node instanceof Folder){
                folderlist.add((Folder)node);
            }
        }
        return folderlist;
    }

    public List<File> getFiles(){
        List<File> fileList = new ArrayList<>();
        for(Node node : list){
            if(node instanceof File){
                fileList.add((File)node);
            }
        }
        return fileList;
    }



}
