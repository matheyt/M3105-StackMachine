package fr.iutvalence.info.m3105.stackmachine;

public class Machine
{
	private CPU2 cpu;
	private Memory programMemory;
	private Stack expStack;
	private Stack callStack;
	private IO ioSystem;

	public Machine(CPU2 p_cpu, Memory programMemory, Stack p_expStack, Stack p_callStack, IO p_ioSystem) 
	{
		super();
		this.cpu = p_cpu;
		this.programMemory = programMemory;
		this.callStack=p_callStack;
		this.expStack=p_expStack;
		this.ioSystem=p_ioSystem;
		this.cpu.wireToProgramMemory(programMemory);
		this.cpu.wireToExpStack(p_expStack);
		this.cpu.wireToExpStack(p_callStack);
		this.cpu.wireToIoSubsystem(p_ioSystem);
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
