public class Telefone {
    private int codigo;
    private String numSerie, modelo;
    private float peso;
    private Dimensao dim;

    public Telefone(int codigo, String numSerie, String modelo, float peso, Dimensao dim) {
        this.codigo = codigo;
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.peso = peso;
        this.dim = dim;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "codigo:" + codigo +
                ", numSerie:'" + numSerie + '\'' +
                ", modelo:'" + modelo + '\'' +
                ", peso:" + peso +
                ", dim:" + dim +
                '}';
    }

    public void ola(){
        System.out.println("Ola, sou um telefone");
    }

    public String olaMundo(){
        return "Ola, sou um telefone";
    }
}
