public class AboutMe {
    /**
     * @param args
     * @param i TODO
     */
    public static void main(String[] args, int i) {
        //os argumentos começam com indice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + i + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
