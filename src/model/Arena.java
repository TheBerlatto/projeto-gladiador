package model;
public class Arena {
    
    private int qtdeTorcedores;
    private boolean felizes = true;
    
    public Arena(int torcedores) {
        this.qtdeTorcedores = torcedores;
    }

    public void realizaCombate(Gladiador glad1, Arma arma1, Gladiador glad2, Arma arma2) {
        glad1.recebeGolpe(arma2);
        glad2.recebeGolpe(arma1);
        
        if (glad1.getVida() > 0 && glad2.getVida() > 0) {
            this.felizes = false;
            int resultPorcentagem = qtdeTorcedores * (25/100);
            qtdeTorcedores = qtdeTorcedores - resultPorcentagem;
        } else {
            this.felizes = true;
            int resultPorcentagem = qtdeTorcedores * (10/100);
            qtdeTorcedores = qtdeTorcedores + resultPorcentagem;
        }
    }

    public void imprime() {
        String renomeiaFelizes = "";

        if (this.felizes == true) {
            renomeiaFelizes = "felizes";
        } else {
            renomeiaFelizes = "tristes";
        }

        System.out.println("A arena está com " + qtdeTorcedores + " torcedores, e eles estão " + renomeiaFelizes + "!");
    }
}
