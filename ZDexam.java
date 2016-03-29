import java.util.Arrays;

public class ZDexam{

	public static void main(String[] zdd){
		//1
		java源文件就是后缀带.java的文件，一个源文件里可以有多个类但只能有一个主类。
		//2
		程序的入口是public class 
		//3
		jdk的全称      配置java的环境变量有三个 java_home  path  class_path
		//4
		基本数据类型 byte short int long float double char boolean  用 String.valueOf 可以把基本数据类型转换成字符串
		//5
        字符串是"  ",字符是'  ',
		//6
		String zd = "123456";
		int lengt = zd.length();
		System.out.println(lengt);
        //7
        int[] five = {8,2,5,9,3};
        
        System.out.println(Arrays.toString(five));
        //8
        public static int[] reverse(int[] list) {
            int[] re = new int[list.length];
            for (int i = 0, j = re.length - 1; i < list.length; i++, j--) {
                re[j] = list[i];
            }
                return re;
    }
        //9
        char arr[] = "zhaoDi,wangYiDi,songJinYang,gongZiQi".toCharArray();
        System.out.println(Arrays.toString(arr));
        //10


	}

}