package fr.zhykos.googlehashcodestarterpack;

import java.util.ArrayList;
import java.util.List;

public class FileLine {

	private final List<Integer> columns = new ArrayList<>();

	public void add(final int integer) {
		this.columns.add(Integer.valueOf(integer));
	}

	public void add(final Integer integer) {
		this.columns.add(integer);
	}

	public List<Integer> getColumns() {
		return this.columns;
	}

	public int[] getColumnsInt() {
		return this.columns.stream().mapToInt(Integer::intValue).toArray();
	}

	@Override
	public String toString() {
		return this.columns.toString();
	}

}
