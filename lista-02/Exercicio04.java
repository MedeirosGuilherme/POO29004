import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;

public class Exercicio04{

    public static void main(String args[]){
        
        Scanner keyboard = new Scanner(System.in);
        Random gen = new Random();
        int n = gen.nextInt(99)+1;
        int tentativa = 0;
        int aux;
        
        HashMap<Integer, Integer> tab = new HashMap<Integer, Integer>();

        while(true){
            System.out.println("Número sorteado! Digite um número para tentar acertar: ");
            tentativa = keyboard.nextInt();
            if(tentativa == n){
                System.out.println("Parabéns, você acertou o número: " + n);
                break;
            }
            else{
                if(tab.containsKey(tentativa)){
                    aux = tab.get(tentativa);
                    tab.put(tentativa, aux+1);
                    System.out.println("Ah não, você errou! Este número já foi digitado " + tab.get(tentativa) + " vezes!");
                }
                else{
                    tab.put(tentativa,1);
                    System.out.println("Ah não, você errou! Tente de novo!");
                }
            }
        }
    }
}