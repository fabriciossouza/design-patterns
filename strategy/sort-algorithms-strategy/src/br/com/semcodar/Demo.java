package br.com.semcodar;

import br.com.semcodar.algorithm.InsertionSort;
import br.com.semcodar.vector.Vector;

import java.util.Arrays;

import static java.lang.System.out;

public class Demo {

    public static void main(String[] args) {

        final int[] array = {20, 35, -15, 7, 55, 1, -22};

        var vector = new Vector(array, new InsertionSort());
        int[] newArray = vector.sort();

        out.println(Arrays.toString(newArray));

    }

}