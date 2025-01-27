package org.example.lowLevelDesign.structuralDesignPattern.compositeDesignPattern.fileSystem;

public class Client {
    public static void main(String[] args) {
        File file1 = new File("file1", 10);
        File file2 = new File("file2", 8);
        File file3 = new File("file3", 12);

        Folder folder1 = new Folder("folder1");
        Folder folder2 = new Folder("folder2");
        Folder root = new Folder("root");

        root.add(folder1);
        root.add(folder2);
        folder1.add(file1);
        folder1.add(file3);
        folder2.add(file2);

        System.out.println("Printing file structure : ");
        root.display();


    }

}
