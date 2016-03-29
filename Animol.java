public class Animol{
	int legs;
	public void walk(){
		System.out.println("i can walk");
	}
	public Animol birt(){
		Animol m = new Animol();
	    m.legs = 8;
	    return m;
	}
}