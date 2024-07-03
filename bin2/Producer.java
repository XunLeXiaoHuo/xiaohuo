package bin2;

public class Producer implements Runnable{
    Q q=null;
    int i =1;

    public Producer() {
    }

    public Producer(Q q) {
        this.q = q;
    }

    @Override
    public void run() {
        while(true){
            if ((i++)%2==0){
                q.set("华为","P60");
            }
            else {
                q.set("传音","X80");
            }
        }
    }
}
