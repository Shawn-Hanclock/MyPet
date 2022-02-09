public class myPets
{
    //instance variables
    public boolean isFriendly;
    public String foodType;
    public double amtSleep;
    public String name;
    //constructors
    public myPets (boolean isFriendly, String foodType, double amtSleep, String name)
    {
        this.isFriendly = isFriendly;
        this.foodType = foodType;
        this.amtSleep = amtSleep;
        this.name = name;
    }
    //toString
    public String toString()
    {
        String output = "Name: " + name +
                "\nIsFreindly: " + isFriendly +
                "\nFoodType: " + foodType +
                "\nAmtSleep: " + amtSleep ;
        return output;
    }
}
