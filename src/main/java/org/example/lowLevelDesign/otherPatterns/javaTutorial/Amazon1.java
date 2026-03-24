package org.example.lowLevelDesign.otherPatterns.javaTutorial;

import java.util.HashSet;
import java.util.Set;

public class Amazon1 {

    public int helper(int[] demand){
        int n = demand.length;
        int[] centers = new int[n];

        centers[0] = 1;
        for(int i=1; i<n; i++){
            if(demand[i] > demand[i-1]){
                centers[i] = Math.min(n, centers[i-1]+1);
            } else if(demand[i] < demand[i-1]){
                centers[i] = Math.max(1, centers[i-1]-1);
            } else{
                centers[i] = centers[i-1];
            }
        }

        Set<Integer> ans = new HashSet<>();
        for(int center : centers){
            ans.add(center);
        }
        return ans.size();
    }
    public static void main(String[] args) {
        Amazon1 a = new Amazon1();
        int[] demand = new int[]{10, 20, 30, 15, 10};
        int[] demand1 = new int[]{100, 85, 80};
        int temp = a.helper(demand1);
        System.out.println(temp);


    }
}
