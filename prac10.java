import java.util.*;
import java.io.*;

class prac10{
	static void revstr(){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine(); 
		String revstr = "";
		for(int i=0; i<str.length(); i++)
			revstr = str.charAt(i) + revstr; 
		System.out.println("Given: "+str+"\nReverse: "+revstr); 
		if(str.equalsIgnoreCase(revstr))
			System.out.println("Penlindrome");
		else
			System.out.println("Not Penlind");
	}
	static void fileops(){
		try{
			File file = new File("C:\\Users\\KN00832612\\Documents\\test.txt");
			if(file.createNewFile())
				System.out.println("File Created");
			else
				System.out.println("File Already Exist");
			FileWriter writer = new FileWriter(file); 
			writer.write("Test data");
			writer.close();
			
			FileReader reader = new FileReader(file); 
			int c; 
			while((c=reader.read()) != -1){
				System.out.print((char) c); 
			}
			
		} catch (Exception e){
			System.out.println("Exception: "+e.getMessage()); 
		} 
		
	}
	public static void main(String[] args){
		//revstr();	
		//facto();
		//charCount();
		//upperlower();
		//sortarray();
		//startwith();
		//prime();
		//fibonanci();
		//dupary();
		//swapnotext();
		//charfreq();
		fileops();
	}
}