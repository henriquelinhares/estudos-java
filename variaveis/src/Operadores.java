public class Operadores {
    public static void main(String[] args) {
        String concatenacao = "?";

        concatenacao = 1+1+1+"1"; /*O resultado será 31, pois a partir do momento que ele percerbe que tem um texto ele começa a concatenar em vez de somar. */

        System.out.println(concatenacao); 

        concatenacao = 1+"1"+1+1; /*O resultado aqui será 1111, pois quando ele percebe que tem um texto e faz a concatenação, todos os outros em diante também são lidos como texto. */

        System.out.println(concatenacao);
    }
}
