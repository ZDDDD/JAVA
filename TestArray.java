public class TestArray{
    public static void main(String[] args) {
	int sum = 0;
	int i = 1;
	while(i<101){
	    sum += i++;
	    }
	    System.out.println("sum:"+sum);

	    int sumAnother = 0;
	    int j = 1;
	    do{
	        sumAnother += j++;
	    }while(j < 101);
	    System.out.println("sumAnother:"+sumAnother);

	int age = 2;
    int money = 200 ;
	if (age > 18 ) {
	    if (money > 200) {
		    System.out.println("can sing");
		}else {
		    System.out.println("take money");
		}
	}else{
		System.out.println("go home");
	}
    
    char grade = 'D';
    switch(grade){
	    case 'A':
	    System.out.println("Your grade is :"+'A');
	    break;
	    case 'B':
	    System.out.println("Your grade is :"+'B');
	    break;
	    case 'C':
	    System.out.println("Your grade is :"+'C');
	    break;
	    default:
	    System.out.println("Your grade is :"+"C-");
    }

    int ageOld = 11;
    int ageYong = 13;
    int chooseAge = ageOld > ageYong ? ageOld:ageYong;
    System.out.print("max="+chooseAge);
	}
}