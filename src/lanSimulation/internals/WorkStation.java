package lanSimulation.internals;

import lanSimulation.Network;

public class WorkStation extends Node {

	public WorkStation(String name) {

		super(name);
	}
	@Override
	public void printOn(StringBuffer buf, Network network) {

		buf.append("Workstation ");
		buf.append(name_);
		buf.append(" [Workstation]");

	}
	@Override
	public void printHTMLOn(StringBuffer buf, Network network) {

		buf.append("Workstation ");
		buf.append(name_);
		buf.append(" [Workstation]");

	}
	@Override
	public void printXMLOn(StringBuffer buf, Network network) {

		buf.append("<workstation>");
		buf.append(name_);
		buf.append("</workstation>");

	}
	
	@Override
	public byte getType(){
		return Node.WORKSTATION;
	}

}
