package it.epicode.be;

import java.util.Scanner;

public class titolo {
    public static void titoloDellaCanzone(){
        System.out.printf("Avvio applicazione\nTitolo della canzone: ");
        Scanner scanner = new Scanner(System.in);
        String titolo = scanner.next();
    }

    public  static void titolo(){
        System.out.println("Riproduco: " + "La canzone");
        System.out.println("------------");
        for(int i = 0; i<3;i++){
            System.out.println("|          |");
        }
        System.out.println("------------");
    }
    public static void main(String[]args){
        titolo();
    }
}
