
import java.util.*;

public class Email {

    private String endereco;
    private String rotulo;

    public Email(String endereco, String rotulo) {
        // TODO implement here
        this.endereco = endereco;
        this.rotulo = rotulo;
    }

    public boolean atualizar(String novo) {
        this.endereco = novo;
        return true;
    }

    public String getEmail() {
        // TODO implement here
        return this.endereco;
    }

    public String getRot() {
        // TODO implement here
        return this.rotulo;
    }

}