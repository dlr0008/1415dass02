package lanSimulation.internals;

import lanSimulation.Network;

public class Printer extends Node {

	public Printer(byte type, String name) {
		// TODO Auto-generated constructor stub
		super(type, name);
	}

	public void printOn(StringBuffer buf, Network network) {

		buf.append("Printer ");
		buf.append(name_);
		buf.append(" [Printer]");

	}

	public void printHTMLOn(StringBuffer buf, Network network) {

		buf.append("Printer ");
		buf.append(name_);
		buf.append(" [Printer]");

	}

	public void printXMLOn(StringBuffer buf, Network network) {

		buf.append("<printer>");
		buf.append(name_);
		buf.append("</printer>");
	}

}
