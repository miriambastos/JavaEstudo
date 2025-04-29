import java.util.Scanner;

//Permita que o usuario cadastre o nome de um personagem de GOT
//Exiba a lista de todos os personagens cadastrados
//Imprima os dados
//Usuario pode encerrar o programa a qualquer momento

// usar array, switch cases, loops e condicionais

public class Deafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NUMERO_MAX = 10;
        String[] personagem = new String[NUMERO_MAX];

        int personagensCadastrados = 0;
        int opcao = 0;

        while (opcao != 3) {

            System.out.println("\n===== Menu Personagens =====");
            System.out.println("1. Cadastrar Personagem");
            System.out.println("2. Listar Personagens");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); //inserindo esta linha para corrigir bug, esta comendo uma linha

            switch (opcao) {
                case 1:
                    if (personagensCadastrados < NUMERO_MAX) {
                        System.out.println("Digite o nome do personagem que deseja cadastrar: ");
                        String nomeDoPersonagem = scanner.nextLine();
                        personagem[personagensCadastrados] = nomeDoPersonagem;
                        personagensCadastrados++;
                        System.out.println("Personagem cadastrado com sucesso!");

                    } else {
                        System.out.println("A lista de personagens já esta cheia. Não é possivel cadastra novo personagem");
                    }
                    break;

                case 2:
                    if (personagensCadastrados == 0) {
                        System.out.println("Nenhum personagem encontrado");
                    } else {
                        System.out.println("========== Lista de personagens ==========");
                        for (int i = 0; i < personagem.length; i++) {
                            System.out.println(personagem[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Estamos encerrando o programa... Aguarde");
                    break;

                default:
                    System.out.println("Essa opção não é valida.");
                    break;






            }


        }
    }
}

