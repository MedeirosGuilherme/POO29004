public class Carro{

    //atributos
    private String cor;
    private String placa;
    private String modelo;
    private String marca;

    private boolean porta1;
    private boolean porta2;// Sendo a porta 1 a do motorista, a 2 a do passageiro,
    private boolean porta3;// a 3 a do passageiro traseiro esquerdo e a 4 a do passageiro
    private boolean porta4;// traseiro direito

    private int velocidadeAtual;
    private int marchaAtual;


    // métodos:

    public Carro(String brand, String color, String model){
        this.marca = brand;
        this.cor = color;
        this.modelo = model;
    }

    public String getMarca(){
	return this.marca;
    }

    public String getCor(){
	return this.cor;
    }

    public String getModelo(){
	return this.modelo;
    }

    public int getVelocidade(){
	return this.velocidadeAtual;
    }

    public int getMarcha(){
	return this.marchaAtual;
    }

    public boolean abrirPorta(int qual){

        if(qual == 1){
            if(porta1){
                System.out.println("Porta já aberta!");
		return false;
            }
	    porta1 = true;
        }

        if(qual == 2){
            if(porta2){
                System.out.println("Porta já aberta!");
                return false;
            }
	    porta2 = true;
        }

        if(qual == 3){
            if(porta3){
                System.out.println("Porta já aberta!");
                return false;
            }
	    porta3 = true;
        }

        if(qual == 4){
            if(porta4){
                System.out.println("Porta já aberta!");
                return false;
            }
	    porta4 = true;
        }
	System.out.println("Porta aberta!");
        return true;
    }

	public boolean fecharPorta(int qual){

        if(qual == 1){
            if(porta1 == false){
                System.out.println("Porta já fechada!");
                return false;
            }
	    porta1 = false;
        }

        if(qual == 2){
            if(porta2 == false){
                System.out.println("Porta já fechada!");
                return false;
            }
	    porta2 = false;
        }

        if(qual == 3){
            if(porta3 == false){
                System.out.println("Porta já fechada!");
                return false;
            }
	    porta3 = false;
        }

        if(qual == 4){
            if(porta4 == false){
                System.out.println("Porta já fechada!");
                return false;
            }
	    porta4 = false;
        }
	System.out.println("Porta fechada!");
        return true;
    }

    public void trocarMarcha(int nova){
        marchaAtual = nova;
    }

    public void acelerar(int intensidade){
        velocidadeAtual = velocidadeAtual + intensidade;
    }

    public void frear(int intensidade){
        velocidadeAtual = velocidadeAtual - intensidade;
    }

    public void trocarCor(String nova){
        cor = nova;
    }

    public void reemplacar(String nova){
        placa = nova;
    }

}