package it.epicode.be;

import java.util.Scanner;

public class registrazioneAudio {
    public static void main(String[]args){
        volume();
    }
    public static void registrazioneAudio() {
        //Audio
        System.out.println("Quatno dura l'audio?");
        Scanner scanner = new Scanner(System.in);
        int durata = scanner.nextInt();
        titolo.titolo();
        System.out.println("----------------------- " + durata + "s");
    scanner.close();
    }
        //volume
        public static void volume() {
            Scanner scanner = new Scanner(System.in);
            int volume = 50;
            System.out.println("Il volume è al 50%\n[0] Invia \n[1] Aumenta o diminuisce il volume ");
            int x = scanner.nextInt();
            switch (x) {
                case 0:
                    registrazioneAudio();
                    break;
                case 1:
                    System.out.println("Di quanto vorresti incrementare l'audio?");
                    Scanner scanner1 = new Scanner(System.in);
                    int y = scanner1.nextInt();
                    if ( y + volume <= 0 && y + volume >= 100) {
                        System.out.println("Input non valido");
                    } else {
                        volume = volume + y;
                        System.out.println("Il volume è al " + volume + "%");
                        registrazioneAudio();
                        
                    }
            }
            scanner.close();

        }
}
