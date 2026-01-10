public abstract class Personagem {

    protected String nome;
    protected int vidaAtual;
    protected int vidaMaxima;
    protected int danoBase; // Dano padrão se não usar habilidade
    protected int turnosEnvenenado;// Para a lógica de Veneno/Gelo/Fogo (Começa com 0)

    // Método construtor
    public Personagem(String nome, int vidaMaxima, int danoBase) {
        this.nome = nome;
        this.vidaAtual = vidaMaxima;
        this.vidaMaxima = vidaMaxima;
        this.danoBase = danoBase;
        this.turnosEnvenenado = 0;
    }

    // Métodos Personalizados
    // Recebe Dano: Reduz a vida do jogador e evita que fique negativa
    public void receberDano(int dano) {
        this.vidaAtual = this.vidaAtual - dano;
        if (this.vidaAtual < 0) {
            this.vidaAtual = 0;
        }
        System.out.println("\n" + nome + " recebeu " + dano + " de dano! Vida restante: " + vidaAtual);
    }

    // Curar: Aumenta a vida mas não deixa passar do máximo
    public void curar(int quantidade) {
        this.vidaAtual = this.vidaAtual + quantidade;
        if (this.vidaAtual > this.vidaMaxima) {
            this.vidaAtual = this.vidaMaxima;
        }
        System.out.println("\n" + nome + " recuperou " + quantidade + " de vida!");
    }

    // Esse loop verifica se alguem esta vivo para saber se a luta acabou
    public boolean estaVivo() {
        if (this.vidaAtual > 0) {
            return true;
        } else {
            return false;
        }
    }

    // Método abstrato
    public abstract void atacar(Personagem alvo);

    // Métodos Especiais Get & Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public void setVidaAtual(int vidaAtual) {
        this.vidaAtual = vidaAtual;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public int getDanoBase() {
        return danoBase;
    }

    public void setDanoBase(int danoBase) {
        this.danoBase = danoBase;
    }

    public int getTurnosEnvenenado() {
        return turnosEnvenenado;
    }

    public void setTurnosEnvenenado(int turnosEnvenenado) {
        this.turnosEnvenenado = turnosEnvenenado;
    }

}