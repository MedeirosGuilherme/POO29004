public class Retangulo {

    private int altura;
    private int largura;//atributos de altura e largura do retangulo

    public Retangulo(){
        this(4,4);//construtor genérico: constrói retangulo com 4 de altura e de largura
    }

    public Retangulo(int height, int width){//construtor versátil
        if(height <= 1 || width <= 1){
            System.out.println("Tamanho irregular - Retângulo criado com altura e largura de tamanho 4");
            altura = 4;
            largura = 4;
        }
        else{
            this.altura = height;
            this.largura = width;
        }
    }

    //método que modifica a altura do retângulo
    public void modAltura(int newHeight){
        if(newHeight > 1){
            altura = newHeight;
        }
        else{
            System.out.println("Tamanho impossível para a altura. Redefinindo altura original de: " + this.altura);
        }
    }

    //método que modifica a largura do retângulo
    public void modLargura(int newWidth){
        if(newWidth > 1){
            largura = newWidth;
        }

        else{
            System.out.println("Tamanho impossível para a largura. Redefinindo largura original de: " + this.largura);
        }
    }

    //método que desenha o retângulo em ASCII
    public void desenharASCII(){
        int alt = 0;
        int larg = 0;
        StringBuilder extremos = new StringBuilder("+");
        StringBuilder meios = new StringBuilder("|");

        while(larg < this.largura-2){
            extremos.append("-");
            meios.append(" ");
            larg++;
        }

        extremos.append("+");
        meios.append("|");

        System.out.println(extremos.toString());
        while(alt < this.altura-2){
            System.out.println(meios.toString());
            alt++;
        }
        System.out.println(extremos.toString());
    }

    //método que desenha o retângulo em UTF8
    public void desenharUTF8(){
        int alt = 0;
        int larg = 0;
        StringBuilder extremoUp = new StringBuilder("\u250c");
        StringBuilder extremoDown = new StringBuilder("\u2514");
        StringBuilder meios = new StringBuilder("\u2502");

        while(larg < this.largura-2){
            extremoUp.append("\u2500");
            extremoDown.append("\u2500");
            meios.append(" ");
            larg++;
        }
        extremoUp.append("\u2510");
        meios.append("\u2502");
        extremoDown.append(("\u2518"));

        System.out.println(extremoUp.toString());
        while(alt < this.altura-2){
            System.out.println(meios.toString());
            alt++;
        }
        System.out.println(extremoDown.toString());

    }
}
