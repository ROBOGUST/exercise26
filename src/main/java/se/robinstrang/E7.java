package se.robinstrang;

// Låt användaren mata in en sträng. 
//Nu ska du med loopar ta fram vilket TECKEN som återkommer flest gånger
// >STEFAN HOLMBERG
// E förekommer 2 gånger

public class E7 {
    public void VanligasteTecknet(){
        System.out.print("Skriv in en text:");
        String text = System.console().readLine();
        String mostUsedChar = "";
        int counter = 0;
        String [] array = text.split("");
        for(int i = 0; i < array.length; i++){
            int tempCounter = 0;
            for(int j = 0; j < array.length; j++){
                if(array[i].equals(array[j])){         
                    tempCounter++;
                }
                if (tempCounter>counter){
                    counter=tempCounter;
                    mostUsedChar = array[i];
                }
            }
        }
        System.out.println("Vanligaste tecknet är: " + mostUsedChar);
        System.out.println("Och det förekommer: " + counter + " gånger.");

    }
}
// String word = "Ferrari";
// String mostUsedChar = "";
// int count = 0;
// String[] array = word.split("");
// for (int i = 0; i < array.length; i++) {
//     int tempCount = 0;
//     for (int j = 0; j < array.length; j++)
//     {
//         if (array[i].equals(array[j])) {
//             tempCount++;
//         }
//         if (tempCount > count) {
//             count = tempCount;
//             mostUsedChar = array[i];
//         }
//     }
// }
// System.out.println(count + " Most Used Char: " + mostUsedChar);