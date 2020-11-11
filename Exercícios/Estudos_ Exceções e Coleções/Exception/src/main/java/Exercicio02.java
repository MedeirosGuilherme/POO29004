import java.util.Scanner;

public class Exercicio02 {
    private Scanner ler = new Scanner(System.in);

    public int lerNumero(){
        System.out.println("Entre com um número: ");
        return ler.nextInt();
    }

    public double divisao(int a, int b){
        if(b == 0){
            throw new ArithmeticException();
        }
        return a/b;
    }
}
