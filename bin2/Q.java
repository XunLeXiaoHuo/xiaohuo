package bin2;

public class Q {
    private String name=null;
    private String id=null;
    boolean bFull=false;
    static int i=1,j=1;
    public Q() {
    }

    public Q(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public synchronized void set(String name,String id){
        if (bFull){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        this.setId(id);
        System.out.println("第"+(i++)+"次生产结束");
        bFull=true;
        this.notify();
    }
    public synchronized void get(){
        if (!bFull){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("开始消费---");
        System.out.println(this.getName()+"---"+this.id);
        System.out.println("第"+(j++)+"次消费结束");
        bFull=false;
        this.notify();

    }

}
