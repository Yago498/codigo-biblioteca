package app;

import model.Biblioteca;
import model.ItemBiblioteca;
import model.Jornal;
import model.Livro;
import model.Revista;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

public class App {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Biblioteca biblioteca = new Biblioteca();

    public static void main(String[] args) {
        carregarDadosIniciais();

        boolean executando = true;
        while (executando) {
            exibirMenu();
            int opcao = lerOpcao();

            switch (opcao) {
                case 1 -> cadastrarLivro();
                case 2 -> cadastrarRevista();
                case 3 -> cadastrarJornal();
                case 4 -> listarItens();
                case 5 -> buscarItem();
                case 6 -> removerItem();
                case 7 -> emprestarLivro();
                case 8 -> devolverLivro();
                case 0 -> {
                    System.out.println("Encerrando o sistema. Até logo!");
                    executando = false;
                }
                default -> System
