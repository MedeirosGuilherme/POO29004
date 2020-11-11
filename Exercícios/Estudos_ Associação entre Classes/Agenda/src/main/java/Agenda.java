
import java.util.*;

/**
 * 
 */
public class Agenda {

    private ArrayList<Contato> contatos;

    public Agenda() {
    }

    public boolean addCont(Contato novo) {
        contatos.add(novo);
        return true;
    }

    public boolean removeCont(int index) {
        contatos.remove(index);
        return false;
    }

    public boolean addTel(String num, String rot, int index) {

        Contato cont = contatos.get(index);
        cont.addTelefone(num,rot);
        return true;
    }

    public boolean removeTel(String num, int index) {
        Contato cont = contatos.get(index);
        contatos.remove(index);

        cont.removTelefone(num);
        contatos.add(cont);
        return true;
    }

    public boolean addEmail(String end, String rot, int index) {
        Contato cont = new Contato();
        cont = contatos.get(index);
        contatos.remove(index);
        cont.addEmail(end, rot);
        contatos.add(cont);
        return true;

    }

    public boolean removeEmail(String end, int index) {
        Contato cont = new Contato();
        cont = contatos.get(index);
        contatos.remove(index);
        cont.removEmail(end);
        contatos.add(cont);
        return true;
    }

    public boolean updateTel(String velho, String novo, int index) {
        Contato cont = new Contato();
        cont = contatos.get(index);
        contatos.remove(index);

        cont.updateTelefone(velho, novo);
        contatos.add(cont);
        return true;
    }

    public String toString() {
        // TODO implement here
        return "";
    }

    public int search(String n, String sn) {
        for (Contato conts: contatos
        ) {
            if(conts.getNome().equals(n) && conts.getSobrenome().equals(sn)){
                return(contatos.indexOf(conts));
            }
        }
        return -1;
    }
}