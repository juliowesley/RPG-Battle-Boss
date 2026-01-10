import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Heroi heroi = null; // Objeto herói inicia vazio

        System.out.println("\n--- Bem-vindo ao RPG Battle Boss ---\n");
        System.out.print("Digite o nome do seu Herói: ");
        String nomeJogador = teclado.nextLine();// Definição do nome

        // Loop para escolher a classe
        while (heroi == null) {
            System.out.println("\n--- Escolha sua Classe: ---");
            System.out.println("1 - Guerreiro");
            System.out.println("2 - Arqueiro");
            System.out.println("3 - Mago");
            System.out.println("4 - Barbaro");
            int opcaoClasse = teclado.nextInt();

            switch (opcaoClasse) {
                case 1:
                    heroi = new Guerreiro(nomeJogador);
                    break;
                case 2:
                    heroi = new Arqueiro(nomeJogador);
                    break;
                case 3:
                    heroi = new Mago(nomeJogador);
                    break;
                case 4:
                    heroi = new Barbaro(nomeJogador);
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        }

        System.out.println("\n--- Herói criado! Bem vindo, " + heroi.nome);

        // HUB principal
        while (true) {

            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1 - Lutar contra os Bosses");
            System.out.println("2 - Ver Status (Vida/Itens");
            System.out.println("0 - Sair");
            int opcao = teclado.nextInt();

            if (opcao == 0) {// Sai do jogo
                System.out.println("Saindo do jogo...");
                break;
            } else if (opcao == 2) {// Status e Itens
                System.out.println("\n--- ATRIBUTOS ---");
                System.out.println("Herói: " + heroi.nome);
                System.out.println("Vida: " + heroi.vidaAtual + "/" + heroi.vidaMaxima);
                System.out.println("Barra de Especial: " + heroi.barraEspecial + "/30");
                System.out.println("\n--- ITENS ---");
                System.out.println("Poções de Vida: " + heroi.qtdPocaoVida);
                System.out.println("Poções de Especial: " + heroi.qtdPocaoEspecial);
            } else if (opcao == 1) {// Menu de Monstros
                System.out.println("\n--- ESCOLHA SEU OPONENTE ---");
                System.out.println("1 - Hydra");
                System.out.println("2 - Ciclope");
                System.out.println("3 - Dragão");
                System.out.println("4 - Espírito de Fogo");
                int opcaoMonstro = teclado.nextInt();

                Monstro monstro = null;

                switch (opcaoMonstro) {
                    case 1:
                        monstro = new Hydra();
                        break;
                    case 2:
                        monstro = new Ciclope();
                        break;
                    case 3:
                        monstro = new Dragao();
                        break;
                    case 4:
                        monstro = new EspiritoFogo();
                        break;
                    default:
                        System.out.println("Opção invalida!");
                }

                if (monstro != null) {
                    Batalha.iniciar(heroi, monstro);
                }

            }

        }
    }
}
