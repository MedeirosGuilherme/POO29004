import java.io.File;
import java.util.ArrayList;

public class Compactador implements Runnable {

    private String caminho;
    private String destino;
    boolean mThread;
    ArrayList<File> arquivos = new ArrayList<File>();

    public void setArquivos(ArrayList<File> arquivos) {
        this.arquivos = arquivos;
    }

    public Compactador(String caminho, String destino, boolean mThread) {
        this.caminho = caminho;
        this.destino = destino;
        this.mThread = mThread;
    }

    public Compactador(String caminho, String destino, boolean mThread, ArrayList<File> arquivos) {
        this.arquivos = arquivos;
        this.mThread = mThread;
        this.caminho = caminho;
        this.destino = destino;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setmThread(boolean mThread) {
        this.mThread = mThread;
    }

    @Override
    public void run() {
        if(this.mThread == true) {
            File cam = new File(this.caminho);

            if (cam.isFile()) {
                ZipUnZip.compressOneFile(this.caminho, this.destino);
            }

            if (cam.isDirectory()) {
               ZipUnZip.compressDirectoryRecursively(this.caminho, this.destino);
            }
        }

        else{
            for (File cam:arquivos) {
                if (cam.isFile()) {
                    ZipUnZip.compressOneFile(this.caminho + "/" + cam.getName(), this.destino +"/" + cam.getName() + ".zip");
                    }

                if (cam.isDirectory()) {
                    ZipUnZip.compressDirectoryRecursively(this.caminho + "/" + cam.getName(), this.destino +"/" + cam.getName() + ".zip");
                    }
                }
            }
        }


    public void compactarSingleThread(){
        File cam = new File(this.caminho);
        if(cam.isFile()){
            ZipUnZip.compressOneFile(this.caminho,this.destino);
        }

        if(cam.isDirectory()){
            ZipUnZip.compressDirectoryRecursively(this.caminho,this.destino);
        }
    }
}
