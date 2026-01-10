public class Mago extends Heroi {

    // Método construtor
    public Mago(String nome) {
        super(nome, 100, 5);
    }

    // Implementação do ataques
    @Override
    public void ataqueBasico1(Personagem alvo) {
        System.out.println("\n(||) Mago " + nome + " lança um ORBE MÁGICO!");
        alvo.receberDano(5);
    }

    @Override
    public void ataqueBasico2(Personagem alvo) {
        System.out.println("\n(||) Mago " + nome + " ataca com RAIO DE FOGO");
        alvo.receberDano(5);
    }

    @Override
    public void ataqueStatus(Personagem alvo) {
        System.out.println("\n(||) Mago " + nome + " usa NEVASCA CONGELANTE! O inimigo tremerá de frio! (O inimigo vai perde 2 de vida a cada turno)");
        alvo.receberDano(5);
        alvo.turnosEnvenenado = 5;
    }

    // Ataque Especial Ultimate
    @Override
    public void ataqueEspecial(Personagem alvo) {
        if (this.barraEspecial >= 30) {
            System.out.println("\n(||) Mago " + nome + " canaliza uma GRANDE EXPLOSÃO DO CAJADO!");
            alvo.receberDano(50);
            this.barraEspecial = 0;
        } else {
            System.out.println("\nMagia insuficiente! Precisa de 30, tem " + this.barraEspecial + "/30");
        }
    }

    @Override
    public void atacar(Personagem alvo) {
        this.ataqueBasico1(alvo);
    }

}
