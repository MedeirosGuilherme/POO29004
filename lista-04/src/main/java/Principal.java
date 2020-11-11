public class Principal {
    public static void main(String[] args) {

        // --------------------- Objeto e métodos da classe Retangulo-------------//
        // Criando retângulo com altura inadequada:
        Retangulo ret = new Retangulo(2,1);

        //modoficando altura e largura do retângulo:
        ret.modAltura(4);
        ret.modLargura(3);

        //Desenhando em UTF8
        ret.desenharUTF8();

        //Desenhando em ASCII
        ret.desenharASCII();
        ret.modLargura(5);
        ret.desenharASCII();

        System.out.println("\n\n");


        //-------------------------Objeto e métodos da classe Robot-------------------//

        Robot hal9000 = new Robot(0, 0, 10, 10, 'N');

        System.out.println(hal9000.getFrente());
        System.out.println(hal9000.getPosY());
        System.out.println(hal9000.getPosX());

        hal9000.explore("EMMDMM");
        System.out.println("\n\n");

        //-------------------- Objetos e métodos da classe Soldado -----------------------------------------\\

        Soldado ryan = new Soldado(0,"Pvt. Ryan");
        ryan.mov();
        ryan.mov(2);
        ryan.atacar();

        System.out.println("Tamanho do exército: " + Soldado.getTamanho());

        Soldado miller = new Soldado(0, "Cpt. John Miller");
        Soldado reiben = new Soldado(0, "Sgt. Richard Reiben");
        Soldado horvat = new Soldado(0, "Sgt. Michael Horvat");
        Soldado upham = new Soldado(0, "Corporal Tomathy Upham");
        Soldado melish = new Soldado(0, "Pvt. Stanley Mellish");
        Soldado dewintt = new Soldado(0, "Lieutenant DeWintt");
        Soldado anderson = new Soldado(0, "Colonel Walter Anderson");
        Soldado hamill = new Soldado(0, "Cpt. Fred Hamill");
        Soldado wade = new Soldado(0, "Mdc. Irwin Wade");
        System.out.println("Tamanho do exército: " + Soldado.getTamanho());

        miller.atacar();    //método atacar sem entrada
        wade.atacar("faca"); //método atacar com entrada não listada
        anderson.atacar("punho"); //método atacar com entrada
    }
}
