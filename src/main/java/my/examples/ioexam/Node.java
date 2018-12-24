package my.examples.ioexam;

public abstract class Node {
    private String parentFolder;
    private String name;
    private long size;

    public Node(String parentFolder, String name) {
        this.name = name;
        this.parentFolder = parentFolder;
    }

    public String getParentFolder() {
        return parentFolder;
    }

    public void setParentFolder(String parentFolder) {
        this.parentFolder = parentFolder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Node{" +
                "parentFolder='" + parentFolder + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
