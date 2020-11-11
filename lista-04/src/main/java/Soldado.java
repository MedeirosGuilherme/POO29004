public class Soldado {

    private static int tamanhoExercito;
    private final int distanciaPadrao = 1;
    private final String armaPadrao = "Fuzil";
    private int pos;
    private String nome;


    public Soldado(int posInicial, String dogtag){
        tamanhoExercito++;
        this.pos = posInicial;
        this.nome = dogtag;
    }


    public Soldado(){
        this(0, "John Doe");
    }

    public static int getTamanho(){
        return tamanhoExercito;
    }

    public void mov(int distancia){
        System.out.println("Soldado " + this.nome + " em movimento, senhor!");
        this.pos = this.pos + distancia;
        System.out.println("Posição final do Soldado: " + this.nome + " = " + this.pos);
    }

    public void mov(){
        this.mov(distanciaPadrao);
    }

    public void atacar(String arma){
        if(tamanhoExercito < 10){
            System.out.println("Ainda não, esperando o exército ficar maior.");
        }
        else{
            if(arma == "fuzil" || arma == "baioneta" || arma == "punho"){
                System.out.println("Soldado " + this.nome + " atacando com " + arma);
            }

            else{
                System.out.println("Eu " + this.nome + ", não possuo esta arma! Atacando com fuzil");
            }
        }
    }

    public void atacar(){
        this.atacar("fuzil");
    }
}
