package fr.iutvalence.info.m3105.stackmachine;

public class Instruction {
	private int opCode;
	private int[] params;
	
	public Instruction(int opCode, int[] params) {
		this.opCode=opCode;
		this.params= params;
	}

	public int getOpCode() {
		// TODO Auto-generated method stub
		return this.opCode;
	}

	public int[] getParams() {
		// TODO Auto-generated method stub
		return null;
	}

}
