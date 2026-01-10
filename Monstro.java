import java.util.Random;

public abstract class Monstro extends Personagem {

    // Atributo que gera numeros aleatórios para a IA de ataque
    private Random sorteio = new Random();

    // Método construtor
    public Monstro(String nome, int vidaMaxima, int danoBase) {
        super(nome, vidaMaxima, danoBase);
    }

    // O cérebro da IA
    @Override
    public void atacar(Personagem alvo) {
        int chance = sorteio.nextInt(10);// Gera um número de 0 a 9

        // 30% de chance de usar ataque especial
        if (chance < 3) {
            this.ataqueEsoterico(alvo);// chance de 0 a 2
        } else {
            this.ataqueFisico(alvo);// chance de 3 a 9
        }
    }

    // Métodos abstratos que serão usados nas classes especificas de cada monstro
    public abstract void ataqueFisico(Personagem alvo);

    public abstract void ataqueEsoterico(Personagem alvo);

}
