public class Arqueiro extends Heroi {

    // Método construtor
    public Arqueiro(String nome) {
        super(nome, 100, 5);
    }

    // Implementação do ataques
    public void ataqueBasico1(Personagem alvo) {
        System.out.println("\n(||) Arqueiro " + nome + " dispara uma FLECHA COMUM!");
        alvo.receberDano(5);
    }

    @Override
    public void ataqueBasico2(Personagem alvo) {
        System.out.println("\n(||) Arqueiro " + nome + " dispara uma FLECHA EXPLOSIVA!");
        alvo.receberDano(5);
    }

    @Override
    public void ataqueStatus(Personagem alvo) { // Flecha venenosa
        System.out.println("\n(||) Arqueiro " + nome + " acerta uma FLECHA VENENOSA! (O inimigo vai perde 2 de vida a cada turno)");
        alvo.receberDano(5);
        alvo.turnosEnvenenado = 5; // O inimigo perde vida nos proximos turnos
    }

    // Ataque Especial Ultimate
    @Override
    public void ataqueEspecial(Personagem alvo) {
        if (this.barraEspecial >= 30) {
            System.out.println("\n(||) Arqueiro " + nome + " dispara uma chuva de 100 FLECHAS!");
            alvo.receberDano(50);
            this.barraEspecial = 0;
        } else {
            System.out.println("\nFoco insuficiente! Precisa de 30, tem " + this.barraEspecial + "/30");
        }
    }

    @Override
    public void atacar(Personagem alvo) {
        this.ataqueBasico1(alvo);
    }
}
