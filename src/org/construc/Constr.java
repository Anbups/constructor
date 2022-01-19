package org.construc;

public class Constr {
	public Constr() {
		System.out.println("Default constructor () have no args");
	}
	public Constr(int id) {
		System.out.println("Int parameterized constructor");
		System.out.println(id);
	}
	public void Constr() {
		System.out.println("Normal Method");
	}
	public static void main(String[]args) {
		Constr c = new Constr();
		Constr d = new Constr(20);
		c.Constr();
	}

}
