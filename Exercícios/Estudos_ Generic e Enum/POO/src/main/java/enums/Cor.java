package enums;

public enum Cor {

    PRETO(0),
    VERMELHO(1),
    VERDE(2),
    AMARELO(3),
    AZUL(4),
    ROXO(5),
    CIANO(6),
    BRANCO(7);

    public final int codigo;

    Cor(int c){
        this.codigo = c;
    }

    public static Cor getByCodigo(int c){
        for(Cor cor: Cor.values()){
            if(c==cor.codigo){
                return cor;
            }
        }
        throw new IllegalArgumentException("código inválido");
    }


}
