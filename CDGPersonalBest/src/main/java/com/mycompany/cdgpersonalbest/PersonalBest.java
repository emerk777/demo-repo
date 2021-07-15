/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cdgpersonalbest;

/**
 *
 * @author emer
 */
public class PersonalBest {
    
    public static void main(String[] args){
    
        String gymnasts = "Simone Biles";
        String categories = "floor";
        int N = 1;
        String[] row = {"Simone Biles,8,7,9"};
        int best = 0;
		
        for (int i = 0; i < N; i++) {

            String[] a = row[i].split(",");
            
            for(int j = 1; j < a.length; j++){
                int c = Integer.parseInt(a[j]);
                best = (a[0].equals(gymnasts) && best < c) ? c : best;
            }
            
        }

        System.out.println(best);
    }
    
}
