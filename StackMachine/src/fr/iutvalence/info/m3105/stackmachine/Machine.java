package fr.iutvalence.info.m3105.stackmachine;

public class Machine
{
	private CPU cpu;
	private Memory programMemory;
	private Stack expStack;
	private Stack callStack;
	private IO ioSystem;

	public Machine(CPU cpu, Memory programMemory, Stack expStack, Stack callStack, IO ioSystem) throws InvalidParametersException
	{
		super();
		if(expStack==null || cpu==null || programMemory==null || callStack==null || ioSystem==null) 
				//throws new InvalidParametersException;
		this.cpu = cpu;
		this.programMemory = programMemory;
		this.cpu.wireToProgramMemory(programMemory);
		this.cpu.wireToExpStack(expStack);
		this.cpu.wireToExpStack(callStack);
		this.cpu.wireToIoSubsystem(ioSystem);
	}

	public void loadProgram(Program program) throws AddressOutOfBoundsException
	{
		int currentAddress = this.programMemory.getStartAddress();

		for (int instructionNumber = 0; instructionNumber < program.getInstructionCount(); instructionNumber++)
		{
			Instruction instruction = program.getInstructionAt(instructionNumber);
			this.programMemory.write(currentAddress, instruction.getOpCode());
			currentAddress++;
			int[] instructionParams = instruction.getParams();
			if (instructionParams != null)
			{
				for (int instructionParam : instructionParams)
				{
					this.programMemory.write(currentAddress, instructionParam);
					currentAddress++;
				}
			}
		}
	}

	public void executeProgram(int address)
	{
		cpu.clearStacks();
		cpu.setPC(address);
		cpu.run();
		System.out.println("(end of program execution)");
	}

}
