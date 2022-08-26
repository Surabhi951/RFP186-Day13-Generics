package com.bridgelabz;

public class FindMaxValue<E extends Comparable<E>> {

    E x, y, z, p, q;

    public FindMaxValue(E x, E y, E z, E p, E q){
        this.x = x;
        this.y = y;
        this.z = z;
        this.p = p;
        this.q = q;
    }
    public static <E extends Comparable<E>> E testMaximum(E x, E y, E z, E p, E  q){
        E max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        if(p.compareTo(max) > 0){
            max =p;
        }
        if(q.compareTo(max) > 0){
            max = q;
        }
        return max;

    }




    public static void main(String[] args) {
        System.out.println("The maximum of integer is: " +testMaximum(20,15,10, 25, 18));
        System.out.println("The maximum of float is: " +testMaximum(1.3f,3.5f,2.3f, 2.6f, 1.8f));
        System.out.println("The maximum of String is:" +testMaximum("Apple","Banana","Peach","Mango","Pineapple"));
    }
}
