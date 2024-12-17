package GameStuff;

import java.util.Random;

public class Dados {
    private int faces;

    // metodo com valor boleano para receber um valor inteiro como parametro e
    // retorna true se o valor aleatorio gerado for maior
    // que o valor do dado e falso se for menor que o valor do dado.

    public Dados(int faces) {
        if (faces < 20) {
            throw new IllegalArgumentException("O dado deve ter pelo menos 20 lados");

        }
        this.faces = faces;
    }

    public int roll() {

        Random rn = new Random();

        return rn.nextInt(faces) + 1;

    }

    public boolean parametro(int defesaDoMob) {
        Random rn = new Random();
        int resultado = rn.nextInt(faces) + 1;
        return resultado > defesaDoMob;
    }
}