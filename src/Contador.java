import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        int numeros[] = new int[2];
        Scanner Terminal = new Scanner(System.in);

        lerNumeros(numeros, Terminal);
        
        contar(numeros);

 //       for (int numero: numeros){
 //           System.out.print(numero+" ");
 //       }
 //       System.out.println("");

        Terminal.close();
    }

    static void lerNumeros(int[] numeros, Scanner Terminal){
        do {
            System.out.print("Informe o primeiro número: ");
            while (!Terminal.hasNextInt()) {
                System.out.println("");
                System.out.print("Informe um número inteiro maior que zero: ");
                Terminal.next();
            }
            numeros[0] = Terminal.nextInt();
        } while (numeros[0] <= 0);

        do {
            System.out.print("Informe o segundo número: ");
            while (!Terminal.hasNextInt()) {
                System.out.println("");
                System.out.print("Informe um número inteiro maior que zero: ");
                Terminal.next();
            }
            numeros[1] = Terminal.nextInt();
        } while (numeros[1] <= 0);
    }

    static void contar(int[] numeros) throws ParametrosInvalidosException {

        int tamanho = numeros[1] - numeros[0];

        if (tamanho <= 0){
            throw new ParametrosInvalidosException();
        }
         for (int i = 1; i <= tamanho;i++){
            System.out.println(i);
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException () {
        System.out.println("O segundo número deve ser maior que o primeiro!");
    }
}