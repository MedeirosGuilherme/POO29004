import java.util.Scanner;
import java.util.Random;

public class Segundo{

	public static void main(String[] args){
		int a,b, resultado;
		Scanner teclado = new Scanner(System.in);
		
		Random r = new Random();
	
		a = r.nextInt(101);
		b = 101;

		System.out.println("Tente acertar o número: ");
		while(a != b){
			b = teclado.nextInt();

			if(a < b){
				System.out.println("Errado, tente de novo! O número é menor que o digitado!");
				}
			else if(a > b){
				System.out.println("Errado, tente de novo! O número é maior do que o digitado!");
				}

		}

		System.out.println("Parabéns, você acertou! O número é " + a);

	}


}
