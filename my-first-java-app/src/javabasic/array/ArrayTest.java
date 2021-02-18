package javabasic.array;

public class ArrayTest {

    public static void main(String[] args) {

        int[] arr = new int[10];

        int[] arr2 = {1,2,3};

        int[] arr3 = new int[]{1,2,3};

        for(int i=0, num=1; i<arr.length; i++, num++){
            arr[i] = num;
//            System.out.println(arr[i]);
        }

        char[] arr4 = new char[26];
        char ch = 'A';

        for(int i=0; i<arr4.length; i++){
            arr4[i] = ch++;
            System.out.println(arr4[i]);
        }
    }
}
