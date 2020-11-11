import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        String caminho = "/home/aluno/Documentos";
        String destino = "/home/aluno/Imagens";
        boolean mThread = false;

        File dir = new File(caminho);
        ArrayList<File> arquivos = new ArrayList<File>();
        File[] files = dir.listFiles();

        int i = 0;
        while(i<files.length){
            arquivos.add(files[i]);
            i++;
        }

        i = 0;

        if(mThread == false){
            Compactador comp = new Compactador(caminho, destino, false, arquivos);
            comp.run();
        }

        if(mThread == true) {
            while (i < files.length) {
                //ZipUnZip.compressDirectoryRecursively("/home/aluno/Documentos/" + files[i].getName(), "/home/aluno/Imagens/" + files[i].getName());
                Compactador comp = new Compactador(caminho + "/" + files[i].getName(), destino + "/" + files[i].getName() + ".zip", true);
                comp.run();
                i++;
            }
        }
    }
}

