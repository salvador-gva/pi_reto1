package org.salbercos;
public class Noticia {

    //Atributos
    private int fecha;
    private int hora;
    private String textoNoticia;
    private int numLecturas;

    //Cosntructor
    public Noticia(int fecha,int hora,String textoNoticia){
        this.fecha = fecha;
        this.hora = hora;
        this.textoNoticia = textoNoticia;
        this.numLecturas = 0; //Debe empezar el contador por 0
    }

    //Getter y Setter
    public int getFecha(){
        return fecha;
    }
    public void setFecha(int fecha){
        this.fecha = fecha;
    }
    public int getHora(){
        return hora;
    }
    public void setHora(int hora){
        this.hora = hora;
    }
    public String getTextoNoticia(){
        return textoNoticia;
    }
    public void setTextoNoticia(String textoNoticia){
        this.textoNoticia = textoNoticia;
    }
    public int getNumLecturas(){
        return numLecturas;
    }
    public void setNumLecturas(int numLecturas){
        this.numLecturas = numLecturas;
    }

    //Incrementar el número de lecturas
    public void incrementarLecturas(){
        this.numLecturas++;
    }

    // Comprobar si una fecha dada por d, m, a es igual a la fecha de la noticia actual
    // Necesitamos convertir la fecha dada en un número entero para poder compararla con la fecha de la noticia actual
    public boolean igualFecha(int d, int m, int a){
        int calcFecha = a * 10000 + m * 100 + d;
        return this.fecha == calcFecha;
    }

    // Devuelve un String con la información de la noticia
    public String toString() {
        String s = "";
        s+=fecha%100 + "/" + (fecha/100)%100+ "/" + (fecha/10000) + " - ";
        s+=(hora/100) + ":" + (hora%100) + "\n";
        s+=textoNoticia + "\n";
        s+="Leída " + numLecturas + " veces\n";
        return s;
    }
}

//Salvador Bernia Costa
