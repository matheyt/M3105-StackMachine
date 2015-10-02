package fr.iutvalence.info.m3105.stackmachine;

public class Memory {

	private int startAdress;
	private int endAdress;
		
	public Memory(int startAdress, int endAdress) 
	{
		this.startAdress=startAdress;
		this.endAdress= endAdress;
	}

	public int getStartAddress()
	{
		return this.startAdress;
	}

	public void write(int currentAddress, int opCode) {
		// TODO Auto-generated method stub
		
	}
	
	public int read (int currentAddress)
	{
		return 0;
	}
}
