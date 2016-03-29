public class Students extends Schools
{
   private String score; 
   public Students(String name, double score, int number, String students)
   {
      super(name, score, number);
      setScore(score);
   }
   public void mailCheck()
   {
      super.mailCheck();
       System.out.println("school score give :" + getName()
       + " with student " + this.students);
   }
   public String getStudents()
   {
       return students;
   }
   public void setScore(double newScore)
   {
       if(newScore >= 0.0)
       {
          score = newScore;
       }
   }
   public double computePSco()
   {
      System.out.println("score give :" + getName());
      return score/5;
   }
  public  void play(){
    System.out.println("basktball");
  }

}