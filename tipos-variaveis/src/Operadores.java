public class Operadores {

    public static void main(String [] args){
      int numero1 = 1;
      int numero2 = 2;

      boolean simNao = numero1 == numero2;

      if(numero1 < numero2){
        System.out.println("a nossa condição é verdadeira");
      }
      
      System.out.println("numeroUm é igual a numeroDois? " + simNao);
        
      simNao = numero1 != numero2;
      
      System.out.println("numeroUm é diferente a numeroDois? " +simNao);
      
        
      simNao = numero1 > numero2;
      
      System.out.println("numeroUm é maior que o numeroDois? " +simNao);
        
    }
}


/*
public class Operadores {

    public static void main(String [] args){
      int a, b;

      a = 6;
      b = 6;
      String resultado = a == b ?"verdadeiro" : "falso";
      int resultado = a == b ? 1 : 0;    
      
      System.out.println(resultado);
        /*EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso";
        
    }
}
*/

/*public class Operadores {

    public static void main(String [] args){
      boolean variavel = true;

      variavel = !variavel;

      System.out.println(variavel);

    }
}
*/

/*
    public class Operadores {
    public static void main(String [] args){
      int numero = 5;
      //x repeticao
      //numero++;
      //numero --;


      System.out.println(numero ++);

      System.out.println(numero);

    }

}
*/




/*public class Operadores {
    public static void main(String [] args){
       int numero = 5;

       numero = - numero;

       System.out.println( numero);

       numero = + numero * -1;
       System.out.println(numero);

    }
}
*/

/*  Operadores de atribuição

    public class Operadores {
    public static void main(String [] args){
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println("É: "+nomeCompleto);
    }
*/

/*  Operadores Aritméticos

public class Operadores {
    public static void main(String [] args){
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        

    }
}


 */
 


