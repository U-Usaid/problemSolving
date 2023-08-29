package org.example;

import java.util.Arrays;

import static org.example.EvaluateRPN.evalRPN;
import static org.example.IsomorphicString.areIsomorphic;
import static org.example.Rotate.rotate;

public class Main {
    public static void main(String[] args) {

        //Q1)Rotate
//        int[] nums = {1, 2, 3, 4, 5, 6, 7};
//        int k = 3;
//
//        System.out.println("Original Array: " + Arrays.toString(nums));
//        rotate(nums, k);
//        System.out.println("Rotated Array: " + Arrays.toString(nums));



                //Q2)EvaluateRPN
//        String[] expression1 = {"2", "1", "+", "3", "*"};
//        String[] expression2 = {"4", "13", "5", "/", "+"};
//




            //Q3)IsomorphicString
        String s1 = "egg";
        String t1 = "add";
        System.out.println(areIsomorphic(s1, t1));

        String s2 = "foo";
        String t2 = "bar";
        System.out.println(areIsomorphic(s2, t2));


    }
}