package bin2;

public class ThreadCommunication {
    public static void main(String[] args) {
        Q q=new Q();
        Producer producer = new Producer(q);
        Consumer consumer = new Consumer(q);
        Thread p = new Thread(producer);
        Thread c = new Thread(consumer);
        p.start();
        c.start();
    }
}
