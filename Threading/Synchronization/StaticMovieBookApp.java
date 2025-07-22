class BookTheatreSeat {
    static int total_seats = 20;
    
    static synchronized void bookSeat(int seats) {
        if(total_seats >= seats) {
            System.out.println(seats + " seats booked successfully");
            total_seats = total_seats - seats;
            System.out.println("seats left : " + total_seats);
        } else {
            System.out.println(" Sorry seats cannot be booked...!!");
            System.out.println("seats left : " + total_seats);
        }
    }
}

class MyThread1 extends Thread {
    BookTheatreSeat b;
    int seats;
    
    MyThread1(BookTheatreSeat b, int seats) {
        this.b = b;
        this.seats = seats;
    }
    
    public void run() {
        b.bookSeat(seats);
    }
}

class MyThread2 extends Thread {
    BookTheatreSeat b;
    int seats;
    
    MyThread2(BookTheatreSeat b, int seats) {
        this.b = b;
        this.seats = seats;
    }
    
    public void run() {
        b.bookSeat(seats);
    }
}

public class StaticMovieBookApp extends Thread {
    static BookTheatreSeat b;
    int seats;
    
    public void run() {
        b.bookSeat(seats);
    }
    
    public static void main(String[] args) {
        b = new BookTheatreSeat();
        MyThread1 t1 = new MyThread1(b, 7);  // Changed b1 to b
        t1.start();
        
        MyThread2 t2 = new MyThread2(b, 6);  // Changed b1 to b
        t2.start();
		
		
		//------------------------------------------------------------
		
		BookTheatreSeat b2 = new BookTheatreSeat();
		
		MyThread1 t3 = new MyThread1(b2, 5);
		t3.start();
		
		MyThread2 t4 = new MyThread2(b2, 9);
		t4.start();
		
    }
}