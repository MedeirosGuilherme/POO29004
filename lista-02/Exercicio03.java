import java.util.Scanner;

public class Exercicio03{

    public static void main(String args[]){
        System.out.println("Digite o número pra ser verificado: ");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();

        int res = 0;
        int div = 1;

        while(div < n){
            if(n % div == 0){
                res = res + div;
            }
            div++;
        }

        if(res == n){
            System.out.println("O número " + n + " é perfeito!");
        }
        else{
            System.out.println("O número " + n + " não é perfeito!");
        }
    }
}