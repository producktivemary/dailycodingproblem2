package com.school;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(methodXY(new int[]{1, 2, 3, 4, 5})));
	// write your code here
    }


    public static int[] methodXY(int[] numberArray) {
        // get oldarray of integers
        // return newarray
        int[] newArray = new int[numberArray.length];
        int cache = 0;
            // newarray's i = oldarray.everyElementBesides(i);
        for (int counter = 0; counter < numberArray.length; counter++) {

            for (int index = 0; index < numberArray.length; index++) {

                if (index != counter) {
                    if (cache == 0) {
                        cache = numberArray[index];
                    } else {
                        cache = Math.multiplyExact(cache, numberArray[index]);
                    }
                }
            }
            newArray[counter] += cache;
            cache = 0;
        }

        return newArray;
    }

}
