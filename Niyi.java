
public class Niyi implements Student
{
  String name;
  String favoriteFood;
  String catchPhrase;

  public Niyi(String n, String f, String c){


   name = n;
   favoriteFood = f;
   catchPhrase = c;

  }

  public String getName()
  {
    return "Niyi Kelani";
  }

  public String getFavoriteFood()
  {
   return "Fried Chicken and Watermelon Slices";
  }

 public void sayCatchphrase()  {

    System.out.println("Yeet!");

}    
}
