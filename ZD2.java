import java.util.Arrays;
public class ZD2{
	public static void main (String[]zd){
		// int a,b,c,i;
		// for ( i = 100;i <1000;i++){
		// 	a = i/100;
		// 	b = (i-a*100)/10;
		// 	c = i-a*100-b*10;
		// 	if (a*a*a+b*b*b+c*c*c==i){
		// 		System.out.println(i);
		// 	}
		// }

		int[] p = {6,8,2,5,3,7,4,9};
		for (int i =0;i<p.length;i++) {
			for (int j =0;j<p.length;j++) {
				if(p[i]<p[j]){
					int temp = p[j];
					p[j] = p[i];
					p[i] = temp;					
				}				
			}	
		}
		System.out.print(Arrays.toString(p));
	}
   
}

	
