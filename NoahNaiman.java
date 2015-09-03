
public class NoahNaiman implements Student{
	public String name = "Noah Naiman";
	public String favoriteFood = "Kale";
	public String catchPhrase = "You just got Noah'd!";
	
	public String getName(){
		return name;
	}
	
	public String getFavoriteFood(){
		return favoriteFood;
	}

	@Override
	public void sayCatchphrase() {
		System.out.println(catchPhrase);
		
	}
	
}
