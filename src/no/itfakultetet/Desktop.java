package no.itfakultetet;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Desktop extends Maskin {

    static int antallDesktop;
    private int ram;
    private int antallDisker;

    public Desktop() {

    }

    public Desktop(String type, String merke, int ram, int antallDisker, int pris, int modell, LocalDate innkjøpt) {
        super(type, merke, ram, antallDisker, pris, modell, innkjøpt);
        Maskin.antallMaskiner++;
        antallDesktop++;
    }

    public static void addNew(String type) {
        Desktop nyDesktop = new Desktop();
        nyDesktop.setType(type);

        Scanner lapIn = new Scanner(System.in);
        System.out.println("Ny Desktop:");
        System.out.print("Merke: ");
        nyDesktop.setMerke(lapIn.nextLine());
        System.out.print("Pris: ");
        nyDesktop.setPris(Integer.parseInt(lapIn.nextLine()));
        System.out.print("GB Ram: ");
        nyDesktop.setRam(Integer.parseInt(lapIn.nextLine()));
        System.out.print("Innkjøpt: ");
        nyDesktop.setInnkjøpt(LocalDate.parse(lapIn.nextLine()));

        lagre(nyDesktop);

    }

    private static void lagre(Desktop nyDesktop) {
        try (FileWriter fil = new FileWriter("data.csv", true)) {
            fil.append(nyDesktop.getType() + "," + nyDesktop.getMerke() + "," + nyDesktop.getPris() + ","
                    + nyDesktop.getRam() + "," + "null" + "," + nyDesktop.getInnkjøpt() + "\n");
            fil.flush();
            fil.close();
            System.out.println("Desktop lagret...");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAntallDisker() {
        return antallDisker;
    }

    public void setAntallDisker(int antallDisker) {
        this.antallDisker = antallDisker;
    }
}
