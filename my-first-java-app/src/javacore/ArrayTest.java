package javacore;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayTest {

    public static void main(String[] args) {

        int[] inArray;
        inArray = new int[10];

        //String[] stringArray = new String[10];

        MyClass[] myClassArray;

        int[] int2 = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] int3 = {1,2,3,4,5,6,7,8,9};

        //System.out.println(int3[1]);

        String[] string = {"one","two","three"};
        //System.out.println(string[0]);

        string[1] = "four";
        //System.out.println(string[1]);

        inArray[0] = 0;
        int firstInt = inArray[0];
        //System.out.println("firstInt : "+firstInt);

        int arrayLength = inArray.length;
        //System.out.println("arrayLength : "+arrayLength);

        String[] stringArray = new String[10];
        for(int i=0; i<stringArray.length; i++){
            stringArray[i] = "String no "+i;
            //System.out.println(stringArray[i]);
        }

        int[] inArray2 = new int[10];
        for (int i=0; i<inArray2.length; i++){
            inArray2[i] = i;
            //System.out.println(inArray2[i]);
        }

        int[] inArray3 = new int[10];
        for (int theInt : inArray3){
            //System.out.println("theInt : "+theInt);
        }

        String[] stringArray2 = {"one", "two", "three"};
        for (String theString : stringArray2){
            //System.out.println("theString : "+theString);
        }

        int[][] inArray4 = new int[10][20];
        inArray4[0][2] = 129;
        int oneInt = inArray4[0][2];
        //System.out.println("oneInt : "+oneInt);

        int[][] inArray5 = new int[10][20];
        //System.out.println(inArray5[0].length);

        for (int i=0; i<inArray5.length; i++){
            for (int j=0; j<inArray5[i].length; j++){
                //System.out.println("i : "+i+" j : "+j);
            }
        }

        //int[] ints = new int[20];
        int[] ints  = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        int insertIndex = 10;
        int newValue = 123;

//        for(int i=ints.length-1; i>insertIndex; i--){
//            ints[i] = ints[i-1];
//        }
//
//        ints[insertIndex] = newValue;
        //System.out.println(Arrays.toString(ints));

        ArrayTest array = new ArrayTest();
        array.insertIntoArray(ints, insertIndex, newValue);

        int[] ints2 = new int[20];
        ints2[10] = 123;
        int removeIndex = 10;
//        for(int i=removeIndex; i<ints2.length-1; i++){
//            ints2[i] = ints2[i+1];
//        }
//        System.out.println(Arrays.toString(ints2));

        array.removeFromArray(ints2, removeIndex);

        int[] ints3 = {0,2,4,6,8,10};
        int minVal = Integer.MAX_VALUE;
        //System.out.println(minVal);
        for(int i=0; i<ints3.length; i++){
            if(ints3[i] < minVal){
                minVal = ints[i];
            }
        }
        //System.out.println("minVal : "+minVal);

        int maxVal = Integer.MIN_VALUE;
        //System.out.println(maxVal);
        for(int i=0; i<ints3.length; i++){
            if(ints3[i] > maxVal){
                maxVal = ints3[i];
            }
        }
        //System.out.println("maxVal : "+maxVal);

        int[] source = new int[10];
        //int[] dest = new int[10];

        for(int i=0; i<source.length; i++){
            source[i] = i;
            //dest[i] = source[i];
        }

        int[] dest = Arrays.copyOf(source, source.length); //0부터 복사 시작
        int[] dest2 = Arrays.copyOfRange(source, 2, 4);
//        System.out.println(Arrays.toString(source));
//        System.out.println(Arrays.toString(dest));
//        System.out.println(Arrays.toString(dest2));

        int[] ints4 = new int[10];
        for(int i=0; i<ints4.length; i++){
            ints4[i] = 10 - i;
        }
        //System.out.println(Arrays.toString(ints4));
        java.util.Arrays.sort(ints4);
        //System.out.println(Arrays.toString(ints4));

        Employee[] employeeArray = new Employee[4];
        employeeArray[0] = new Employee("Xander",1);
        employeeArray[1] = new Employee("John",2);
        employeeArray[2] = new Employee("Anna",3);
        employeeArray[3] = new Employee("Anna",5);

        java.util.Arrays.sort(employeeArray, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                //return o1.name.compareTo(o2.name);
                //return o1.employeeId - o2.employeeId;
                int nameDiff = o1.name.compareTo(o2.name);
                if (nameDiff != 0) {
                    return nameDiff;
                }
                return o1.employeeId - o2.employeeId;
            }
        });

        for(int i =0; i<employeeArray.length; i++){
            //System.out.println(employeeArray[i].name+" | "+employeeArray[i].employeeId);
        }

        int[] intArray = new int[10];
        //Arrays.fill(inArray, 123);
        Arrays.fill(intArray, 4, 5, 123); //??????????
        //System.out.println(Arrays.toString(inArray)); //[0, 0, 0, 123, 123, 0, 0, 0, 0, 0]

        int[] ints5 = {0,2,4,6,8,10};
        //int index = Arrays.binarySearch(ints5, 12);
        int index = Arrays.binarySearch(ints5, 0, 4, 12);
        //System.out.println(index);

        int[] intss1 = {0,2,4,6,8,10};
        int[] intss2 = {0,2,4,6,8,10};
        int[] intss3 = {10,8,6,4,2,0};

        //Arrays.sort(intss3);
        boolean ints1EqualsInts2 = Arrays.equals(intss1, intss2);
        boolean ints1EqualsInts3 = Arrays.equals(intss1, intss3);

        System.out.println(ints1EqualsInts2);
        System.out.println(ints1EqualsInts3);


    }

    public void insertIntoArray(int[] array, int insertIndex, int newValue){

        for(int i=array.length-1; i>insertIndex; i--){
            array[i] = array[i-1];
        }

        array[insertIndex] = newValue;
        //System.out.println(Arrays.toString(array));

    }

    public void removeFromArray(int[] array, int removeIndex){

        for(int i = removeIndex; i<array.length-1; i++){
            array[i] = array[i+1];
        }

        //System.out.println(Arrays.toString(array));
    }

    private static class Employee{
        public String name;
        public int employeeId;

        public Employee(String name, int employeeId){
            this.name = name;
            this.employeeId = employeeId;
        }
    }

}
