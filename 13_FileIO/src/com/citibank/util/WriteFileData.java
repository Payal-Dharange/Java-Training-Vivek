package com.citibank.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteFileData {
	private Writer writer;

	public boolean writeData(File file, String data) {
		try {
			writer = new FileWriter(file, true);
			writer.write("\n");
			writer.write(data);
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
}
