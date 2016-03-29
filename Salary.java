import java.util.Arrays;
public class Salary{
	public static void main(String[] it){
	//1
	char arr[] = "abcdefg".toCharArray();
        System.out.println(arr);
	//2
	false true
	//3
	JAVA_HOME   PATH  CLASSPATHf
	//4
	main  
	//5
        源文件跟主类名一
	//6
	comepareTo  comepareToIgnoreCase equsl
	//7
	String ccc = "a,b,c,d,e,f,g".substring(6,7);
	System.out.println(ccc);
        //8
        String h = "replace".replace("e","a");
        System.out.println(h);
        //9
	    String l = "how are you";
        boolean j = "how are you".startsWith("How");
        boolean k = "how are you".endsWith("you");
        System.out.println(j);
        System.out.println(k);
        //10
        String p = String.valueOf(123456789);
        System.out.println(p);
        //11
        for (int i=1;i<10 ;i++) {
        	for (int j=1;j<10;j++) {
        		System.out.print(i+"*"+j+"="+i*j+"  ");
        		if (i==j){
        		break;
        		}
        	}
        	System.out.print("\n");
        }
        //12
        int[] i = {1,2,3,4,5};
        for (int m : i){
            System.out.println(m);
        }
        //13
        int[] t ={1,2,3,4,5};
        int[] tr = Salary.resver(t);
        System.out.println(Arrays.toString(tr));}
        public static int[] resver(int[] lit){
        	int[] mj = new int[lit.length];
        	for (int i=0,j=lit.length-1;i<lit.length;i++,j-- ) {
        		mj[i] = lit[j];
        	}
            return mj;
        }
}
        //14
        char grade = 'A';
        switch(grade){
        	case 'A':
            System.out.println('A');
            break;
            case 'B':
            System.out.println('B');
            break;
            case 'C':
            System.out.println('C');
            break;
            default:
            System.out.println("C-");
        }
        //15
        case 可以是char int string
        //16
        class staff{
        	String name;
        	String sex;
        	int workingyeas;
        public void good(){
        	System.out.println("i am good");
            }
        }
        public class Salary extends staff{
        	public static void main(String[] arg) {
                Salary jerry = new Salary();
        		Salary lily = new Salary();
        		Salary lucy = new Salary();
                jerry.name = "jerry";
                lily.name = "lily";
                lucy.name = "lucy";
        		System.out.println(jerry.name);
        	}
        }



	}

}