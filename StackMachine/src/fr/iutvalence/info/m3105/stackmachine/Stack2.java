package fr.iutvalence.info.m3105.stackmachine;

public class Stack2 implements Stack
{
	
	
	private int[] instructions;
	
	private int currentSize;
	
	private int maxSize;
			
	public Stack2(int stackSize) 
	{
		this.instructions = new int[stackSize];
		this.maxSize = stackSize;
		this.currentSize = 0;
		
	}
	
	public void clear(){
		// TODO Auto-generated method stub
	}
}
