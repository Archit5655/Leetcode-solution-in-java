package arrayandaarlist;

import java.awt.*;
import java.util.ArrayList;

public class leetcode1431 {
    public static void main(String[] args) {

    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        ArrayList<Boolean> l=new ArrayList<>();
        int max=0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
            for (int j = 0; j < candies.length; j++) {
                if ((candies[j]+extraCandies) >max){
                    l.add(true);
                }
                else {
                    l.add(false);
                }
            }
            return l;
        }



}
