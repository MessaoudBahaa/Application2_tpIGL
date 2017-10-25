package com.company;

public class Main {

    public static void main(String[] args) {
    }
}

class DifferentSizeException extends Exception{}

/**
 * La class de manipulation des vecteurs.
 * @author BOUZAOUIT Oussama / BERBACHE Messaoud Bahe Eddine
 */
class VectorHelper2{
    /**
     * Trier les elements d'un vecteur en ordre croissant.
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
     * Sommer les elements de deux vecteurs.
     * @param vect1
     * Le premier vecteur.
     * @param vect2
     * Le deuxieme vecteur.
     * @return
     * Un nouveau vecteur contenant la somme des elements des 2 vecteurs.
     * @throws DifferentSizeException 
     * Si les 2 vecteurs d'entree ont des tailles differentes.
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
     * Inverser l'ordre des elements d'un vecteur.
     * @param vect 
     * Le vecteur a inverser.
     */
    public static void InverserVecteur(int[] vect){
        for(int i = 0;i<vect.length/2;i++){
            int tmp = vect[i];
            vect[i] = vect[vect.length - i - 1];
            vect[vect.length - i - 1] = tmp;
        }
    }

    /**
     * Multiplier un vecteur par un entier
     * @param vect un vecteur des entiers
     * @param N un entier
     * @return le resultat de multiplication de vect par N
     */
    public static int[] Multiplier(int[] vect, int N){
        for(int i=0;i<vect.length;i++){
            vect[i]=vect[i]*N;
        }
        return vect;
    }

    /**
     * Retourner le Min et le Max d'un vecteur
     * @param vect
     * @return le max et le min du vecteur vect
     */
    public static MinMax GetMinMax(int[] vect){
        if(vect.length!=0) {
            MinMax minMax = new MinMax(vect[0],vect[0]);
            for (int i = 1; i < vect.length; i++) {
                if(vect[i]<minMax.getMin()){
                    minMax.setMin(vect[i]);
                }else if(vect[i]>minMax.getMax()){
                    minMax.setMax(vect[i]);
                }
            }
            return minMax;
        }
        return null;
    }

	// write your code here
        

    }


/**
 * Une classe qui respresente 2 valeurs entieres, un Min et un Max
 */
class MinMax{
    private int max;
    private int min;

    public MinMax( int min,int max) {
        this.max = max;
        this.min = min;
    }

    MinMax(){
        max=0;
        min=0;
    }
    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }
    public void afficher(){
        System.out.println("le max est : "+max);
        System.out.println("le min est : "+min);
    }

    @Override
    public boolean equals(Object o) {
        if ((((MinMax)o).getMax()== max ) && (((MinMax)o).getMin()== min )){return true;}else {return false;}
    }

}

