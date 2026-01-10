public class EspiritoFogo extends Monstro {

    // Método construtor
    public EspiritoFogo() {
        super("Espírito de Fogo", 150, 6);
    }

    // Métodos de ataque
    @Override
    public void ataqueFisico(Personagem alvo) {
        System.out.println("<||> " + nome + " lança SOCO DE BRASA!");
        alvo.receberDano(6);
    }

    @Override
    public void ataqueEsoterico(Personagem alvo) {
        System.out.println("<||> " + nome + " usa AURA DE CALOR INFERNAL!");
        alvo.receberDano(10);

        // Implementção da logica de diminuir a barra do especial
        if (alvo instanceof Heroi) {
            Heroi h;
            h = (Heroi) alvo;
            h.diminuirBarraEspecial(10);
            System.out.println("\n### Sua energia foi drenada pelo Calor Infernal! ###");
        }
    }

}
