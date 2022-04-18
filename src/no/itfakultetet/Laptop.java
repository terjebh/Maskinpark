package no.itfakultetet;

import java.time.LocalDate;

public class Laptop extends Maskin {
static int antallLaptop;
    private int ram;
    private int antallDisker, batteritid;
    private float skjermstørrelse;

    public Laptop(String type, String merke, int ram, int antallDisker, int pris, int modell, LocalDate innkjøpt) {
        super(type, merke, ram, antallDisker, pris, modell, innkjøpt);
        Maskin.antallMaskiner++;
        antallLaptop++;
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
