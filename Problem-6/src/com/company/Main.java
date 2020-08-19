package com.company;

import java.util.*;

class Main {

    // Function to assign rank to
    // array eleements
    static void changeArr(int[] input)
    {
        // Copy input array into newArray
        int newArray[]
                = Arrays
                .copyOfRange(input,
                        0,
                        input.length);

        // Sort newArray[] in ascending order
        Arrays.sort(newArray);
        int i;

        // Map to store the rank of
        // the array element
        Map<Integer, Integer> ranks
                = new HashMap<>();

        int rank = 1;

        for (int index = 0;
             index < newArray.length;
             index++) {

            int element = newArray[index];

            // Update rank of element
            if (ranks.get(element) == null) {

                ranks.put(element, rank);
                rank++;
            }
        }

        // Assign ranks to elements
        for (int index = 0;
             index < input.length;
             index++) {

            int element = input[index];
            input[index]
                    = ranks.get(input[index]);

        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        // Given array arr[]
        int[] arr = { 100, 2, 70, 2 };

        // Function Call
        changeArr(arr);

        // Print the array elements
        System
                .out
                .println(Arrays
                        .toString(arr));
    }
}
