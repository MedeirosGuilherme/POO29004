public class Exercicio01{
    public static void main(String args[]){
	
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[2]);
		char op = args[1].charAt(0);

		double res = 0;
		int flag = 0;

		switch(op){
			case '+':
			res = a + b;
			break;

			case '-':
			res = a - b;
			break;

			case '*':
			res = a*b;
			break;

			case '/':
			res = a/b;
			break;

			default:
			System.out.println("Erro: '" + op + "' não é um operador válido!");
			flag = 1;
			break;
		}

		if(flag == 0){
			System.out.println("Resultado: " + res);
		}
    }
}
