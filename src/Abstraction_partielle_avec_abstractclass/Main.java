package Abstraction_partielle_avec_abstractclass;

public class Main {
    public static void main(String[] args) {
        Animal chien = new Chien();
        chien.son();
        chien.dormir();

        Animal cat = new Cat();
        cat.son();
        cat.dormir();
    }
}
