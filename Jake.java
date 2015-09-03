public class Jake implements Student {
    
    String name = new String();
    name = "Jake Zane";
    String food = new String();
    food = "Perogies";
    
    public String getName() {
        return name;   
    }
    
    public String getFavoriteFood() {
        return food;   
    }
    
    public void sayCatchphrase() {
        System.out.println("Alright, spectacular.");   
    }
}