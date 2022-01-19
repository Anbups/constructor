package org.construc;

public class Scons extends Parentcons {
	public Scons() {
		super(20.45f);
	
		System.out.println("Default anbu");
	}
	public Scons(float id) {
		System.out.println("int para super constructor");
		System.out.println(id);
		}
	public static void main(String[] args) {
		Scons s =new Scons();
		Scons s1 =new Scons(100);
	}

}
