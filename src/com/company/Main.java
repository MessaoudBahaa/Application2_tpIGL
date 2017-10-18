package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
class MinMax{
    private int max;
    private int min;
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
}
class VectorHelper{

	 public void Multiplier(int[] vect, int N){
	     for(int i=0;i<vect.length;i++){
	         vect[i]=vect[i]*N;
         }
     }
     public MinMax GetMinMax(int[] vect){
        MinMax minMax = new MinMax();

     }
}
