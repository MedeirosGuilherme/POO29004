public class Fluxo1 extends Thread {
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.err.println("Fazendo uso de herança");
        }
    }
}
