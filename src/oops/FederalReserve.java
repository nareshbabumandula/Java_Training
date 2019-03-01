package oops;

public interface FederalReserve {
	
	
	abstract public void Deposits();
	abstract public void MinWithDrawl();
	abstract public void MaxWithDrawl();
	abstract public void AccountType();
	abstract public void Loans();
	
	public default void NoOfCustomers()
	{
		System.out.println("Executing the default method - NoOfCustomers");
	}
	
	
	public static void AccountCancellation()
	{
		System.out.println("Executing the static method - AccountCancellation");
	}
	
	
	public static void main(String[] args)
	{
		AccountCancellation();
	}

}
