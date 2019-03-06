package oops;

public class BOA implements FederalReserve, RBI{
	
	public void NoOfCustomers()
	{
		System.out.println("Executing the method - NoOfCustomers");
	}
	

	public static void main(String[] args) {
		BOA bo = new BOA();
		bo.NoOfCustomers();
	}

	@Override
	public void Deposits() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void MinWithDrawl() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void MaxWithDrawl() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AccountType() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Loans() {
		// TODO Auto-generated method stub
		
	}

}
