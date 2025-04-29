public class Desafio1 {

    public static void main(String[] args) {

        String personagem1 = "Cersei Lannister";
        int idade1 = 34;
        String missao1 = "Conquistar os 7 reinos";
        String nivelDeDificuldade1 = "Alto";
        boolean status1 = false;

        System.out.println("Nome: " + personagem1);
        System.out.println("Idade: " + idade1);
        System.out.println("Missao: " + missao1);
        System.out.println("Nivel de dificuldade: " + nivelDeDificuldade1);
        System.out.println("Objetivo alcado?: " + status1);

        // estrutura do if e else
        // if (condição) {resultado}
        // else if (condição) {resultado}
        // else {resultado}


        if (status1 == true) {
            System.out.println("Vôce conseguiu conquistar os 7 reinos");
        }
        else if (idade1 == 35){
                System.out.println("Esta no caminho certo, continue...");
        }
        else {
            System.out.println("Voce falhou na missão");
        }

        String espacoDeLinha = "___________________________________________";
        System.out.println(espacoDeLinha);

        String personagem2 = "Sansa Stark";
        int idade2 = 16;
        String missao2 = "Se casar com o Jofrey";
        String nivelDeDificuldade2 = "Baixo";
        boolean status2 = true;

        System.out.println("Nome: " + personagem2);
        System.out.println("Idade: " + idade2);
        System.out.println("Missao: " + missao2);
        System.out.println("Nivel de dificuldade: " + nivelDeDificuldade2);
        System.out.println("Objetivo alcado?: " + status2);

        if (idade2 >= 16){
            System.out.println("Voce pode se casar pois tem idade suficiente");
        } else {
            System.out.println("Voce não atingiu a idade minima para casamento");
        }

        System.out.println(espacoDeLinha);

        String personagem3 = "Bran Stark";
        int idade3 = 12;
        String missao3 = "Ser o corvo de 3 olhos";
        String nivelDeDificuldade3 = "Médio";
        boolean status3 = true;

        System.out.println("Nome: " + personagem3);
        System.out.println("Idade: " + idade3);
        System.out.println("Missao: " + missao3);
        System.out.println("Nivel de dificuldade: " + nivelDeDificuldade3);
        System.out.println("Objetivo alcado?: " + status3);

        if (idade3 <= 10 && status3 == false){
            System.out.println("Não pode ser o corvo pois é muito jovem");
        } else {
            System.out.println("Tem idade sufuciente para ser o corvo");
        }


    }

}
