package com.week4.tue;

import java.util.Arrays;
import java.util.HashMap;

public class TargetSum {
    static Integer[] getIndies(Integer[] Arr,Integer tar){
        HashMap<Integer,Integer> Map=new HashMap<>();
        Integer[] result=new Integer[2];

        for (Integer i=0;i<Arr.length;i++){
            Map.put(Arr[i],i);
            Integer index=Map.get(tar-Arr[i]);
            if(index!=null && 2*Arr[i]!=tar){
                result[0]=index;
                result[1]=i;
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(TargetSum.getIndies(new Integer[]{10,20,30,40,50,60},100)));

    }

}
