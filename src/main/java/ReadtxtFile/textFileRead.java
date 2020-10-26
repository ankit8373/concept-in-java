package ReadtxtFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class textFileRead {
	
	
	
	public static void main(String[] args) throws IOException {
		File filepath=  new File("C:\\Users\\Ankit\\Desktop\\concept in java\\file.txt");
		FileReader fileread=	new FileReader(filepath);
		long filelength=filepath.length();
		for(long i=0 ; i <filelength; i++) {
			System.out.print((char) fileread.read());
			
		}
	}

}
