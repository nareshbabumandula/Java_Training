package oops;

public class PVR extends Theater{

	public static void main(String[] args) {
		PVR pv = new PVR();
		pv.OnlineBooking();
		pv.SeatingCapacity();
		pv.AudioSystem();
		pv.Parking();
		pv.ScreenSize();
		pv.FireandSafety();
		pv.VIPSeatsBooking();

	}

	@Override
	public void SeatingCapacity() {
		System.out.println("Seating capacity is 500 seats");
		
	}

	@Override
	public void Parking() {
		System.out.println("Parking capacity is 100 cars and 500 bikes");
		
	}

	@Override
	public void ScreenSize() {
		System.out.println("ScreenSize is 70mm");
		
	}

	@Override
	public void AudioSystem() {
		System.out.println("Audio system is dobly digital");
		
	}

	@Override
	public void OnlineBooking() {
		System.out.println("OnlineBooking is available for 20% of the seats");
		
	}

	@Override
	public void FireandSafety() {
		System.out.println("Fire and safety is take care");
		
	}

}
