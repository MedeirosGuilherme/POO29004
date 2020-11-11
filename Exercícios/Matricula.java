import java.util.Scanner;
import java.util.Random;

public class Matricula{

	public static void main(String[] args){

	Scanner teclado = new Scanner(System.in);
	long matr;
	System.out.print("Digite sua matricula: ");
	matr = teclado.nextLong();
	long divisor;
	
	long result=0;
	divisor = 100000000;
	long d = 10;
	
	while(d > 2){
		result = result + (matr/divisor)*d;
		matr = matr % divisor;
		System.out.println(matr);
		divisor = divisor/10;
		d--;
		}

	result = (result*10)%11;
	System.out.println("Seu dígito é: " + result);		
	
	}

}
