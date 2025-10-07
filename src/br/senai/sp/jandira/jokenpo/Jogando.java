package br.senai.sp.jandira.jokenpo;

import br.senai.sp.jandira.jokenpo.model.IniciandoJogo;

import java.util.Scanner;

public class Jogando {
    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        System.out.println("Vamos jogar Jokenpô!");
        System.out.println("----------------------------------------");

        IniciandoJogo iniciandoJogo = new IniciandoJogo();
        iniciandoJogo.obterDados();

        iniciandoJogo.iniciarJogo();
    }
}
