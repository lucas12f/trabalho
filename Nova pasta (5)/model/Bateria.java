package model;

public class Bateria extends InstrumentoMusical {

    private int tambores;

    public Bateria() {
        super("Bateria", "Metal");
        this.tambores = 5;
    }

    public int getTambores() {
        return tambores;
    }

    @Override
    public String tocar() {
        return "Som grave de batidas";
    }
}

