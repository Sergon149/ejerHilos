public class hilo extends Thread {

    int num =0;
    int ale = (int) Math.floor(Math.random()*4000);

    public hilo(int num) {this.num=num;}

    public void run() {

        try {
            Thread.sleep(ale);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Soy el hilo numero "+num+" y he dormido por "+ale+" milisegundos");
    }
}

