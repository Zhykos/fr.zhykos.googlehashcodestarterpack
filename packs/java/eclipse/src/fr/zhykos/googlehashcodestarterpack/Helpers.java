package fr.zhykos.googlehashcodestarterpack;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

public final class Helpers {

	private Helpers() {
		// Do nothing
	}

	public static List<FileLine> getFileLines(final String filename) throws IOException {
		final List<String> lines = Files.readAllLines(new File("resources/inputs/" + filename).toPath()); //$NON-NLS-1$
		return lines.stream().map(lineStr -> {
			final String[] split = lineStr.split(" "); //$NON-NLS-1$
			final FileLine fileLine = new FileLine();
			for (final String intStr : split) {
				fileLine.add(Integer.valueOf(intStr));
			}
			return fileLine;
		}).collect(Collectors.toList());
	}

	public static void writeLines(final List<FileLine> outputLines, final String filename) throws IOException {
		final List<String> linesStr = linesToStringList(outputLines);
		Files.write(new File("resources/outputs/" + filename).toPath(), linesStr); //$NON-NLS-1$
	}

	public static List<String> linesToStringList(final List<FileLine> outputLines) {
		return outputLines.stream().map(
				line -> line.getColumns().stream().map(integer -> integer.toString()).collect(Collectors.joining(" "))) //$NON-NLS-1$
				.collect(Collectors.toList());
	}

}
