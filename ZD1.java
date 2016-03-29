import java.util.Arrays;
public class ZD1{
    public static void main(String[] args) {
        int[] bList = {1,2,3,4,5};
        int[] res = ZD1.reverse(bList);
        System.out.println(Arrays.toString(res));
  }
    public static int[] reverse(int[] list) {
        int[] re = new int[list.length];
        for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
            re[j] = list[i];
        }    
            return re;
  } 
}
