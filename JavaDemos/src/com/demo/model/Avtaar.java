package com.demo.model;

public class Avtaar {
	
	private String attributes="";
	
	private String groupType;
	
	private boolean canFly=false;
	

	@Override
	public String toString() {
		return "Avtaar [attributes=" + attributes + ", groupType=" + groupType + ", canFly=" + canFly + "]";
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Avtaar iso = new Avtaar();
		iso.attributes="5 bullets required to kill";
		iso.groupType="duelists";
		
		
		System.out.println("iso.attributes==="+iso.attributes);
		System.out.println("iso.groupType===="+iso.groupType);
		System.out.println("iso.canFly===="+iso.canFly);
		
		
		System.out.println("iso===="+iso);
		
		System.out.println("iso.hashCode()======================="+iso.hashCode());
		
		
		
		Avtaar jetty = new Avtaar();
		jetty.attributes="up draft";
		jetty.groupType="initiator";
		jetty.canFly=true;
		
		
		System.out.println("jetty.attributes==="+jetty.attributes);
		System.out.println("jetty.groupType===="+jetty.groupType);
		System.out.println("jetty.canFly===="+jetty.canFly);
		System.out.println("jetty.canFly"+jetty);
		
		System.out.println("jetty.hashCode()====================="+jetty.hashCode());
		
			
	}

}
