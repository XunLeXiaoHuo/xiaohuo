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
                    System.out.println("��Ʊ����" + Thread.currentThread().getName() + "�۳�1��Ʊ��ʣ��Ʊ����" + ticket);
                }
                else {
                    System.out.println("��Ʊ����"+Thread.currentThread().getName()+"���ۿ�");
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
                        System.out.println("��Ʊ����" + Thread.currentThread().getName() + "�۳�1��Ʊ��ʣ��Ʊ����" + ticket);
                    }
                    else {
                        System.out.println("��Ʊ����"+Thread.currentThread().getName()+"���ۿ�");
                        break;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
