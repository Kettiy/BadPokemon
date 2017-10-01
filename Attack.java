public class Attack
{   
    String type = "";
    String name = "";
    double damage;
    
    public Attack (String t, String n, double d)
    {
        type = t;
        name = n;
        damage = d;
    }

    Attack w1 = new Attack("water", "Surf", 100);
    Attack f1 = new Attack("fire", "Flare Blitz", 100);
    Attack f2 = new Attack("fire", "Fire Punch", 100);
    Attack i1 = new Attack("ice", "Ice Punch", 100);
    Attack d1 = new Attack("dark", "Bite", 100);
    Attack w2 = new Attack("water", "Hydro Pump", 100);

}