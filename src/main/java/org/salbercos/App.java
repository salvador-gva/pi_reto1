package org.salbercos;

import java.util.Scanner;

public class App {
     public static void main(String[] args) {
         System.out.println("=== PRUEBA 1: CREAR NOTICIAS ===");
         Noticia n1 = new Noticia(20211030, 1005, "Noticia1");
         Noticia n2 = new Noticia(20211130, 1230, "Noticia2");
         Noticia n3 = new Noticia(20210915, 900, "Noticia3");


        System.out.println("=== PRUEBA 2: INSERTAR ===");
        Periodico p = new Periodico();
        p.insertar(n1);
        p.insertar(n2);
        p.insertar(n3);

        System.out.println("=== PRUEBA 3: PRIMERA NOTICIA ===");
        System.out.println(p.primeraNoticia(30,10,2021));

        System.out.println("=== PRUEBA 4: MÁS POPULARES ===");
        System.out.println(p.masPopulares());

        System.out.println("=== PRUEBA 5: BORRAR ANTERIORES ===");
        p.borrarAnteriores(30,10,2021); //Borra Noticia3
        System.out.println(" - Borradas las noticias anteriores \n");

        System.out.printf(" - Lista de noticias restantes:\n");
        p.mostrar();

    }
}

//Salvador Bernia Costa