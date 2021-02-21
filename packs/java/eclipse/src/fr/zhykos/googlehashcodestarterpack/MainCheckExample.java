package fr.zhykos.googlehashcodestarterpack;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import hashcode.HashCode;

public final class MainCheckExample {

	private MainCheckExample() {
		// Do nothing
	}

	public static void main(final String[] args) throws IOException {
		final List<FileLine> lines = Helpers.getFileLines("a_example.txt"); //$NON-NLS-1$
		final List<FileLine> outputLines = HashCode.resolve(lines, Problem.A_EXAMPLE);

		final List<FileLine> referenceLines = Helpers.getFileLines("a_example_solution.txt"); //$NON-NLS-1$

		final List<String> inLinesStr = Helpers.linesToStringList(referenceLines);
		final String inStr = inLinesStr.stream().collect(Collectors.joining("\n")); //$NON-NLS-1$
		final List<String> outLinesStr = Helpers.linesToStringList(outputLines);
		final String outStr = outLinesStr.stream().collect(Collectors.joining("\n")); //$NON-NLS-1$

		if (inStr.equals(outStr)) {
			System.out.println("Example resolve is OK!"); //$NON-NLS-1$
		} else {
			System.err.println("Example resolve is not OK!"); //$NON-NLS-1$
			System.out.println("Reference:"); //$NON-NLS-1$
			System.out.println(inStr);
			System.out.println();
			System.out.println("Resolve export error:"); //$NON-NLS-1$
			System.err.println(outStr);
		}
	}

}
