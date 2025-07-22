//SYNCHRONIZED BLOCK EXAMPLE

// SYNCHRONIZED METHOD EXAMPLE

class BookTheatreSeat
{
	int total_seats = 10;
	synchronized void bookSeat(int seats)
	{
	
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		
		synchronized(this)
		{
			if(total_seats>=seats)
			{
				System.out.println(seats+"seats booked successfully");
				total_seats = total_seats-seats;
				System.out.println("seats left : "+total_seats);
			}else
			{
				System.out.println("Sorry seats cannot be booked...!!");
				System.out.println("seats left : "+total_seats);
			}
		}
		
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
	}
}

public class MovieBookApp1 extends Thread
{
	static BookTheatreSeat b;
	int seats;
	
	public void run()
	{
		b.bookSeat(seats);
	}
	public static void main(String[] args)
	{
		b = new BookTheatreSeat();
		
		MovieBookApp1 sangram = new MovieBookApp1();
		sangram.seats=7;
		sangram.start();
		
		
		MovieBookApp1 kajal = new MovieBookApp1();
		kajal.seats=7;
		kajal.start();
		
	}
}