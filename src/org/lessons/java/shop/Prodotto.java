package org.lessons.java.shop;
import java.util.Random;

public class Prodotto {

    Random randomNum = new Random();


    private int codice;
    private String nome;
    private String descrizione;
    private float prezzo;
    private float iva;

    

    public Prodotto(String nome, String descrizione, float prezzo, int iva){
        this.codice = randomNum.nextInt(50);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public Prodotto(){
        this.codice = randomNum.nextInt(50);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }





    public int getCodice() {
        return codice;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
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
