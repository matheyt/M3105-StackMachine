package fr.iutvalence.info.m3105.stackmachine;

public interface Memory {

	
	
	public abstract int getStartAddress();

	public void write(int currentAddress, int opCode) throws AddressOutOfBoundsException ;
	
	public int read (int currentAddress);

}
