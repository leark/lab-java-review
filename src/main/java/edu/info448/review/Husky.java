package edu.info448.review;

public class Husky extends Dog implements Huggable {
    
    public Husky(String name) {
        super(name, "Husky");
    }

    public void pullSled() {
        System.out.println(super.toString() + " is pulling a sled!");
    }

    public void bark() {
        System.out.println(super.toString() + " says: woof");
    }

    public void hug() {
        System.out.println(super.toString() + " hugs you! Awww..");
    }
}