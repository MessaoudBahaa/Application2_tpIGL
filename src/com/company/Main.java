package com.company;

public class Main {

    public static void main(String[] args) {
	int[] v = {5,16,54,12,15,2,0};
        VectorHelper.TrierVect(v);
        for(int i = 0;i<v.length;i++){
            System.out.print(v[i]+",");
        }
        //i = 16, j = 5 : 5, 16
        //i = 54, j = 5 | i = 54, j = 16 : 5, 16, 54
        //i = 12, j = 5 | i = 12, j = 16
    }
}

class VectorHelper{
    
    public static void TrierVect(int[] vect){
        for(int i = 1;i<vect.length;i++){
            for(int j = 0;j<i;j++){
                if(vect[i] < vect[j]){
                    int a = vect[i];
                    vect[i] = vect[j];
                    vect[j] = a;
                    continue;
                }
            }
        }
    }
}
