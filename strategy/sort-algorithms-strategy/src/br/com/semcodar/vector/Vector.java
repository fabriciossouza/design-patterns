package br.com.semcodar.vector;

import br.com.semcodar.algorithm.Algorithm;
import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
public class Vector {

	private @Setter  int[] array;
	private @Setter  Algorithm algorithm;

	public int[] sort() {
		return algorithm.sort(array);
	}
}
