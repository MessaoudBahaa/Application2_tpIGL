package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MB_Be on 10/24/2017.
 */
public class VectorHelperTest {
    int[] vect1={-5,3,1,0};
    int[] vect2={1,1,1,1};
    @Test
    public void trierVect() throws Exception {
        int[] vectRes={-5,0,1,3};
        int[] vect=vect1.clone();
        VectorHelper.TrierVect(vect);
        assertArrayEquals(vectRes,vect);
    }

    @Test
    public void sommerVecteurs() throws Exception {
        int[] vectRes={-4,4,2,1};
        assertArrayEquals(vectRes,VectorHelper.SommerVecteurs(vect1,vect2));
    }

    @Test
    public void inverserVecteur() throws Exception {
        int[] vectRes={0,1,3,-5};
        int[] vect=vect1.clone();
        VectorHelper.InverserVecteur(vect);
        assertArrayEquals(vectRes,vect);
    }

    @Test
    public void multiplier() throws Exception {
        int[] vectRes={-10,6,2,0};
        assertArrayEquals(vectRes,VectorHelper.Multiplier(vect1,2));
    }

    @Test
    public void getMinMax() throws Exception {

        assertEquals(new MinMax(-5,3),VectorHelper.GetMinMax(vect1));

    }

}