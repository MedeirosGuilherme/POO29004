public class Fluxo3 extends  Thread {

    public Fluxo3(String nome){
        super(nome);
    }

    public void run(){
        try{

            System.out.println(this.getName()+" vai dormir...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println(e.toString());;
        }
        System.out.println(this.getName() + "acordou...");
    }

}
