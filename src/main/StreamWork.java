package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamWork {
	public static void copyFileToFile(File in, File out) throws IOException {
		if (in == null || out == null) {
			throw new IllegalArgumentException("null File pointer");
		}
		try (InputStream is = new FileInputStream(in); 
				OutputStream os = new FileOutputStream(out)) {
			streamCopy(is, os);
		} 
		catch (IOException e) {
			throw e;
		}
	}
	public static void streamCopy(InputStream is, OutputStream os) throws IOException {
		if (is == null || os == null) {
			throw new IllegalArgumentException("Stream null");
		}
		byte[] buffer = new byte[1024 * 1024];
		int byteRead = 0;
		for (; (byteRead = is.read(buffer)) > 0;) {
			os.write(buffer, 0, byteRead);
		}
	}

}
