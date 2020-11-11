import com.sun.tools.jdeprscan.scan.Scan;

import java.io.*;
import java.rmi.server.ExportException;
import java.util.Scanner;

public class Principal {

    private Pessoa[] agenda = new Pessoa[2];

    public void ler(String arq){
        File arquivo;
        try {
            arquivo = new File(arq);
            Scanner leitor = new Scanner(arquivo);

            while (leitor.hasNextLine()){
                System.out.println(leitor.nextLine());
            }
            leitor.close();;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void escrever(String wr){
        File arquivo;
        try{
            arquivo = new File("arquivo.txt");
            FileWriter fwArquivo = null;
            if(arquivo.exists() == true){
                fwArquivo = new FileWriter(arquivo,true);
            }
            else{
                fwArquivo = new FileWriter(arquivo);
            }

            BufferedWriter bw = new BufferedWriter(fwArquivo);
            bw.write(wr+"\n");

            bw.close();
            fwArquivo.close();
        }  catch (Exception e){
            System.err.println("Erro!");
        }
    }

    public void salvarEmDisco(){
        File arquivo = new File("agenda.dat");
        try(    FileOutputStream fout = new FileOutputStream(arquivo);
                ObjectOutputStream oos = new ObjectOutputStream(fout)){
            oos.writeObject(this.agenda);

        }catch(Exception e){
            System.out.println("erro: " + e.toString());
        }
    }

    public void lerDoDisco(){
        File arquivo = new File("agenda.dat");
        try(FileInputStream fin = new FileInputStream(arquivo);
            ObjectInputStream oin = new ObjectInputStream(fin))
        {
            this.agenda = (Pessoa[]) oin.readObject();
            for (Pessoa p: this.agenda
                 ) {
                System.out.println(p.toString());
            }
        }
        catch(Exception e){
            System.out.println("Erro: " + e.toString());
        }
    }

    public static void main(String[] args) {
        Principal p = new Principal();
        p.agenda[0] = new Pessoa("João", "123");
        p.agenda[1] = new Pessoa("Maria", "456");

        p.salvarEmDisco();
        p.lerDoDisco();
    }
}
