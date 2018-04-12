package cn.edu.hqu.javaee;

import java.io.PrintStream;

public class Minstrel {
	private PrintStream stream;
	public Minstrel(PrintStream stream) {
		this.stream=stream;
	}
	
	public void singBeforeQuest() {
		stream.println("骑士很勇敢!");
	}
	
	public void singAfterQuest() {
		stream.println("杀死了恶龙!");
	}

}
