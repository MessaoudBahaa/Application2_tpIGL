package com.company;

public class Main {

    public static void main(String[] args) {
        try{
            int[] v = VectorHelper.SommerVecteurs(new int[]{5,16,54,12,15,2,0},new int[]{1,5,2});
            AffichVect(v);
        }
        catch(DifferentSizeException e){
            System.err.println("Diff Size Exception !!");
        }
    }
    
    private static void AffichVect(int[] v){
        for(int i = 0;i<v.length;i++){
            System.out.print(v[i]+",");
        }
    }
}

class DifferentSizeException extends Exception{};

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
    
    public static int[] SommerVecteurs(int[] vect1, int[] vect2) throws DifferentSizeException{
        if(vect1.length != vect2.length){
            throw new DifferentSizeException();
        }
        int[] res = new int[vect1.length];
        for(int i = 0;i<vect1.length;i++){
            res[i] = vect1[i] + vect2[i];
        }
        return res;
    }
}
