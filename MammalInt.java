public class MammalInt implements Animal,Bird{
   public void eat(){
      System.out.println("Mammal eats");
   }
   public void travel(){
      System.out.println("Mammal travels");
   } 
   public int noOfLegs(){
      return 0;
   }
   public void fly(){
   System.out.println("Mammal can't fly");
   }
   public void live(){
    System.out.println("Mammal is alive");
   }
   public static void main(String args[]){   
      MammalInt m = new MammalInt();
      System.out.println(m.weight);
      System.out.println(Animal.weight);
      System.out.println(m.legs);
      System.out.println(m.swing);
      m.eat();
      m.fly();
      m.live();
      m.travel();
   }
   abstract class Dog implements Animal{
      public void travel(){
         System.out.println("i like travel");
      }
      public abstract void eat();
   }
}