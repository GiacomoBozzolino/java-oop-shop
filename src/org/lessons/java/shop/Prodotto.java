package org.lessons.java.shop;

public class Prodotto {
	//dichiaro le variabili
	private int codice;
	private String nome;
	private String descrizione;
	private float prezzo;
	private int iva;
	
	
	//creo il costruttore
	public Prodotto(int codice, String nome, String descrizione, float prezzo, int iva) {
		 setCodice(codice);
		 setNome(nome);
		 setDescrizione(descrizione);
		 setPrezzo(prezzo);
		 setIva(iva);
	}
	
	//metodo get e set
	
	public int getCodice() {
		return codice;
	}
	
	public void setCodice(int codice) {
		this.codice = codice;
	}
	   // Metodo getter e setter per il nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Metodo getter e setter per la descrizione
    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    // Metodo getter e setter per il prezzo
    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    // Metodo getter e setter per l'IVA
    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String toString() {
		return "Prodotto:\n"
				+ "codice:" + " " + getCodice() + "\n"
				+ "nome:" + " " + getNome() + "\n"
				+ "descrizione:" + " " + getDescrizione() + "\n"
				+ "prezzo:" + " " + getPrezzo() + "euro" + "\n"
				+ "iva:" + " " + getIva() + "%\n";
				
	}
	

}
