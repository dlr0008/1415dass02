package lanSimulation.internals;

import lanSimulation.Network;

public class Printer extends Node {

	public Printer(String name) {
		
		super(name);
	}
	@Override
	public void printOn(StringBuffer buf, Network network) {

		buf.append("Printer ");
		buf.append(name_);
		buf.append(" [Printer]");

	}
	@Override
	public void printHTMLOn(StringBuffer buf, Network network) {

		buf.append("Printer ");
		buf.append(name_);
		buf.append(" [Printer]");

	}
	@Override
	public void printXMLOn(StringBuffer buf, Network network) {

		buf.append("<printer>");
		buf.append(name_);
		buf.append("</printer>");
	}
	@Override
	public byte getType(){
		return Node.PRINTER;
	}

}
