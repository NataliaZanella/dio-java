public class Comentarios {
    public static void main(String[] args) {
        //Este é um comentario de uma linha

        /*
         * Este é um comemntário 
         * que pode ser mais detalhado
         * quando necessário
         */



    }
    
    /**
     * Esta duas estrelinhas acima é para
     * identificar que você pretende elaborar um comentário
     * a nível de documentação.
     * 
     */

    public void metodo(){

    }



/*
 * Este método foi elaborado as pressas
 * por isso eu abrevei o nome das variáveis
 * mas olha, ele tem a finalidade de somar ou  multiplicar
 * dois números
 */

//Um comentário, não possui a finalidade de amenizar um algoritmo não estruturado, conforme as convenções da linguagem.
public int somaMultiplica (int n, int x, String m){
    int r = 0; // r é igual ao resultado
    if (m == "M"){ // M= multiplicação
        r= n * x;
    }else{
        // se não soma mesmo
        r = n + x;
    }
    return r;
}





    
}



