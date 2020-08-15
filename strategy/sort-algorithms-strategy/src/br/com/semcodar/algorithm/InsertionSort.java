package br.com.semcodar.algorithm;

public class InsertionSort extends Algorithm {

    @Override
    public int[] sort(final int[] arrayUnsort) {

        int[] arraySort = arrayUnsort;

        for( int indexElement = 1; indexElement < arraySort.length; indexElement++){

            int element = arraySort[indexElement];
            int i;

            for(i = indexElement; i > 0 && arraySort[i - 1] > element; i--){
                arraySort[i] = arraySort[i-1];
            }

            arraySort[i] = element;
        }

        return arraySort;
    }

    /* //Exemple 2
    public int[] sort(final int[] arrayUnsort) {

        int[] arraySort = arrayUnsort;

        for( int indexElement = 1; indexElement < arraySort.length; indexElement++){

            int element = arraySort[indexElement];
            int indexBefore = indexElement - 1;

            while(indexBefore >= 0 && arraySort[indexBefore] > element){
                arraySort[indexBefore+1] = arraySort[indexBefore];
                indexBefore--;
            }

            arraySort[indexBefore+1] = element;
        }

        return arraySort;
    }*/
}