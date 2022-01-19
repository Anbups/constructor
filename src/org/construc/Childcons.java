package org.construc;

public class Childcons extends Parentcons{
	public Childcons() {
		System.out.println("default constructor");
		
	}
	public Childcons(int id) {
		System.out.println("int para constructor");
		System.out.println(id);
	}
public static void main(String[]args) {
	Childcons a=new Childcons();
	Childcons b=new Childcons(100);

}
}
