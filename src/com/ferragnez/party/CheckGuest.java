/*
* creare e inizializzare l’array contenente i nomi degli invitati

* chiedere all’utente come si chiama

* verificare che il nome sia presente nella lista
 (:exclamation:ATTENZIONE: in Java per confrontare due stringhe non posso usare ==, ma devo usare il metodo equals(): esempio qui)

* lasciarlo entrare o rispedirlo cortesemente da dove è venuto :sunglasses:

* Bonus: se avete usato il ciclo for per cercare il nome nella lista nella consegna base, implementare lo stesso programma usando il ciclo while, e viceversa

* */

package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // creazione array invitati

        String[] invitati={"Dua Lipa","Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        // chiedere all' utente come si chiama

        System.out.print("Inserisci il tuo nome e cognome : ");
        String name = scanner.nextLine();
        // verificare se il nome è nella lista
        boolean presente=false;
        int i=0;
        while(!presente && i<invitati.length){
            if(invitati[i].equals(name)){
                presente=true;
                break;
            }
            i++;
        }


        /*
         for(int i=0;i< invitati.length;i++){
            if(invitati[i].equals(name)){
                presente=true;
                break;
            }
        }
         */


        //output
        if(presente) {
            System.out.println(name+" presente nella lista");

        }else {
            System.out.println(name+" non presente nella lista");
        }
    }
}

