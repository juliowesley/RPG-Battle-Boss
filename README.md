# Battle Boss RPG 

Um jogo de batalha por turnos (RPG) rodando diretamente no console, desenvolvido para aplicar e solidificar conhecimentos avançados de Orientação a Objetos em Java.

## Sobre o Projeto

O jogo simula um sistema de combate clássico de RPGs. O jogador cria um herói, escolhe sua classe e enfrenta chefes poderosos controlados por uma Inteligência Artificial simples baseada em aleatoriedade (RNG).

O foco do projeto foi a construção de uma arquitetura escalável usando os 4 pilares da Programação Orientada a Objetos.

## Funcionalidades

- **4 Classes Jogáveis:** Guerreiro, Arqueiro, Mago e Bárbaro, cada um com ataques e status únicos.
- **Sistema de Habilidades:** Ataques básicos, Dano por Tempo (Veneno/Fogo) e Ultimates que carregam com o tempo.
- **Inimigos com IA:** 4 Bosses (Hydra, Ciclope, Dragão, Espírito de Fogo) que decidem aleatoriamente entre atacar ou usar magias especiais.
- **Inventário:** Gerenciamento de poções de vida e de mana (especial).
- **Sistema de Batalha:** Loop de turnos, cálculo de dano, cura e verificação de vitória/derrota.

## Conhecimentos Aplicados

Este projeto foi fundamental para praticar:

- **Programação Orientada a Objetos (POO):** Estruturação de todo o código em classes e objetos.
- **Herança:** Uso de uma classe mãe `Personagem` para compartilhar atributos (vida, nome) com `Heroi` e `Monstro`.
- **Classes e Métodos Abstratos:** Criação de "contratos" que obrigam as classes filhas a implementarem seus próprios ataques (`atacar()`).
- **Polimorfismo:** O sistema de batalha (`Batalha.java`) aceita qualquer tipo de `Personagem`, sem saber se é um Monstro ou Herói, executando o comportamento específico de cada um em tempo de execução.
- **Encapsulamento:** Proteção de atributos sensíveis e uso de métodos para alterar o estado do personagem.
- **Lógica de Programação:** Loops `while` para o game loop, `switch/case` para menus e `Random` para a IA.

# Classes  
## Classe Main

## Classe Batalha

## Classe Personagem

**Classe Herói**
- Guerreiro
-	Arqueiro
-	Mago
-	Bárbaro

**Classe Monstro**
- Hydra
- Ciclope
- Dragão
- Espírito de Fogo
