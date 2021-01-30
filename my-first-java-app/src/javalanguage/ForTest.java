package javalanguage;

public class ForTest {

    public static void main(String[] args) {

        for(int i=0; i<10; i++){
//            System.out.println("I is : "+i);
        }

        for(int i=0; i<10; i++) {
//            System.out.println("i is 1:" + i);
        }
//            System.out.println("secondLine");

        for(int i=0, n=10; i<10; i++) {
//            System.out.println("i is 1:" + i);
        }

        String[] strings = {"one", "two", "three"};
        for(String str : strings){
//            System.out.println(str);
        }

        String[] strings2 = {"John", "Jack", "Abraham", "Jennifer", "Ann"};
        int wordsStartingWithJ = 0;
        for(int i=0; i<strings2.length; i++){
//            if(! strings2[i].toLowerCase().startsWith("j")){
//                continue;
//            }
            if(strings2[i].toLowerCase().startsWith("j")){
                wordsStartingWithJ++;
            }

            if(wordsStartingWithJ >= 3){
                System.out.println(i);
                break;
            }

        }
        System.out.println(wordsStartingWithJ);

    }
}
