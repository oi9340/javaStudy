package javabasic.array;

public class ArrayCopy {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};
        int[] arr2 = {1,2,3,4,5};

        System.arraycopy(arr, 0, arr2, 1, 3);
        //system클래스의 static 메서드 arraycopy

        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }
    }
}
