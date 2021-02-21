package fr.zhykos.googlehashcodestarterpack;

import java.io.IOException;

public enum Problem {

	A_EXAMPLE, B, C, D, E, F;

	public static Problem getProblem(final String filename) throws IOException {
		switch (filename) {
		case "a_example.txt": //$NON-NLS-1$
			return A_EXAMPLE;
		case "b_file.txt": //$NON-NLS-1$
			return B;
		case "c_file.txt": //$NON-NLS-1$
			return C;
		case "d_file.txt": //$NON-NLS-1$
			return D;
		case "e_file.txt": //$NON-NLS-1$
			return E;
		case "f_file.txt": //$NON-NLS-1$
			return F;
		default:
			throw new IOException("Cannot find Problem type from filename: '" + filename + "'"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

}
