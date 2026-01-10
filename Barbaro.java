public class Barbaro extends Heroi {

    // Método construtor
    public Barbaro(String nome) {
        super(nome, 100, 5);
    }

    // Implementação do ataques
    @Override
    public void ataqueBasico1(Personagem alvo) {
        System.out.println("\n(||) Bárbaro " + nome + " desce o MACHADO!");
        alvo.receberDano(5);
    }

    @Override
    public void ataqueBasico2(Personagem alvo) {
        System.out.println("\n(||) Barbaro " + nome + " pula e dá um ATAQUE AÉREO!");
        alvo.receberDano(5);
    }

    @Override
    public void ataqueStatus(Personagem alvo) {
        System.out.println("\n(||) Barbaro " + nome + " arremessa o machado causando FERIMENTO PROFUNDO! (O inimigo vai perde 2 de vida a cada turno)");
        alvo.receberDano(5);
        alvo.turnosEnvenenado = 5;
    }

    // Ataque Especial Ultimate
    @Override
    public void ataqueEspecial(Personagem alvo) {
        if (this.barraEspecial >= 30) {
            System.out.println("\n(||) Barbaro " + nome + " entra em FÚRIA e esmaga o inimigo!");
            alvo.receberDano(50);
            this.barraEspecial = 0;
        } else {
            System.out.println("\nFúria insuficiente! Precisa de 30, tem " + this.barraEspecial + "/30");
        }
    }

    @Override
    public void atacar(Personagem alvo) {
        this.ataqueBasico1(alvo);
    }

}
