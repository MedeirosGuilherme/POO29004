public class Triangulo {

    private int ladoA;
    private int ladoB;
    private int ladoC;

    public Triangulo(){

    }

    public String verificarTipo(int a, int b, int c){
        if(a == 0 || b == 0 || c == 0 || a < 0 || b < 0 || c < 0){
            return "Não é um triângulo";
        }

        
        else {
            if (a == b && b == c) {
                return "equilátero";
            }

            if(((a == b) && b != c) || ((b == c) && c != a) || ((a == c) && c!= b)){
                return "isósceles";
            }

            if(a !=b && b != c){
                return "escaleno";
            }
            else{
                return "??";
            }
        }
    }
}

