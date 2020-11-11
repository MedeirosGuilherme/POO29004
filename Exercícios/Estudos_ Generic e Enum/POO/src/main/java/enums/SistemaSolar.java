package enums;

public enum SistemaSolar {
    MERUCRIO(1),
    VENUS(2),
    TERRA(3),
    MARTE(4),
    JUPTER(5),
    SATURNO(6),
    URANU(7),
    NETUNO(8);

    public final int posicao;

    SistemaSolar(int pos){
        this.posicao = pos;
    }

    public static SistemaSolar getByPosition(int c){
        for(SistemaSolar sis: SistemaSolar.values()){
            if(c== sis.posicao){
                return sis;
            }
        }
        throw new IllegalArgumentException("Posição inválida.");
    }
}
