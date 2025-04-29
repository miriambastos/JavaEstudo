public class Arrays {
    public static void main(String[] args) {
        String[] personagem = new String[8];
        personagem[0] = "Cersei Lannister";
        personagem[1] = "Daenerys Targaryen";
        personagem[2] = "Jon Snow";
        personagem[3] = "Tyrion Lannister";
        personagem[4] = "Sansa Stark";
        personagem[5] = "Arya Stark";
        personagem[6] = "Melisandre";
        personagem[7] = "Samwell Tarly";

        System.out.println(personagem[4]);

        for (int i = 0; i < 7 ; i++) {
            System.out.println(personagem[i]);

        }


    }
}
