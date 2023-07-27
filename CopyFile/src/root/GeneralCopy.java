package root;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class GeneralCopy {
	void copyFile() {
		try {
			FileInputStream in = new FileInputStream("input.txt");
			FileOutputStream out = new FileOutputStream("myfile.txt");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
//				System.out.println(c);
			}
			System.out.println("\nSuccessfully copy");
			in.close();
			out.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
