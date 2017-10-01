import java.util.Scanner;
public class Map
{
    Scanner scan = new Scanner(System.in);
     public Map()
    {
      Scanner scan = new Scanner(System.in);
      boolean end = false;
      int [] [] multi = new int [11] [11]; //creates a 11 by 11 grid
      
      int xaxis = 10; //places the first point at x axis 10
      int yaxis = 5;  // places the first point at y axis 5

      while (end != true)
      {
         multi [xaxis][yaxis] = 2; //sets the value of the first point to 2
        
        for (int[] a : multi) {  //initiallize
             for (int i : a){     //i have no idea why this works
                System.out.print(i + "\t");     //this prints the array i think
             }
             System.out.println("\n");   //adds a new line after the array
        }
        
        String movement = scan.nextLine();
        if(movement.equals("end"))  //if someone inputs end, program ends
            {
                end = true;
            }
        else if(movement.equals("w"))  
        {  
            multi [xaxis] [yaxis] = 0;  //sets the value of the current position to 0
            xaxis = xaxis - 1;          // moves the marker up one
            multi [xaxis] [yaxis] = 2;  // sets the maerker to 2
        }
        else if(movement.equals("s"))
        {  
            multi [xaxis] [yaxis] = 0;
            xaxis = xaxis + 1;
            multi [xaxis] [yaxis] = 2;
        }
        else if(movement.equals("a"))
        {  
            multi [xaxis] [yaxis] = 0;
            yaxis = yaxis - 1;
            multi [xaxis] [yaxis] = 2;
        }
        else if(movement.equals("d"))
        {  
            multi [xaxis] [yaxis] = 0;
            yaxis = yaxis + 1;
            multi [xaxis] [yaxis] = 2;
        }

          System.out.print('\u000C');//this clears page

    }
}
}