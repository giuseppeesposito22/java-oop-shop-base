package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {
        Prodotto libro = new Prodotto("libro1", "lorem", 22.5f, 22);

       
        System.out.println(libro.prezzoBase());
        System.out.println(libro.prezzoIva());
        System.out.println(libro.nomeEsteso());


    }
}
