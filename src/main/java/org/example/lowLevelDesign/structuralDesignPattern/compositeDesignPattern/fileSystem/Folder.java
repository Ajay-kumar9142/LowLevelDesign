package org.example.lowLevelDesign.structuralDesignPattern.compositeDesignPattern.fileSystem;

import org.example.lowLevelDesign.structuralDesignPattern.compositeDesignPattern.fileSystem.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem {
    String name;
    List<FileSystem> children = new ArrayList<>();

    public Folder(String name){
        this.name = name;
    }

    public void add(FileSystem fileSystem){
        children.add(fileSystem);
    }

    public void remove(FileSystem fileSystem){
        children.remove(fileSystem);
    }
    @Override
    public void display() {
        System.out.println("Folder Name : "+name);
        for(FileSystem child : children){
           child.display();
        }
    }

    @Override
    public int getSize() {
        int totalSize =0;
        for(FileSystem child : children){
            totalSize+= child.getSize();
        }
        return totalSize;
    }
}
