public class main {

    public static void main (String[] args){

    for (int i=0;i<100;i++){
        hilo h1 = new hilo(i);
        //h1.start();
        //h1.join();
        h1.run();
    }

    }

}
