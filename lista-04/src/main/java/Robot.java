public class Robot {

    private int posX;
    private int posY;//posição atual em x e y

    private int maxX;
    private int maxY;//posição máxima em x e y

    private char frente;

    //construtor versátil: possibilita criar o robo em dada posição inicial para onde aponta sua frente:
    public Robot(int x, int y, int xMax, int yMax, char f){
        if(f == 'N' || f == 'S' || f == 'O' || f == 'L'){
            this.frente = f;
        }

        else{
            this.frente = 'N';
            System.out.println("Frente inadequada, reposicionando frente para o norte.");
        }

        if(x > xMax || y > yMax || xMax != yMax){
            System.out.println("Area de exploração inadequada. Criando área com tamanho 10x10 e posicionando o robo na posição 0,0");
        }
        else{
            this.posX = x;
            this.posY = y;
            this.maxX = xMax;
            this.maxY = yMax;
        }
    }

    //Construtor genérico: Cria área com 10x10 e frente em Norte.
    public Robot(){
        this(0,0,10,10,'N');
    }

    //métodos gets
    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public char getFrente() {
        return frente;
    }

    //Método de exploração: Condicionais dentro de um laço, verificando dados do robô e realizando operações
    public void explore(String plano){
        int i = 0;
        char c;
        while(i < plano.length()) {
            c = plano.charAt(i);
            char front = this.frente;

            if (c == 'E') {

                if (front == 'N') {
                    this.frente = 'O';
                }
                if (front == 'O') {
                    this.frente = 'S';
                }
                if (front == 'S') {
                    this.frente = 'L';
                }
                if (front == 'L') {
                    this.frente = 'N';
                }
            } else if (c == 'D') {
                if (front == 'N') {
                    this.frente = 'L';
                }
                if (front == 'L') {
                    this.frente = 'S';
                }
                if (front == 'S') {
                    this.frente = 'O';
                }
                if (front == 'O') {
                    this.frente = 'N';
                }
            } else if (c == 'M') {
                if (this.frente == 'N') {
                    if (this.posY == maxY) {
                        System.out.println("Excedido posição máxima em Y");
                    } else {
                        posY++;
                    }
                }
                if (this.frente == 'L') {
                    if (this.posX == 0) {
                        System.out.println("Excedido posição mínima em X");
                    } else {
                        posX--;
                    }
                }
                if (this.frente == 'S') {
                    if (this.posY == 0) {
                        System.out.println("Excedido posição mínima em Y");
                    } else {
                        posY--;
                    }
                }
                if (this.frente == 'O') {
                    if (this.posX == maxX) {
                        System.out.println("Excedido posição máxima em X");
                    } else {
                        posX++;
                    }
                }
            } else {
                System.out.println("Comando desconhecido... passando para o próximo");
            }
            i++;
        }
        System.out.println("Posição em x: " + this.getPosX());
        System.out.println("Posição em y: " + this.getPosY());
        System.out.println("Frente apontando para: " + this.getFrente());
    }
}
