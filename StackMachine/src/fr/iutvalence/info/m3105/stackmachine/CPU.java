package fr.iutvalence.info.m3105.stackmachine;

import java.io.IOException;

public abstract class CPU
{
	protected IO ioSystem;
	protected int programCounter;
	protected Memory programMemory;
	protected Stack callStack;
	protected Stack expstack;
	
	// TODO something is missing here...
	

	
	// TODO something is missing here...

	public void run()
	{
		try
		{
			while (true)
			{
				int opCode = this.programMemory.read(programCounter);
				
				switchOnOpecode(opCode);
			}
		}
		catch (AddressOutOfBoundsException e)
		{
			// TODO something is missing here...
		}
		catch (IOException e)
		{
			// TODO something is missing here...
		}
		catch (StackOverflowException e)
		{
			// TODO something is missing here...
		}
		catch (StackUnderflowException e)
		{}
			// TODO something is missing here...
	}		
	
	protected abstract void switchOnOpecode(int opCode) throws AddressOutOfBoundsException, StackOverflowException, StackUnderflowException, IOException;
	
	public void wireToProgramMemory(Memory programMemory) {
		// TODO Auto-generated method stub
		this.programMemory = programMemory;
	}

	public void wireToExpStack(Stack expStack) {
		// TODO Auto-generated method stub
		
	}

	public void wireToIoSubsystem(IO ioSystem) {
		// TODO Auto-generated method stub
		
	}

	public void clearStacks() {
		// TODO Auto-generated method stub
		
	}

	public void setPC(int address) {
		// TODO Auto-generated method stub
		this.programCounter = address;
	}

	// TODO something is missing here...
}
