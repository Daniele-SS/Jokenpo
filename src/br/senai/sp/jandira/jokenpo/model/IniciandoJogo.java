package br.senai.sp.jandira.jokenpo.model;

import java.util.Random;
import java.util.Scanner;

public class IniciandoJogo {
    String escolhaUsuario;
    String escolhaDaMaquina;
    String pedra;
    String papel;
    String tesoura;
    int numeroSelecionado;


    public void obterDados() {
        Scanner leitor = new Scanner(System.in);

        Random random = new Random();
        int escolhaPc = random.nextInt(3) + 1;

        System.out.print("Escolha uma opção: ");
        escolhaUsuario = leitor.nextLine();

        System.out.println("(1) Pedra");
        System.out.println("(2) Papel");
        System.out.println("(3) Tesoura");
        System.out.println("----------------------------------------");

        System.out.print("Digite a sua escolha: ");
        numeroSelecionado = leitor.nextInt();

        if (numeroSelecionado == 1)
            escolhaUsuario = "pedra";

        else if (numeroSelecionado == 2) {
            escolhaUsuario = "papel";

        } else if (numeroSelecionado == 3) {
            escolhaUsuario = "tesoura";
        }

        if (escolhaPc == 1)
            escolhaDaMaquina = "pedra";

        else if (escolhaPc == 2) {
            escolhaDaMaquina = "papel";

        } else {
            escolhaDaMaquina = "tesoura";
        }


        System.out.println("Você escolheu: " + escolhaUsuario);
        System.out.println("O computador escolheu: " + escolhaDaMaquina);


    }

    public void iniciarJogo() {
        if (escolhaUsuario == escolhaDaMaquina) {
            System.out.println("EMPATE!");

        } else if (escolhaDaMaquina == pedra && escolhaUsuario == tesoura) {
            System.out.println("VOCÊ PERDEU!");

        } else if (escolhaDaMaquina == papel && escolhaUsuario == pedra) {
            System.out.println("VOCÊ PERDEU!");

        } else if (escolhaDaMaquina == tesoura && escolhaUsuario == papel) {
            System.out.println("VOCÊ PERDEU!");

        } else if (escolhaDaMaquina == papel && escolhaUsuario == tesoura) {
            System.out.println("VOCÊ VENCEU!");

        }
    }
}