import java.sql.SQLOutput;


//String: nomes
// int: inteiros
//boolean: boleano

public class Main {
    public static void main(String[] args) {

        String nome1 = "Arya Stark";
        int idade = 12;
        String casa1 = "Stark";
        String localizacao1 = "Norte";

        System.out.println("Meu nome é " + nome1 + " Tenho " + idade + " anos de idade" + " e sou da casa " + casa1 + " o qual esta localizada no " + localizacao1);

        String nome2 = "Sansa Stark";
        int idade2 = 16;
        String casa2 = "Stark";
        String localizacao2 = "Norte";

        System.out.println("Meu nome é " + nome2 + " Tenho " + idade2 + " anos de idade" + " e sou da casa " + casa2 + " o qual esta localizada no " + localizacao2);

        if (idade >= 16 ){
            System.out.println("Voce esta apto para se casar");
        } else{
            System.out.println("Voce é muito nova para se casar");
        }

    }
}

