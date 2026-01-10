public class Ciclope extends Monstro {

    // Método construtor
    public Ciclope() {
        super("Ciclope", 150, 6);
    }

    // Métodos de ataque
    @Override
    public void ataqueFisico(Personagem alvo) {
        System.out.println("<||> " + nome + " usa ESMAGAR");
        alvo.receberDano(6);
    }

    @Override
    public void ataqueEsoterico(Personagem alvo) {
        System.out.println("<||> " + nome + " usa OLHAR ATORDOANTE!");
        alvo.receberDano(10);

        // Implementção da logica de diminuir a barra do especial
        if (alvo instanceof Heroi) {
            Heroi h;
            h = (Heroi) alvo;
            h.diminuirBarraEspecial(10);
            System.out.println("\n### Sua energia foi drenada pelo Olhar Atordoante! ###");
        }

    }

}
