package se.robinstrang;

// Skapa en ARRAY i kod med INTS 12 ,55, 32, 9, 34.
// Ta fram vilket som är det STÖRSTA och MINSTA talet i arrayen

public class E1 {
    public void MinMax(){

        int [] numbers = {12,55,32,9,34};
        int largest = numbers [0];
        int smallest = numbers [0];

        for (int tal: numbers){
            if (tal > largest){
                largest = tal;
            }
        }
        for (int tal: numbers){
            if (tal<smallest){
                smallest = tal;
            }
        }
        System.out.println("Största talet är:" + largest);
        System.out.println("Minsta talet är:" + smallest);
    }
}
