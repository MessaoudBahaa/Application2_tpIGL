package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
class MinMax{
    private int max;
    private int min;

    public MinMax(int max, int min) {
        this.max = max;
        this.min = min;
    }

    MinMax(int m){
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
}
class VectorHelper{

	 public void Multiplier(int[] vect, int N){
	     for(int i=0;i<vect.length;i++){
	         vect[i]=vect[i]*N;
         }
     }
     public MinMax GetMinMax(int[] vect){
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
}
