package org.lessons.java.shop;
import java.util.Random;

public class Prodotto {

    Random randomNum = new Random();


    public int codice;
    public String nome;
    public String descrizione;
    public float prezzo;
    public float iva;

    

    public Prodotto(String nome, String descrizione, float prezzo, int iva){
        this.codice = randomNum.nextInt(50);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }


    public float prezzoBase(){
        return this.prezzo;
    } 

    public float prezzoIva(){
         return this.prezzo = prezzo + (prezzo * (iva / 100));

    }

    public String nomeEsteso(){
        return codice + "-" + nome;
    }




}
