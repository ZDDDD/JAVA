public class Do extends Dog{
	public void travel()
   {
      super.travel();
      System.out.println("i like travel");
   }
   public static void main(String[] args) {
   	Do d = new Do();
   	d.travel();
   }
}