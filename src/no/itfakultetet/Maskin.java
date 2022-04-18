package no.itfakultetet;

import java.time.LocalDate;

public class Maskin {
    static int antallMaskiner;
    private String type, merke;
    private int pris;
    private int modell;
    private LocalDate innkjøpt, service;

    public Maskin() {
        antallMaskiner++;
    }

    public Maskin(String type, String merke, int ram, int antallDisker, int pris, int modell, LocalDate innkjøpt) {
        this.type = type;
        this.merke = merke;
        this.pris = pris;
        this.modell = modell;
        this.innkjøpt = innkjøpt;
        antallMaskiner++;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMerke() {
        return merke;
    }

    public void setMerke(String merke) {
        this.merke = merke;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public int getModell() {
        return modell;
    }

    public void setModell(int modell) {
        this.modell = modell;
    }

    public LocalDate getInnkjøpt() {
        return innkjøpt;
    }

    public void setInnkjøpt(LocalDate innkjøpt) {
        this.innkjøpt = innkjøpt;
    }

    public LocalDate getService() {
        return service;
    }

    public void setService(LocalDate service) {
        this.service = service;
    }
}
