package fr.iutvalence.info.m3105.stackmachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

public interface IO
{
	

	public abstract void displayRuntimeError(String string);
	
	public abstract void displayProgramTermination();
	
	public abstract int read() throws IOException;

	public abstract void write(int op);
	
}
