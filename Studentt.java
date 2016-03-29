public abstract class Studentt{
   private String name;
   private int age;
   private int number;
   public Studentt(String name, int age, int number){
      System.out.println("build a student");
      this.name = name;
      this.age = age;
      this.number = number;
   }
   public double computeSco()
   {
     System.out.println("Inside Studentt computePSco");
     return 0.0;
   }
   public void mailCheck()
   {
      System.out.println("Studentt massage : " + this.name
       + "   "+this.number+"   " + this.age);
   }
   public String toString()
   {
      return name + " " + age + " " + number;
   }
   public String getName()
   {
      return name;
   }
   public int getage()
   {
      return age;
   }
   public void setAge(int newAge)
   {
      age = newAge;
   }
   public int getNumber()
   {
     return number;
   }
   
    public abstract void play();
}