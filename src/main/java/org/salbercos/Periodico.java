package org.salbercos;
import java.util.ArrayList;

public class Periodico {

    //Atributos
    private ArrayList<Noticia> noticias;
    private int numNoticias;

    //Constructor
    public Periodico() {
        noticias = new ArrayList<Noticia>();
        numNoticias = 0;
    }

    //Metodos

    // Inserta una noticia
    public void insertar(Noticia n) {
        noticias.add(n); //añadir al arraylist
        numNoticias++; //aumentar el contador
    }

    // Devuelva la primera noticia
    public Noticia primeraNoticia(int d, int m, int a) {

        //Foreach para comparar la noticia con la fecha
        for (Noticia noticia : noticias) {
            if (noticia.igualFecha(d, m, a)) {
                return noticia;
            }
        }
        return null;
    }

    // Imprimir las noticias más populares
    public boolean masPopulares() {

        //Recorrido del ArrayList
        for (int i = 0; i < numNoticias; i++) {
            //Imprimir datos
            System.out.println(noticias.get(i).toString());
        }
        return false;
    }

    // Borrar noticias anteriores a una fecha
    public void borrarAnteriores(int d, int m, int a){

        //Comprobación de fecha
        int fechaLimite = a * 10000 + m * 100 + d;

        //Recorrido del arraylist y borrar la fecha que coincide
        for (int i = 0; i < noticias.size(); i++) {
            if (noticias.get(i).getFecha() < fechaLimite) {
                noticias.remove(i);
                numNoticias--;
                i--;
            }
        }
    }

    // Mostrar todas las noticias
    public void mostrar() {
        for (int i = 0; i < numNoticias; i++) {
            System.out.println(noticias.get(i).toString());
        }
    }
}

//Salvador Bernia Costa