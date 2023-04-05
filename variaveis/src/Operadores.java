public class Operadores {
    public static void main(String[] args) {
        String concatenacao = "?"; //Concatenação

        concatenacao = 1+1+1+"1"; /*O resultado será 31, pois a partir do momento que ele percerbe que tem um texto ele começa a concatenar em vez de somar. */

        System.out.println(concatenacao); 

        concatenacao = 1+"1"+1+1; /*O resultado aqui será 1111, pois quando ele percebe que tem um texto e faz a concatenação, todos os outros em diante também são lidos como texto. */

        System.out.println(concatenacao);

        int numero = 5; //Operação unaria 
        
        numero = - numero; //Aqui o valor de número ficará negativo
        numero = + numero; //Aqui, o simbolo de + é um operador para somar e não converte para positivo.
        numero = numero * -1; //Essa é a forma de deixar o valor positivo. 
        
        System.out.println(numero);

        

    }
}

