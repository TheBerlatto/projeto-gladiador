package model;

public class Gladiador {
    
    private String nome;
    private int vida = 5;
    private boolean armadura;
    
    public Gladiador(String nome, boolean armadura) {
        this.nome = nome;
        this.armadura = armadura;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public boolean isarmadura() {
        return armadura;
    }
    

    public void recebeGolpe(Arma arma) {
        if (armadura == true) {
            this.vida = vida - (arma.getDano() + 2);
        } else {
            this.vida = vida - arma.getDano();
        }
    }

    public void imprime() {
        String estado = "";
        String renameArmadura = "";
        if (this.vida <= 0) {
            estado = "morto";
        } else {
            estado = "vivo";
        }

        if (this.armadura == true) {
            renameArmadura = "está com armadura";
        } else {
            renameArmadura = "está sem armadura";
        }

        System.out.println("O Gladiador " + nome 
        + " contém " + vida + " de vida, " 
        + renameArmadura +
         " e está " + estado);
    }

    
}
