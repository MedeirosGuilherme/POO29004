import java.util.Scanner;

public class Segundo{

	public static void main(String[] args){
		int a,b, resultado;
		Scanner teclado;
		teclado = new Scanner(System.in);		

		System.out.print("Entre com um número: ");		
		a = teclado.nextInt();
		
		System.out.print("Entre com um número: ");		
		b = teclado.nextInt();

		resultado = a+b;
		System.out.println("Resultado: " + a + " + " + b + " = " + resultado);
		
	}


}
