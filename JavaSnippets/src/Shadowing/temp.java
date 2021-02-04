package Shadowing;

public class temp {
	
	int x=100;
	 void m1()
	 {
		System.out.println(this.x);
	 }
	
	 public static void main(String[] args)
	 {
		temp t=new temp();
		t.m1();
	 }

}
