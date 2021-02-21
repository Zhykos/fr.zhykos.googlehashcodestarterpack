package fr.zhykos.googlehashcodestarterpack;

import java.io.IOException;
import java.util.List;

import hashcode.HashCode;

public final class Main {

	private Main() {
		// Do nothing
	}

	public static void main(final String[] args) throws IOException {
		final String filename = args[0];
		final List<FileLine> lines = Helpers.getFileLines(filename);
		final List<FileLine> outputLines = HashCode.resolve(lines, Problem.getProblem(filename));
		Helpers.writeLines(outputLines, filename);
	}

}
