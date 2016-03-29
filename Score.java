public class Score extends Studentt
{
   private int score; 
   public Score(String name, int age, int number, int score)
   {
      super(name, age, number);
      setScore(score);
   }
   public void mailCheck()
   {
      super.mailCheck();
       System.out.println("Studentt :" + getName()
        + this.score);
   }
   public int getScore()
   {
       return score;
   }
   public void setScore(int newScore)
   {
       if(newScore >= 0.0)
       {
          score= newScore;
       }
   }
   public double computeSco()
   {
      System.out.println("score give :" + getName());
      return score/8;
   }
  public  void play(){
    System.out.println("basktball");
    
    
  }

  public static void main(String[] args) {
      Score s = new Score("ZD",23,1,666);
      s.mailCheck();
      System.out.println("arang score :"+s.computeSco());
    
  }

}