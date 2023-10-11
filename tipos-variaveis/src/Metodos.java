public class Metodos {
     /**
     * @param num1
     * @param num2
     * @return
     */
    public double somar( int num1, int num2){
        //LOGICA - FINALIDADE DO MÉTODO
        return num2 ;
     }

     public void imprimir(String textoString){

        //LOGICA - FINALIDADE DO MÉTODO
        //AQUI NÃO PRECISA DE RETURN
        //POIS NÃO SERÁ RETORNADO NENHUM RESULTADO

     }

     //throws Execption : indica que o método ao ser utilizado
     //poderá gerar uma exceção
     public int dividir (int dividendo , int divisor) throws Exception{
        return divisor;}

        //Este método não pode ser visto por outra classes no private
        private void metodoPrivado(){}
        
        //alguns equívocos estruturais
        public void validar(){
            //Este médtodo deveria retornar algum valor
            //No caso boolenan (true ou false)
        }

        public void calcularEnviar(){
            //U método deve representar uma única responsabilidade
        }

        public void gravarCliente(String nome, String cpf, Integer cliente){
            //Este método tem a finalidade de gravar
            //informações de um client, por que não criar 
            //um objeto cliente e passar como parâmentro ?
            //Veja abaixo

        }

        public void gravarCliente(Cliente cliente){}
        //ou
        public void gravar(Cliente cliente){}



        

}
