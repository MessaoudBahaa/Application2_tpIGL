package com.company;

public class Main {

    public static void main(String[] args) {
        //try{
            //int[] v = VectorHelper.SommerVecteurs(new int[]{5,16,54,12,15,2,0},new int[]{1,5,2});
            int[] v = {5,16,54,12,15,2,0};
            System.out.println("Debut :");
            AffichVect(v);
            System.out.println("Tri :");
            VectorHelper.TrierVect(v);
            AffichVect(v);
            System.out.println("Inverse :");
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
        System.out.println("");
    }
}

class DifferentSizeException extends Exception{};

/**
 * La class de manipulation des vecteurs.
 * @author BOUZAOUIT Oussama / BERBACHE Messaoud Bahe Eddine
 */
class VectorHelper{
    /**
     * Trier les �l�ments d'un vecteur en ordre croissant.
     * @param vect 
     * Le vecteur � trier.
     */
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
    
    /**
     * Sommer les �l�ments de deux vecteurs.
     * @param vect1
     * Le premier vecteur.
     * @param vect2
     * Le deuxi�me vecteur.
     * @return
     * Un nouveau vecteur contenant la somme des �l�ments des 2 vecteurs.
     * @throws DifferentSizeException 
     * Si les 2 vecteurs d'�ntr�e ont des tailles differentes.
     */
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
    
    /**
     * Inverser l'ordre des �l�ments d'un vecteur.
     * @param vect 
     * Le vecteur � inverser.
     */
    public static void InverserVecteur(int[] vect){
        for(int i = 0;i<vect.length/2;i++){
            int tmp = vect[i];
            vect[i] = vect[vect.length - i - 1];
            vect[vect.length - i - 1] = tmp;
        }
    }
}
