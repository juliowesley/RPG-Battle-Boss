public class Dragao extends Monstro {

    // Método construtor
    public Dragao() {
        super("Dragão", 200, 6);
    }

    // Métodos de ataque
    @Override
    public void ataqueFisico(Personagem alvo) {
        System.out.println("<||> " + nome + " ataca com GARRAS!");
        alvo.receberDano(6);
    }

    @Override
    public void ataqueEsoterico(Personagem alvo) {
        System.out.println("<||> " + nome + " cospe BAFORADA DE FOGO ARDENTE!");
        alvo.receberDano(10);
        alvo.turnosEnvenenado = 5; // O herói vai queimar por 5 turnos
    }

}
