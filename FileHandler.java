package Tasks;
import java.io.*;

public class FileHandler extends methods {
	
//	Main Method
	public static void main(String[] args) {
		writeToFile("Hello, This is Task 1");
		readToFile();
		modifyFile("Hello, Task 1 is completed");
		readToFile();
	}
}

class methods{
	
	static String fileName = "myfile.txt";
	
//	Write Method
	public static void writeToFile(String content){
		try {
			FileWriter w = new FileWriter(fileName);
			w.write(content);
			w.close();
			System.out.println("File written Successfully");
		}
		catch(IOException e) {
			System.out.println("Error while writing to the File");
			e.printStackTrace();
		}
	}
	
//	Read Method
	public static void readToFile() {
		try {
			FileReader r = new FileReader(fileName);
			BufferedReader br = new BufferedReader(r);
			
			String line;
			
			System.out.println("Reading from file");
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
			System.out.println();
		}
		catch(IOException e) {
			System.out.println("Error while writing to the File");
			e.printStackTrace();
		}
	}
	
//	Modify File
	public static void modifyFile(String newContent) {
		System.out.println("Modifying File.... ");
		writeToFile(newContent);
	}
	
}