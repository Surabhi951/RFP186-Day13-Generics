package com.bridgelabz;

public class FindMaxValue<E extends Comparable<E>> {

    void testMaximum(E x, E y, E z, E p, E  q){
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
        printMax(max);
    }

    void printMax(E max){
        System.out.println("maximum value is "+max);
    }


    public static void main(String[] args) {
        FindMaxValue maxValue = new FindMaxValue();
        maxValue.testMaximum(20,15,10, 25, 18);
        maxValue.testMaximum(1.3f,3.5f,2.3f, 2.6f, 1.8f);
        maxValue.testMaximum("Apple","Banana","Peach","Mango","Pineapple");
    }
}
