package main;

import java.io.File;
import java.io.IOException;

public final class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFileFilter filter = new MyFileFilter("tx");
		File folder = new File("C:\\Users\\vitaliy\\Desktop\\input");
		
		File[] fileList = folder.listFiles(filter);
		
		for (File file : fileList) {
		System.out.println(file.getName());
		System.out.println(file);
		File in = new File(file.getAbsolutePath());
		File out = new File(file.getName());
		try {
			StreamWork.copyFileToFile(in, out);
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
        
		
	}

}
