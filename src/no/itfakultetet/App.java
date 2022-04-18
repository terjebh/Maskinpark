package no.itfakultetet;

import java.util.Scanner;

import static java.lang.System.exit;

public class App {

    public static void main(String[] args) {
        String menyvalg = "";
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println("MASKINPARK");
            System.out.println("-".repeat(30));
            System.out.println("1. Legg til ny maskin");
            System.out.println("3. Vis maskiner");
            System.out.println("q. Avslutt3");
            menyvalg = in.nextLine();
            if(menyvalg.equals("q")) {
                System.out.println("Bye....");
                exit (0);
            }
        }


    }

}
