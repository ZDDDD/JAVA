class animol{
	int legs;
	boolean hair;
	double weight;
public void walk(){
	System.out.println("i can walk");
    }
}

class mamol extends animol{
	int eyes;
public void meal(){
	System.out.println("i am strong");
    }
}
public class Dog extends mamol{
	public static void fly(){
		System.out.println("i can fly");
	}
	public static void main(String[] ha){
		mamol m = new mamol();
		m.legs = 4;
		m.eyes = 2;
		System.out.println(m.legs);
		System.out.println(m.eyes);
		m.meal();
		m.walk();
		Dog n = new Dog();
        n.fly();
	}
}