package app;

import java.util.ArrayList;
import java.util.List;

import model.Bateria;
import model.InstrumentoMusical;
import model.Violao;

public class TesteBanda {

    public static void main(String[] args) {

        List<InstrumentoMusical> instrumentos = new ArrayList<>();

        instrumentos.add(new Violao());
        instrumentos.add(new Bateria());

        System.out.println("=== ENSAIO DA BANDA ===");

        for (InstrumentoMusical instrumento : instrumentos) {
            instrumento.afinar();

            System.out.println(
                instrumento.getNome()
                + " - Material: " + instrumento.getMaterial()
                + " - Som: " + instrumento.tocar()
            );
        }

        int quantidadeAfinados = 0;

        for (InstrumentoMusical instrumento : instrumentos) {
            if (instrumento.isAfinado()) {
                quantidadeAfinados++;
            }
        }

        System.out.println(
            "Quantidade de instrumentos afinados: "
            + quantidadeAfinados
        );
    }
}

