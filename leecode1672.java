package com.lenearsearchalgo;

public class leecode1672 {
    public static void main(String[] args) {
//        A customer's wealth is the amount of money they have in all their bank accounts.
//        The richest customer is the customer that has the maximum wealth.
//        Input: accounts = [[1,2,3],[3,2,1]]
//        Output: 6
//        Explanation:
//        1st customer has wealth = 1 + 2 + 3 = 6
//        2nd customer has wealth = 3 + 2 + 1 = 6
//        Both customers are considered the richest with a wealth of 6 each, so return 6.

    }

    int maximumwealth(int[][] accounts) {
        int max=0;
        for (int person = 0; person < accounts.length; person++) {
            int sum=0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum = sum + accounts[person][account];
            }
            if (max<sum){
                max=sum;
            }



        }
        return max;
    }
}
