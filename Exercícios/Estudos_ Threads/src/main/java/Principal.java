public class Principal {

    public static void main(String[] args) {

        Thread comHeranca = new Fluxo1();
        Thread comInterface = new Thread(new Fluxo2());

        comHeranca.start();
        comInterface.start();

        System.err.println("Fim do programa");

        Thread sleepHead = new Fluxo3("Sleepy");
        sleepHead.start();
        System.out.println("Depois do start e antes do join");
        try {
            sleepHead.join();
            System.out.println("Depois do join");
        } catch (InterruptedException e) {
            System.err.println(e.toString());
        }

    }
}
