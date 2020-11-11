import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Principal {
    public static void main(String[] args) {
        try {
            MaskFormatter mask = new MaskFormatter(("(##) #####-####")) ;
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
