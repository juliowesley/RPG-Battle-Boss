import java.util.Scanner;

public class Batalha {

    public static void iniciar(Heroi jogador, Monstro inimigo) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("\n==========================================");
        System.out.println("  BATTLE START: (||) " + jogador.getNome() + " vs <||> " + inimigo.getNome() + "   ");
        System.out.println("==========================================");

        while (jogador.estaVivo() && inimigo.estaVivo()) {

            // Checagem do Efeitos / Veneno, Gelo e Fogo
            if (jogador.turnosEnvenenado > 0) {
                jogador.receberDano(2);
                jogador.turnosEnvenenado--;
                System.out.println("\n### Você perdeu 2 de vida por efeito de ataque Esoterico do inimigo ###");
            }
            if (inimigo.turnosEnvenenado > 0) {
                inimigo.receberDano(2);
                inimigo.turnosEnvenenado--;
                System.out.println("Devido seu ataque Esotérico");
            }

            // ------------------------------------------
            // 2. TURNO DO JOGADOR
            // ------------------------------------------

            System.out.println("\nSua vez! HP: " + jogador.vidaAtual + " | Especial: " + jogador.barraEspecial);
            System.out.println("1 - para Ataque Básico 1");
            System.out.println("2 - para Ataque Basico 2");
            System.out.println("3 - para Ataque Esotérico");
            System.out.println("4 - para Habilidade ESPECIAL (Precisa de 30)");
            System.out.println("----------INVENTÁRIO-----------");
            System.out.println("5 - para Usar poção de vida");
            System.out.println("6 - para Usar Poção de Especial");
            System.out.println("-------------------------------\n");
            int opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    jogador.ataqueBasico1(inimigo);
                    break;
                case 2:
                    jogador.ataqueBasico2(inimigo);
                    break;
                case 3:
                    jogador.ataqueStatus(inimigo);
                    break;
                case 4:
                    jogador.ataqueEspecial(inimigo);
                    break;
                case 5:
                    jogador.usarPocaoVida();
                    break;
                case 6:
                    jogador.usarPocaoEspecial();
                    break;
                default:
                    System.out.println("\n*** Opção Invalida!! ***");
                    break;
            }

            // Verifica se o monstro esta vivo antes dele atacar
            if (inimigo.vidaAtual <= 0) {
                break;
            }

            // ------------------------------------------
            // 3. TURNO DO MONSTRO
            // ------------------------------------------

            System.out.println("-----------------------------");
            System.out.println("\n<||> Vez do " + inimigo.nome + "...");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            } // Pausa dramática
            inimigo.atacar(jogador);// IA decide o ataque
            System.out.println("-------------------------------------------");

            // Verifica se o jogador ainda esta vivo
            if (!jogador.estaVivo()) {
                break;
            }
        }

        // ========================================================
        // FASE 3: Fim da Luta
        // ========================================================
        if (jogador.estaVivo()) {
            System.out.println("\n==========================================");
            System.out.println(
                    "VITÓRIA!! Você derrotou o " + inimigo.nome + "\nGanhou 2 poções de Vida e 2 poções de Especial");
            System.out.println("==========================================");
            jogador.ganharItens();
        } else {
            System.out.println("\n==========================================");
            System.out.println("GAME OVER... Você caiu em combate");
            System.out.println("==========================================");
            System.exit(0); // Fecha o jogo
        }

    }
}
