package no.itfakultetet;

import java.time.LocalDate;

public class Desktop extends Maskin {

    static int antallDesktop;
    private int ram;
    private int antallDisker;


    public Desktop(String type, String merke, int ram, int antallDisker, int pris, int modell, LocalDate innkjøpt) {
        super(type, merke, ram, antallDisker, pris, modell, innkjøpt);
        Maskin.antallMaskiner++;
        antallDesktop++;
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
