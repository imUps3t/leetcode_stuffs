package me.ups3t.leetcodestuffs.learning.templates;

public class Generics<T> {

    private T type;

    public Generics(T type) {
        this.type = type;
    }

    public void print() {
        System.out.println(type.toString());
    }

    public static void main(String[] args) {
        Generics<String> generic = new Generics<>("Hello, World!");
        generic.print();
    }

}
