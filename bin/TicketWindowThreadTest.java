package bin;

public class TicketWindowThreadTest {
    public static void main(String[] args) {
        TicketWindowThread ticketWindowThread = new TicketWindowThread();

        for (int i = 1; i <4; i++) {
            new Thread(ticketWindowThread,"ÊÛÆ±´°¿Ú"+i).start();
        }

    }
}
//        TicketWindowThread ticketWindowThread2 = new TicketWindowThread();
//        TicketWindowThread ticketWindowThread3 = new TicketWindowThread();
//        Thread thread1 = new Thread(ticketWindowThread1);
//        Thread thread2 = new Thread(ticketWindowThread2);
//        Thread thread3 = new Thread(ticketWindowThread3);
//        thread1.setName("1");
//        thread2.setName("2");
//        thread3.setName("3");
//        thread1.start();
//        thread2.start();
//        thread3.start();
//            ticketWindowThread.sellTicket();
