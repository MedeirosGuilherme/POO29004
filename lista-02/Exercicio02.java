import java.util.Scanner;

public class Exercicio02{

     public static void main(String args[]){
        
        int n = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de números da sequência de Fibonacchi à serem exibidos: ");
        n = teclado.nextInt();

        int[] vet = new int[n];

        vet[0] = 1;

        int i = 0;
        System.out.println("Sequência de Fibonacci com " + n + " números: ");
        System.out.println("0");

        if(n != 1){
            vet[1] = 1;
            i = 2;
            while(i < n-1){
                vet[i] = vet[i-1] + vet[i-2];
                i++;
            }
            i = 0;
            while(i < n-1){
                System.out.println(vet[i]);
                i++;
            }
        }
     }
}