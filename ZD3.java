public class ZD3{
	public static void main(String [] zds){
		int sum = 0;
		int i = 1;
		do{
			sum+=i++;
		}
		while (i<101);
		System.out.println(sum);

		int age = 10;
		int money = 20;
		if (age > 18){
			if (money > 200){
				System.out.println("can sing");	
			}else{
				System.out.println("take money");
			}
		}else{
			System.out.println("go home");
		}
        
	}
}