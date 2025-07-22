// SYNCHRONIZED METHOD EXAMPLE

class BookTheatreSeat
{
	int total_seats = 10;
	synchronized void bookSeat(int seats)
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
}

public class SynchronizedMovieBookApp extends Thread
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
		
		SynchronizedMovieBookApp sangram = new SynchronizedMovieBookApp();
		sangram.seats=7;
		sangram.start();
		
		
		SynchronizedMovieBookApp kajal = new SynchronizedMovieBookApp();
		kajal.seats=7;
		kajal.start();
		
	}
}