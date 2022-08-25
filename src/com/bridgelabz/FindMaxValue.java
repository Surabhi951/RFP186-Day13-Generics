package com.bridgelabz;

public class FindMaxValue {
    public static Integer testMaximum(Integer x, Integer y, Integer z){
        Integer max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }

    public static Float testMaximum(Float x, Float y, Float z){
        Float max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }

    public static String testMaximum(String x, String y, String z){
        String max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("The maximum of integer is: " +testMaximum(20,15,10));
        System.out.println("The maximum of float is: " +testMaximum(1.3f,3.5f,2.3f));
        System.out.println("The maximum of String is:" +testMaximum("Apple","Banana","Peach"));
    }

}
