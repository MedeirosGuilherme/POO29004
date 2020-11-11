public class Principal {

    public static void main(String[] args) {
        Dimensao dim = new Dimensao(10,10,10);

        Telefone t = new Telefone(010101,"20n","modelo1",4,dim);

        System.out.println(t);

        SemFio sf = new SemFio(1111,"21n","SemfioModel",2,dim,2.4,10,4);

        System.out.println(sf);

        System.out.println(t.olaMundo());
        System.out.println(sf.olaMundo());

        Telefone sf2 = new SemFio(1111,"21n","SemfioModel",2,dim,2.4,10,4);

        System.out.println(sf2.toString());

        if(sf2 instanceof SemFio){  // Uso do instanceof para verificar o tipo
            System.out.println("Sem fio");
        }
        else
            System.out.println("Com fio");

        sf.ruido();
        ((SemFio) sf2).ruido();
    }
}
