public abstract class Heroi extends Personagem {

    protected int barraEspecial; // Maximo de 30
    protected int qtdPocaoVida; // começa com 2
    protected int qtdPocaoEspecial; // começa com 2

    // Método construtor dessa classe
    public Heroi(String nome, int vidaMaxima, int danoBase) {
        super(nome, vidaMaxima, danoBase); // Método construtor da classe Mãe

        this.barraEspecial = 0;
        this.qtdPocaoVida = 2;
        this.qtdPocaoEspecial = 2;
    }

    // Métodos personalizados
    @Override // O Héroi perde vida ao apanhar e recebe barra especial
    public void receberDano(int dano) {
        super.receberDano(dano);// perde vida

        // Logica que carrega a barra especial
        this.barraEspecial = this.barraEspecial + dano;

        // A barra especial so pode ser ate 30
        if (this.barraEspecial > 30) {
            this.barraEspecial = 30;
        }
        System.out.println("Ultimate Especial Carregado: " + this.barraEspecial + "/30");
    }

    // O héroi precisa recuperar vida com essa logica
    public void usarPocaoVida() {
        if (qtdPocaoVida > 0) {
            curar(20);// curar é o metodo da classe mãe que recebe
            this.qtdPocaoVida = this.qtdPocaoVida - 1;
            System.out.println("Restam " + qtdPocaoVida + " poções de vida");
        } else {
            System.out.println("Voçê não tem poções de vida!");
        }
    }

    // O heroi pode encher antes da hora sua barra especial
    public void usarPocaoEspecial() {
        if (qtdPocaoEspecial > 0) {// Valida se tem poção, adiciona 10 pontos a sua barra e remove uma poção do
                                   // invetario
            this.barraEspecial = this.barraEspecial + 10;
            if (this.barraEspecial > 30) {
                this.barraEspecial = 30;
            }
            qtdPocaoEspecial = qtdPocaoEspecial - 1;
            System.out.println("Usou poção especial! Barra: " + barraEspecial + "/30");
        } else {
            System.out.println("Voçê não tem poções especiais!");
        }
    }

    // Método de ganhar itens ao derrotar os monstros
    public void ganharItens() {
        this.qtdPocaoVida += 2;
        this.qtdPocaoEspecial += 2;
    }

    //Métodos abstratos Habilidades Especificas
    //Defino 4 tipos de ataque mas não implemento aqui
    public abstract void ataqueBasico1(Personagem alvo);
    public abstract void ataqueBasico2(Personagem alvo);
    public abstract void ataqueStatus(Personagem alvo); //Método para Venenp/Gelo/Fogo
    public abstract void ataqueEspecial(Personagem alvo); //Ultimate 50 de dano

    //Métodos especiai Get & Set
    public int getBarraEspecial() {
        return barraEspecial;
    }

    public void setBarraEspecial(int barraEspecial) {
        this.barraEspecial = barraEspecial;
    }

    public int getQtdPocaoVida() {
        return qtdPocaoVida;
    }

    public void setQtdPocaoVida(int qtdPocaoVida) {
        this.qtdPocaoVida = qtdPocaoVida;
    }

    public int getQtdPocaoEspecial() {
        return qtdPocaoEspecial;
    }

    public void setQtdPocaoEspecial(int qtdPocaoEspecial) {
        this.qtdPocaoEspecial = qtdPocaoEspecial;
    }



}
