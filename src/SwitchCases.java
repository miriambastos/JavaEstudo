import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um personagem:");
        System.out.println("1 - Cersei Lannister");
        System.out.println("2 - Daenerys Targaryen");
        System.out.println("3 - Jon Snow");
        System.out.println("4 - Tyrion Lannister");
        System.out.println("5 - Sansa Stark");
        System.out.println("6 - Arya Stark");
        System.out.println("7 - Melisandre");
        System.out.println("8 - Samwell Tarly");

        int escolhaDoUsuario = scanner.nextInt();

        //switch sempre sera switch() dentro dos parentes a condição

        switch (escolhaDoUsuario){
            case 1:
                System.out.println("Você escolheu Cersei Lannister");
                break;
            case 2:
                System.out.println("Você escolheu Daenerys Targaryen");
                break;
            case 3:
                System.out.println("Você escolheu Jon Snow");
                break;
            case 4:
                System.out.println("Você escolheu Tyrion Lannister");
                break;
            case 5:
                System.out.println("Você escolheu Sansa Stark");
                break;
            case 6:
                System.out.println("Você escolheu Arya Stark");
                break;
            case 7:
                System.out.println("Você escolheu Melisandre");
                break;
            case 8:
                System.out.println("Você escolheu Samwell Tarly");
                break;
            default:
                System.out.println("voce não digitou um número valido, tente novamente");

        }

        System.out.println("Digite a idade do personagem que fará a missão");
        int idadeDoPeronsagem = scanner.nextInt();

        String idadeSelecionadaPeloUsuario = (idadeDoPeronsagem >= 16) ? "Esta autorizado a realizar a missão!" : "Personagem muito novo para sair em missão";
        System.out.println(idadeSelecionadaPeloUsuario);


        scanner.close();










    }
}
