package com.lenearsearchalgo;

public class leetcode1295 {
    public static void main(String[] args) {
        int [] nums={34,34,3,4,345,3,5,35,3,53,5,3};
//        Given an array nums of integers, return how many of them contain an even number of digits.
//        Input: nums = [12,345,2,6,7896]
//        Output: 2
//        Explanation:
//        12 contains 2 digits (even number of digits).
//        345 contains 3 digits (odd number of digits).
//        2 contains 1 digit (odd number of digits).
//        6 contains 1 digit (odd number of digits).
//        7896 contains 4 digits (even number of digits).
//                Therefore, only 12 and 7896 contain an even number of digits.


                System.out.println(findnum(nums));
            }
            static boolean even(int num){
                String s=Integer.toString(num);
                int l=s.length();
                if(l%2==0){
                    return true;
                }
                return false;


            }

            static int findnum(int[] arr){
                int c=0;
                for(int num: arr){
                    if(even(num)){
                        c++;
                    }
                }
                return c;
            }

        }

