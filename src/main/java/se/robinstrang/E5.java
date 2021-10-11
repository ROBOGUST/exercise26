package se.robinstrang;

// Skapa en lista i kod med 5 stycken INTS. 12 ,-5, 32, -9, 34.   
// Det ska vara en oneliner!
// Loopa igenom listan och räkna fram hur många av alla tal som är större än 0

import java.util.ArrayList;
import java.util.Arrays;

public class E5 {
    public void AntalMindreNoll(){
        ArrayList<Integer> nummer = new ArrayList<>(Arrays.asList(12, -5, 32, -9, 34));
        int antal = 0;
        for(int count:nummer){
            if (count>0){
                antal++;
            }
        }
        System.out.println("Antal positiva tal är: " + antal);
    }
}
