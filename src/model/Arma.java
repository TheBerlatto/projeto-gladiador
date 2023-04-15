package model;

public class Arma {

    private char tipo;
    private int dano;

    public Arma(char tipo) {
        this.tipo = tipo;

        switch (this.tipo) {
            case 'E':
                dano = 5;
                break;
            case 'L':
                dano = 4;
                break;
            case 'A':
                dano = 3;
                break;
            default:
                dano = 0;
                break;
        }
    }

    public char getTipo() {
        return tipo;
    }

    public int getDano() {
        return dano;
    }

    public void imprime() {
        String nome = "";

        switch (this.tipo) {
            case 'E':
                nome = "Espada";
                break;
            case 'L':
                nome = "Lança";
                break;
            case 'A':
                nome = "Arco e Flecha";
                break;
            default:
                nome = "Desconhecido";
                break;
        }

        System.out.println("Arma: " + nome + " - Dano: " + dano);
    }
}