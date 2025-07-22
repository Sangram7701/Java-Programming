class BookTheatreSeat
{
	int total_seats = 10;
	void bookSeat(int seats)
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

public class MovieBookApp extends Thread
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
		
		MovieBookApp sangram = new MovieBookApp();
		sangram.seats=7;
		sangram.start();
		
		
		MovieBookApp kajal = new MovieBookApp();
		kajal.seats=7;
		kajal.start();
		
	}
}