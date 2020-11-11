import enums.DiasDaSemana;
import enums.LinguagensOO;
import generic.Caixa;

public class Principal {

    public static void main(String[] args) {
     //   DiasDaSemana aulasPOO[] = {DiasDaSemana.TERCA, DiasDaSemana.QUINTA};
    //    LinguagensOO linguagens[] = {LinguagensOO.CPP, LinguagensOO.JAVA};

        Caixa<String> c = new Caixa<>();
        Caixa<Pessoa> d = new Caixa<>();

        String s = "Olá mundo";
        Pessoa p = new Pessoa("Joao");
        c.setDado(s);
        d.setDado(p);

        String nova = c.getDado();
        Pessoa outra = d.getDado(); // Erro somente na execução

    }
}
