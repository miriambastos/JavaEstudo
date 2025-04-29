import java.util.Scanner;

//utilizado para imput - trás o usuario para dentro da aplicação

public class ScannerUsuario {
    public static void main(String[] args) {
        Scanner caixaDeTexto = new Scanner(System.in); //criamos um objeto do tipo scanner e utilizamos o system.in para autorizar o usuario a escrever dentro
        System.out.println("Escreva o nome do personagem");
        String nomeDoPersonagem = caixaDeTexto.nextLine();
        System.out.println("O nome do personagem é " + nomeDoPersonagem);
        System.out.println("Agora digite a idade do personagem");
        int idadeDoPersonagem = caixaDeTexto.nextInt();
        System.out.println("A idade do personagem é " + idadeDoPersonagem + "anos");

        //inserindo condições

    if (idadeDoPersonagem >= 30){
        System.out.println("Esta autorizado a viajar pelos reinos");
    } else {
        System.out.println("Infelizmente voce não tem idade o suficiente para iniciar viagens pelo reino");
    }

    caixaDeTexto.close(); //devemos sempre fechar o scanner para não ter problema de vazamento.

    }
}
