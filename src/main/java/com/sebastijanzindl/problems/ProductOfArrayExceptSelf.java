package com.sebastijanzindl.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
       int[] result = new int[nums.length]; //fill the array with 1;
       Arrays.fill(result, 1);

       int prefix = 1;
       //Calculate all the products before the item
       for (int i = 1; i < nums.length; i++) {
           result[i] = prefix;
           prefix *= nums[i];
       }
       //Calculate all the products after the item
       int suffix = 1;
       for (int i = nums.length -1; i >=0; i--) {
           result[i] = suffix * result[i];
           suffix *= nums[i];
       }
       return result;
    }
}
