package com.company;

public class Main {

    public static void main(String[] args) {
        //try{
            //int[] v = VectorHelper.SommerVecteurs(new int[]{5,16,54,12,15,2,0},new int[]{1,5,2});
            int[] v = {5,16,54,12,15,2,0};
            AffichVect(v);
            VectorHelper.InverserVecteur(v);
            AffichVect(v);
        /*}
        catch(DifferentSizeException e){
            System.err.println("Diff Size Exception !!");
        }*/
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
	boolean en_desordre = true;
	while (en_desordre)
	{
            en_desordre = false;
            for (int j = 0; j < vect.length-1; j++)
            {
                if(vect[j] > vect[j+1])
                {
                    int tmp = vect[j+1];
                    vect[j+1] = vect[j];
                    vect[j] = tmp;
                    en_desordre = true;
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
    
    public static void InverserVecteur(int[] vect){
        for(int i = 0;i<vect.length/2;i++){
            int tmp = vect[i];
            vect[i] = vect[vect.length - i - 1];
            vect[vect.length - i - 1] = tmp;
        }
    }
}
