package javalanguage;

import java.io.*;

public class WhileTest {
    public static void main(String[] args) throws IOException {
        int counter = 0;
        while(counter < 10) {
//            System.out.println("counter: " + counter);
            counter++;
        }

        boolean shouldContinue = true;
        while(shouldContinue == true) {
//            System.out.println("running");
            double random = Math.random() * 10D;
            if(random > 5) {
                shouldContinue = true;
//                System.out.println(random);
            } else {
                shouldContinue = false;
//                System.out.println(random);
            }
        }

//        while(iterator.hasNext())
//            System.out.println("next: " + iterator.next()); // executed in loop
//        System.out.println("second line");              // executed after loop

        String[] strings = {"John", "Jack", "Abraham", "Jennifer", "Ann" };

        int wordsStartingWithJ = 0;
        int i=0;
        while( i < strings.length ) {
            if(! strings[i].toLowerCase().startsWith("j")) {
                i++;
                continue;
            }
            wordsStartingWithJ++;
            i++;
        }
        System.out.println(wordsStartingWithJ);

        String[] strings2 = {"John", "Jack", "Abraham", "Jennifer", "Ann" };

        int wordsStartingWithJ2 = 0;
        int i2=0;
        do {
            if(! strings2[i2].toLowerCase().startsWith("j")) {
                i2++;
                continue;
            }
            wordsStartingWithJ2++;
            i2++;
        } while( i2 < strings2.length );

        System.out.println(wordsStartingWithJ2);


        int wordsStartingWithJ3 = 0;
        int i3=0;

        while(i3 < strings2.length) {
            if(strings2[i3].toLowerCase().startsWith("j")) {
                wordsStartingWithJ3++;
            }

            if(wordsStartingWithJ3 >= 3) {
                break;
            }
            i3++;
        }
        System.out.println(wordsStartingWithJ3);
    }
}
