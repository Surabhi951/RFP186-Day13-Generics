package com.bridgelabz;

public class FindMaxValue<E extends Comparable<E>> {

    E x, y, z;

    public FindMaxValue(E x, E y, E z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public static <E extends Comparable<E>> E testMaximum(E x, E y, E z){
        E max = x;
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
