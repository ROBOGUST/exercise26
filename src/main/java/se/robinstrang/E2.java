package se.robinstrang;

// Skapa en ArrayList i kod med INTS 12 ,55, 32, 9, 34.    Tips 
// ArrayList<Integer> tal1 = new ArrayList<>(Arrays.asList( 12,55,32,9,34));
// Skapa en ArrayList till i kod med INTS 72 ,55, 32, 4, 88.   
// Skapa en ArrayList - som heter commonArrayList. 
// Denna ska nu fyllas med  med tal som återfinns i BÅDA arraylistorna. 
// Loopa igenom den första och för varje: kolla om den finns i den andra. 
// Isåfall stoppar du in den i common ArrayListen.
// Loopa igenom common  ArrayListen och skriv ut alla tal
// ÖVERKURS: Gör samma lab. Fast de två första ska vara ARRAYS och resultatet en ArrayList

import java.util.ArrayList;
import java.util.Arrays;

public class E2 {
    public void CommonElements(){
        ArrayList<Integer> tal1 = new ArrayList<>(Arrays.asList(12,55,32,9,34));
        ArrayList<Integer> tal2 = new ArrayList<>(Arrays.asList(72,55,32,4,88));
        ArrayList<Integer> commonArrayList = new ArrayList<>();

        for(int i : tal1){
            if(tal2.contains(i))
                commonArrayList.add(i);
        }

        for(int tal : commonArrayList){
            System.out.println(tal);            
        }
       System.out.println(commonArrayList);
    }
}