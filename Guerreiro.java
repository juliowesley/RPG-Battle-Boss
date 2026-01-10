public class Guerreiro extends Heroi {

    // Método construtor
    public Guerreiro(String nome) {// Passa para classe os valores
        super(nome, 100, 5);
    }

    // Implementação do ataques
    public void ataqueBasico1(Personagem alvo) {
        System.out.println("\n(||) Guerreiro " + nome + " ataca com a ESPADA!");
        alvo.receberDano(5);
    }

    public void ataqueBasico2(Personagem alvo) {
        System.out.println("\n(||) Guerreiro " + nome + " golpeia com o ESCUDO!");
        alvo.receberDano(5);
    }

    public void ataqueStatus(Personagem alvo) {
        System.out.println("\n(||) Guerreiro " + nome + " perfura com a LANÇA causando sangramento! (O inimigo vai perde 2 de vida a cada turno)");
        alvo.receberDano(5);
        // Efetio de perder vida por turnos
        alvo.turnosEnvenenado = 5;
    }

    // Ataque Especial Ultimate
    public void ataqueEspecial(Personagem alvo) {
        if (this.barraEspecial >= 30) {
            System.out.println("\n(||) Guerreiro " + nome + " invoca a ARMADURA DOURADA e desfere um golpe poderoso!");
            alvo.receberDano(50);
            this.barraEspecial = 0;
        } else {
            System.out.println("\n### Determinação insuficiente! Precisa de 30, tem " + this.barraEspecial + "/30 ###");
        }
    }

    // Método generico para essa classe
    @Override
    public void atacar(Personagem alvo) {
        this.ataqueBasico1(alvo);
    }

}
