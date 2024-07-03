package bin;

public class TicketWindowThread implements Runnable{
    static int ticket=100;
    static Object obj=new Object();

    synchronized void sellTicket(){
        while (ticket >= 0) {
            try {
                if (ticket>0) {
                    Thread.sleep(10);
                    ticket--;
                    System.out.println("售票窗口" + Thread.currentThread().getName() + "售出1张票，剩余票数：" + ticket);
                }
                else {
                    System.out.println("售票窗口"+Thread.currentThread().getName()+"已售空");
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    @Override
    public void run() {
        synchronized (obj) {
            while (ticket >= 0) {
                try {
                    if (ticket>0) {
                        Thread.sleep(10);
                        ticket--;
//                        number++;
                        System.out.println("售票窗口" + Thread.currentThread().getName() + "售出1张票，剩余票数：" + ticket);
                    }
                    else {
                        System.out.println("售票窗口"+Thread.currentThread().getName()+"已售空");
                        break;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
