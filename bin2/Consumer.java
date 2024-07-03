package bin2;

public class Consumer implements Runnable{
    Q q=null;
    public Consumer() {
    }

    public Consumer(Q q) {
        this.q = q;
    }

    @Override
    public void run() {
        while (true){
            q.get();
        }
    }
}
