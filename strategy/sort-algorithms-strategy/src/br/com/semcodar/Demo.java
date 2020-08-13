package br.com.semcodar;

import br.com.semcodar.algorithm.BubbleSort;
import br.com.semcodar.algorithm.QuickSort;
import br.com.semcodar.vector.Vector;

public class Demo {

    public static void main(String[] args) {

        var vector = new Vector(new BubbleSort());
        vector.sort();

        vector.setAlgorithm(new QuickSort());
        vector.sort();
    }

}
