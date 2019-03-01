package oops;

public abstract class Theater {
	
	// Abstract methods - Only functionality no logic/body
	abstract public void SeatingCapacity();
	abstract public void Parking();
	abstract public void ScreenSize();
	abstract public void AudioSystem();
	abstract public void OnlineBooking();
	abstract public void FireandSafety();
	
	// Non abstract method will have method body
	public void VIPSeatsBooking()
	{
		System.out.println("VIP Seats should be reserved and can be released after 10 mins of movie");
	}

}
