package fileHendlingDemo;

import java.io.File;
import java.util.Scanner;

public class RenameFiledemo {

	public static void main(String[] args) {
		File file = new File("E:\\Test\\new Folder");
		
		Scanner sc = new Scanner(System.in);
		String newName = sc.nextLine();
		
		String parent = file.getParent();
		
		File rename = new File(parent+"\\"+newName);
		
		file.renameTo(rename);
		
	}

}
