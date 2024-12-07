package j_composite_pattern;

import java.util.*;

public class Directory extends AbstractFile{
    private String name;
    private int depth = 0;
    private List<AbstractFile> entries = new ArrayList<AbstractFile>();

    public Directory(String name) {
        this.name = name;
    }

    public void addEntry(AbstractFile entry) {
        entries.add(entry);
        entry.setDepth(depth+1);
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void remove(AbstractFile entry) {
        entries.remove(entry);
    }

    public String getName() {
        return name;
    }

    public int getSize(){
        int size = 0;
        for (AbstractFile entry : entries) {
            size += entry.getSize();
        }
        return size;
    }

    public void print(){
        for (int i=0;i<depth;i++)
            System.out.print("\t");
        System.out.println("[Directory] " + name + ", Size: " + getSize());

        for (AbstractFile entry : entries) {
            entry.print();
        }
    }
}
