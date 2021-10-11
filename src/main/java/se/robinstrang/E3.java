package se.robinstrang;

// Skapa en ArrayList  kod med 5 stycken INTS. 12 ,55, 32, 9, 34.   
// Det ska vara en oneliner!
// Loopa igenom listan och räkna fram SUMMAN av alla tal

import java.util.ArrayList;
import java.util.Arrays;

public class E3 {
    public void Summa(){
        ArrayList<Integer> tal = new ArrayList<>(Arrays.asList(12,55,32,9,34));
        int summa = 0;
        for (int i : tal){
            summa =+ i;
        }
        System.out.println(summa);
    }
}
