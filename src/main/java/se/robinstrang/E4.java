package se.robinstrang;

// Skapa en ArrayList med några stängar tex
// "abc", "xyz", "aba", "1221"
// Loopa igenom och räkna hur många som
// - är minst två tecken OCH det första och det sista tecknet är detsamma  (aba)

import java.util.ArrayList;
import java.util.Arrays;

public class E4 {
    public void CountSpecial(){
        ArrayList<String> strings = new ArrayList<>(Arrays.asList( "abc", "xyz", "aba", "1221" ));        
        int count = 0;
        for( String txt : strings){
            if(txt.length()>=2 &&  txt.charAt(0) == txt.charAt(txt.length()-1)   ){
                count++;
            }
        }
        System.out.printf("Antal blev: " + count);
    }
}