public class EstruturaRepeticao {

    public static void main(String[] args) {

        System.out.println("Contador com While");
        int contador = 0;
        while(contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        System.out.println("====================================================================");

        System.out.println("Contador com For - A execução apenas se a condição for verdadeira");
        for(int count = 0; count <= 5; count++) {
            System.out.println("Contador: " + count);
        }

        System.out.println("====================================================================");

        System.out.println("Contador com Do While - A primeira execução é feita antes da verificação");
        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while(contador <= 5);
    }
}
