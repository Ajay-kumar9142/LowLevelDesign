package org.example.lowLevelDesign.structuralDesignPattern.compositeDesignPattern.fileSystem;

public class File implements FileSystem {
    public String name;
    public int size;

    public File(String name, int size){
        this.name = name;
        this.size = size;
    }
    @Override
    public void display() {
        System.out.println("File name :"+name+"  ,size : "+size);
    }

    @Override
    public int getSize() {
        return size;
    }
}
