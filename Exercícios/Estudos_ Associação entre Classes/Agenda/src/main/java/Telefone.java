
import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.*;

public class Telefone {

    private String numero;
    private String rotulo;

    public Telefone(String numero, String rotulo) {

        this.numero = numero;
        this.rotulo = rotulo;

    }

    public boolean atualizar(String novo) {
        // TODO implement here
       this.numero = novo;
       return true;
    }

    public String toString() {
        // TODO implement here
        return this.numero + " " + this.getRot();
    }

    public String getTel() {
        // TODO implement here
        return this.numero;
    }

    public String getRot() {
        // TODO implement here
        return this.rotulo;
    }
}