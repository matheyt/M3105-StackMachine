package fr.iutvalence.info.m3105.stackmachine;

public class Memory2 implements Memory {

	private int startAdress;
	private int endAdress;
	private int[] Adress;
		
	public Memory2(int startAdress, int endAdress)  throws InvalidParametersException
	{
		if(startAdress<0|| endAdress<=startAdress)
			throw new InvalidParametersException();
		this.startAdress=startAdress;
		this.endAdress= endAdress;
		this.Adress= new int [this.endAdress-this.startAdress];
	}

	public int getStartAddress()
	{
		return this.startAdress;
	}

	public void write(int currentAddress, int opCode) throws AddressOutOfBoundsException
	{
		// TODO Auto-generated method stub
		
	}
	
	public int read (int currentAddress)
	{
		return this.Adress[currentAddress];
	}
}
