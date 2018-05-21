package com.s2it.designPatterns.comportamental.command;

import java.util.ArrayList;
import java.util.List;

//Invoker
public class Invoker {

	private List<Command> comandos = new ArrayList<Command>();
	private int current = 0;

	public void calcular(Command command) {
		command.calcular();
		comandos.add(command);
		current++;
	}

	public void desfazer(int levels) {
		for (int i = 0; i < levels; i++) {
			if (current > 0) {

				Command command = comandos.remove(--current);
				command.desfazer();
			}
		}
	}

}
