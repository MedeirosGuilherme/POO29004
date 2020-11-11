import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Triangulo t = new Triangulo();

        System.out.println("\n");

        System.out.println("Triangulo equilátero: Teste");
        System.out.println(t.verificarTipo(2,2,2));

        System.out.println("\n");

        System.out.println("Triângulo não equilátero: Teste");
        System.out.println(t.verificarTipo(2,1,3));


    }
}
