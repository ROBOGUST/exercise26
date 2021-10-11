package se.robinstrang;

// Skriv ett program där man matar in strängar (namn på hockeyspelare) . 
// Lägg hela tiden namnn i en Lista
// Skriver man in EXIT och antalet är större eller lika med 5 så avsluta loopen
// Skriver man in EXIT och antalet är mindre med 5 så säg "Nej nej fortsätt mata in några till!!"
// När loopen avslutats. Räkna ut vilken spelare som har det LÄNGSTA namnet. 
// Skriv ut det namnet och dessutom hur många tecken namnet består av

import java.util.ArrayList;
import java.util.Arrays;

public class E6 {
    public void Hockeylistan(){
        ArrayList<String> spelare = new ArrayList<>(Arrays.asList());        

        while (true){
            System.out.print("Ange en spelare\nEller skriv EXIT: ");
            String spelareIn = System.console().readLine();
            if (spelareIn.equalsIgnoreCase("EXIT") && spelare.size() >= 5){
                break;
            }
            else if (spelareIn.equalsIgnoreCase("EXIT") && spelare.size() < 5) {
                System.out.println("Nej nej fortsätt mata in några till!");
            }
            else {
                spelare.add(spelareIn);

            }
        }
        String longestPlayer = "";
        for(String howLongPlayer : spelare){
            if(howLongPlayer.length() > longestPlayer.length())
                longestPlayer = howLongPlayer;
        }
        System.out.println("Spelaren med längst namn var: " + longestPlayer);
        System.out.print("Och har: " + longestPlayer.length() + " bokstäver i sig.");
    }
}
