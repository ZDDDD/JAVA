public class CX extends Animol{
	String hoobby;
	public void walk(){
		System.out.println("i can jump and walk");
	}
	public CX birth(){
		CX n = new CX();
		n.hoobby = "xiu";
		return n;
	}
	public static void main(String[] args) {
		CX miky = new CX();
		miky.legs = 2;
		miky.walk();
		CX l = miky.birth();
		Animol g = miky.birt();
		System.out.println(g.legs);
		System.out.println(l.hoobby);
		System.out.println(miky.legs);

	}
}