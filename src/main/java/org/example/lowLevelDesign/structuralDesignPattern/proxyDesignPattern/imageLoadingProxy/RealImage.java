package org.example.lowLevelDesign.structuralDesignPattern.proxyDesignPattern.imageLoadingProxy;

public class RealImage implements Image{
    String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk();
    }

    void loadFromDisk(){
        System.out.println("Load image from the Disk : "+fileName);
    }
    @Override
    public void display() {
        System.out.println("Displaying image : "+fileName);
    }
}
