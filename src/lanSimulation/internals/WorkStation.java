package lanSimulation.internals;

import lanSimulation.Network;

public class WorkStation extends Node {

	public WorkStation(byte type, String name) {

		super(type, name);
	}

	public void printOn(StringBuffer buf, Network network) {

		buf.append("Workstation ");
		buf.append(name_);
		buf.append(" [Workstation]");

	}

	public void printHTMLOn(StringBuffer buf, Network network) {

		buf.append("Workstation ");
		buf.append(name_);
		buf.append(" [Workstation]");

	}

	public void printXMLOn(StringBuffer buf, Network network) {

		buf.append("<workstation>");
		buf.append(name_);
		buf.append("</workstation>");

	}

}
