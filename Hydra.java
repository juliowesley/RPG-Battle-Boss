public class Hydra extends Monstro {

    // Método construtor
    public Hydra() {
        super("Hydra", 120, 6);
    }

    // Métodos de ataque
    @Override
    public void ataqueFisico(Personagem alvo) {
        System.out.println("<||> " + nome + " usa MORDIDA MÚLTIPLA!");
        alvo.receberDano(6);
    }

    @Override
    public void ataqueEsoterico(Personagem alvo) {
        System.out.println("<||> " + nome + " usa REGENERAÇÃO e recupera cabeças!");
        this.curar(10);// Cura a si mesma
    }

}
