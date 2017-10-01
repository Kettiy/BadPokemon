import java.util.Scanner;
public class Game
{   //add speed value later
    public static void main (String args[]){
    Scanner scan = new Scanner(System.in);    
  
    pokemonName pN1 = new pokemonName();//pulling variables 
    
    System.out.println("Input name here");//here 
    pN1.userName = scan.nextLine();
    System.out.println("Welcome " + pN1.userName + ", to the world of pokemon.");
    System.out.println("Select which pokemon you would like to use. (type in pokemon name)");
    //switch this to a 2d array later
    System.out.println("Charizard    " + "Blastoise    " + "Venusaur    ");//to here is asking for name and welcoming player
    
    
    while(pN1.pokemon123!= true)//here 
    {
    pN1.pokeName = scan.nextLine();
       if (pN1.pokeName.equals ("Charizard"))
      { System.out.println("Congratulations, " + pN1.pokeName + " has been added to your party."); 
        pN1.pokemon123 = true;}
      else if (pN1.pokeName.equals ("Blastoise"))
      { System.out.println("Congratulations, " + pN1.pokeName + " has been added to your party."); 
        pN1.pokemon123 = true;}
       else if (pN1.pokeName.equals ("Venusaur"))
      { System.out.println("Congratulations, " + pN1.pokeName + " has been added to your party."); 
        pN1.pokemon123 = true;}
       else System.out.println("Please type in a valid pokemon name."); 
          //to here is the selection of the pokemon
    }   
    PokemonValues playermon = new PokemonValues("error" , "error" , 0, 0, 0, 0, 0);
    //defines pokemon
    if (pN1.pokeName.equals("Charizard"))
    {
        playermon.name = "Charizard";
        playermon.type = "fire";
        playermon.hp =78;
        playermon.attack = 88;
        playermon.level = 1;
        playermon. defense = 78;
    }
    else if (pN1.pokeName.equals("Blastoise"))
    {
       playermon.name ="Blastoise";
        playermon.type = "water";
        playermon.hp =75;
        playermon.attack = 90;
        playermon.level = 1;
        playermon. defense = 75;
    }
    else if (pN1.pokeName.equals("Venusaur"))
    {
       playermon.name = "Venosaur";
        playermon.type = "grass";
        playermon.hp =80;
        playermon.attack = 84;
        playermon.level = 1;
        playermon. defense = 80;
    }

        //defining the pokemon
        PokemonValues c1 = new PokemonValues("Charizard", "fire", 78, 88, 1, 78, 0);
        PokemonValues b1 = new PokemonValues("Blastoise", "water", 75, 90, 1, 75, 0);
        PokemonValues v1 = new PokemonValues("Venusaur", "grass", 80, 84, 1, 80, 0);
        //spits out stats of pokemon
     System.out.print("your pokemon is " + playermon.name +" its attack, hp and type are ");
     System.out.println(playermon.attack + " " + playermon.hp + " " + playermon.type);
     System.out.println("You are now ready to go on your adventure.");
     System.out.println("You can move with w, a, s, and d but you must hit enter after each selection of the key. (have fun!)");
     
    Map m1 = new Map();//places map
    
     
    Combat c2 = new Combat();//starts combat
    
    
   }
}