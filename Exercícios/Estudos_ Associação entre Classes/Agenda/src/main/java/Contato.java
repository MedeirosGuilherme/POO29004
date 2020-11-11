
import java.time.LocalDate;
import java.util.*;

public class Contato {

    private ArrayList<Email> email;
    private ArrayList<Telefone> telefone;
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;

    public void Contato(String n, String s, LocalDate dn) {
        this.nome = n;
        this.sobrenome = s;
        this.dataNasc = dn;
        this.email = new ArrayList<>(); // construir arraylists
    }

    public void Contato(String n, String s, LocalDate dn, String em_end, String em_rot, String tel_num, String tel_rot) {
        this.nome = n;
        this.sobrenome = s;
        this.dataNasc = dn;
        Email novoEmail = new Email(em_end,em_rot);
        Telefone novoTel = new Telefone(tel_num,tel_rot);
        
        email.add(novoEmail);
        telefone.add(novoTel);    
    }

    public boolean addTelefone(String num, String rot) {
        Telefone novoTel = new Telefone(num,rot);
        telefone.add(novoTel);
        return true;
    }

    public boolean addEmail(String end, String rot) {
        Email novoEmail = new Email(end,rot);
        email.add(novoEmail);        
        return true;
    }

    public boolean removTelefone(String num) {
        for (Telefone tel:telefone
             ) {
            if(tel.getTel().equals(num)){
                telefone.remove(tel);
                return true;
            }
        }
        return false;
    }

    public boolean removEmail(String end) {
        for (Email mail:email
        ) {
            if(mail.getEmail().equals(end)){
                email.remove(mail);
                return true;
            }
        }
        return false;
    }

    public boolean updateTelefone(String numOld, String numNew) { //Mudança UML
        String rot;
        for (Telefone tel:telefone
        ) {
            if(tel.getTel().equals(numOld)){
                rot = tel.getRot();
                telefone.remove(tel);   //tel.setNum
                addTelefone(numNew,rot);
                return true;
            }
        }
        return false;
    }

    public boolean updateEmail(String endOld, String endNew) { //Mudança UML
        String rot;
        for (Email mail:email
        ) {
            if(mail.getEmail().equals(endOld)){
                rot = mail.getRot();
                email.remove(mail);
                addEmail(endNew, rot);
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "Nome: " + this.nome + " " + this.sobrenome + "\n" + "Telefones: " + telefone.toString() + "\n" + "Emails: " + email.toString() + "\n" + "Data de Nascimento: " + dataNasc.toString();
    }

    public String getNome(){
        return this.nome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }

}