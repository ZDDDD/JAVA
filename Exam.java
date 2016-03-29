import java.util.Arrays;

public class Exam {

	public static void main(String[]args){
		// //1
		// char grade = 'D';
		// switch(grade){
		// 	case 'A':
		// 	System.out.println('A');
		// 	break;
		// 	case 'B':
		// 	System.out.println('B');
		// 	break;
		// 	case 'C':
		// 	System.out.println('C');
		// 	break;
		// 	default:
		// 	System.out.println("C-");
		// }

		// //2
		// int old = 15;
		// int young = 13;
		// int max = old > young ? old:young;
		// System.out.println(max);
		// //3

		// //4
		// class school{
		// 	int student;
		// 	public void think(){
		// 		System.out.println("i can think");
		// 	}	
		// }
		// public class Exam extends school{
		// 	int score;
		// 	public void think(){
		// 		System.out.println("i can think and play");
		// 	}
		// 	public static void main(String[] args) {
		// 		Exam PE = new Exam();
		// 		PE.think();

		// 	}
		// }
		// //5
  //       继承就是子类继承父类，包含关系 关键字是 extends,对象名 instanceof 类名
		// //6
		// class Student{
		// 	private String name;
		// 	private String score;
		// 	public void setName(String a){
		// 		name = a;
		// 	}
		// 	public String getName(){
		// 		return name;
		// 	}
		// 	public void setScore(String b){
		// 		score = b;
		// 	}
		// 	public String getScore(){
		// 		return score;
		// 	}
		// }
		// public class Exam{
		// 	public static void main(String[] args) {
		// 		Student zd = new Student();
		// 		zd.setName("zd");
		// 		zd.setScore("80");
		// 		System.out.println("Name:"+zd.getName()+"   "+"score:"+zd.getScore());
		// 	}
		// }
		// //7
  //       算术运算符、赋值运算符、关系运算符、逻辑运算符
		// //8
		// int y = 2;
		// for (int x=1,z=3;x<2,z<4;++x,z--) {
  //           y += z/x;	
		// }
		//     System.out.println(y);
		// //9
		int[] p = {9,6,5,7,3,8,2,4};
		for (int i=0;i<p.length;i++) {
			for (int j=1;j<p.length;j++) {
				if(p[i]>p[j]){
					int temp = p[j];
					p[j] = p[i];
					p[i] = temp ;
				}	
			}
		}
		System.out.println(Arrays.toString(p));


		




	}
}