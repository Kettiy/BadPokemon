public class PokemonValues
{
    
    
    //level scaling is in the bonezone of outdates code
    //below is variables for making new pokemon in game class
    public PokemonValues(String n, String t, double h, double a, int l, double d, int x)
    {
        hp = h;
        attack = a;
        level = l;
        defense = d;
        name = n;
        type = t;
    }

    
    double hp;
    double attack;
    int level;
    double defense;
    String name = "";
    String type = "";
    
    public PokemonValues()
    {
    }
    
    
    

    
    public void changeHP(double h) //sets hp based on the level of the pokeman
    {
        
        hp = hp + h;
        
        int r = (int)Math.random()*3;
        
        if (r == 0)
        { hp = hp + 5;   // sets hp to 5
        }
        else if (r == 1)
        {
            hp = hp + 6; // sets hp to 6
        }
        else
        {
            hp = hp + 7;  // sets hp to 7
        }
        
        
         for(int i = 1; i < level +1; i++) //goes up to the pokemans level and stops repeating
        {
            hp = hp + 5; // adds 5 to attack each for each level
        }
    }
    
    public void changeAttack(double a) //sets attack based on the level of the pokeman
    {
        attack = attack + a;
        int r = (int)Math.random()*3;
        
        if (r == 0)
        { 
            attack = 5;   // sets attack to 5
        }
        else if (r == 1)
        {
            attack = 6; // sets attack to 6
        }
        else
        {
            attack = 7;  // sets attack to 7
        }
        
        
         for(int i = 1; i < level +1; i++) //goes up to the pokemans level and stops repeating
        {
            attack = attack + 5; // adds 5 to attack each for each level
        }
    }
    
    public void changeLevel(int l)  // sets the level of the enemy pokeman to a constrained random number
    {
        int d = (int)Math.random()*3;
        
        if (d == 0)
        {
            level = level -1;   // sets enemy level equal to your level -1
        }
        else if (d == 1)
        {
            level = level; // sets enemy level equal to your level
        }
        else
        {
           level = level + 1;  // sets enemy level equal to your level plus one
        }

    }
    
    public void changeName(String n)
    { 
        name = n;
    }
    
    public void changeDefense(double d)  //sets defense based on the level of the pokeman
    {
        defense = defense + d;
        int r = (int)Math.random()*3;
        
        if (r == 0)
        { defense = 5;   // sets defense to 5
        }
        else if (r == 1)
        {
            defense = 6; // sets defense to 6
        }
        else
        {
            defense = 7;  // sets defense to 7
        }
        
        
        for(int i = 1; i < level +1; i++) //goes up to the pokemans level and stops repeating
        {
            defense = defense + 5; // adds 5 to defense each for each level
        }
    }
    
    public void changeType(String t)
    { 
        type = t;
    }
}