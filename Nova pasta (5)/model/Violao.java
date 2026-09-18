package model;

public class Violao extends InstrumentoMusical {

    private int cordas;

    public Violao() {
        super("Violao", "Madeira");
        this.cordas = 6;
    }

    public int getCordas() {
        return cordas;
    }

    @Override
    public String tocar() {
        return "Som de cordas dedilhadas";
    }
}

