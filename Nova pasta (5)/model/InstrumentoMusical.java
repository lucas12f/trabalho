package model;

public abstract class InstrumentoMusical {

    private String nome;
    private String material;
    private boolean afinado;

    public InstrumentoMusical(String nome, String material) {
        this.nome = nome;
        this.material = material;
        this.afinado = false;
    }

    public String getNome() {
        return nome;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isAfinado() {
        return afinado;
    }

    public void afinar() {
        afinado = true;
    }

    public abstract String tocar();
}

