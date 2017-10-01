public class Combat
{
    public Combat(){
    pokemonName pN1 = new pokemonName();
       PokemonValues h1 = new PokemonValues("Heracross", "bug", 70, 95, 1, 70, 0);
       PokemonValues g1 =  new PokemonValues("Gengar", "ghost", 78, 88, 1 ,78, 0);
       PokemonValues o1 = new PokemonValues("Onyx", "rock", 70, 95, 1, 70, 0);
       PokemonValues[] pokeArray = {h1,g1,o1};
       //add moves to the enemies 
       
    String pokemon = "";    
    String type = "";
    int enemyPokemon;
    enemyPokemon = (int)(Math.random()*pokeArray.length);
    pokemon = pokeArray[enemyPokemon].name;
    type = pokeArray[enemyPokemon].type;
    
    

    System.out.println("A wild pokemon has apeared, it's a " + pokemon + "!!");
    System.out.println("it's a " + type + " type pokemon.");
    
      
    
    System.out.println("I choose you " + pN1.pokeName + ".");
    
        
    }
}
