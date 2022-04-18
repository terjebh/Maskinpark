package no.itfakultetet;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class Laptop extends Maskin {
    static int antallLaptop;
    private int ram;
    private int antallDisker, batteritid;
    private float skjermstørrelse;

    public Laptop() {
    }

    public Laptop(String type, String merke, int ram, int antallDisker, int pris, int modell, LocalDate innkjøpt) {
        super(type, merke, ram, antallDisker, pris, modell, innkjøpt);
        Maskin.antallMaskiner++;
        antallLaptop++;
    }

    public static void addNew() {
        Laptop nyLaptop = new Laptop();
        Scanner lapIn = new Scanner(System.in);
        System.out.println("Ny Laptop:");
        System.out.println("Type: ");
        nyLaptop.setType(lapIn.nextLine());
        System.out.println("Merke: ");
        nyLaptop.setMerke(lapIn.nextLine());
        System.out.println("Pris: ");
        nyLaptop.setPris(Integer.parseInt(lapIn.nextLine()));
        System.out.println("GB Ram: ");
        nyLaptop.setRam(Integer.parseInt(lapIn.nextLine()));
        System.out.println("Skjermstørrelse i tommer: ");
        nyLaptop.setSkjermstørrelse(Float.parseFloat(lapIn.nextLine()));
        System.out.println("Innkjøpt: ");
        nyLaptop.setInnkjøpt(LocalDate.parse(lapIn.nextLine()));

        lagre(nyLaptop);

    }

    private static void lagre(Laptop nyLaptop) {
        try (FileWriter fil = new FileWriter("data.csv",true)) {
            fil.append(nyLaptop.getType() + "," + nyLaptop.getMerke() + "," + nyLaptop.getPris() + ","
                    + nyLaptop.getRam() + "," + nyLaptop.getSkjermstørrelse() + "," + nyLaptop.getInnkjøpt()+"\n");
            fil.flush();
            fil.close();
            System.out.println("Laptop lagret...");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public int getBatteritid() {
        return batteritid;
    }

    public void setBatteritid(int batteritid) {
        this.batteritid = batteritid;
    }

    public float getSkjermstørrelse() {
        return skjermstørrelse;
    }

    public void setSkjermstørrelse(float skjermstørrelse) {
        this.skjermstørrelse = skjermstørrelse;
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
