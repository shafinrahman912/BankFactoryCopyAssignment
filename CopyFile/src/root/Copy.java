package root;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Copy {
	String st = new String();
	String command = new String();
	String source = new String();
	String destination = new String();

	public Copy(String st, String command, String source) {

		this.st = st;
		this.command = command;
		this.source = source;
		if (st.equalsIgnoreCase("java") && command.equalsIgnoreCase("copy")) {
			copyFile(source);
		} else
			System.out.println("wrong Command");
	}

	public Copy(String st, String command, String source, String destination) {

		this.st = st;
		this.command = command;
		this.source = source;
		this.destination = destination;

		if (st.equalsIgnoreCase("java") && command.equalsIgnoreCase("copy")) {
			copyFile(source, destination);
		} else
			System.out.println("wrong Command");
	}

	void copyFile(String source) {
		try {
			FileInputStream in = new FileInputStream(source);


			ArrayList<Integer>  ch= new ArrayList<Integer>();

			for (int i = 0; in.read() != -1; i++) {
				ch.add(in.read());
			}

//			for (int i : ch) {
//				System.out.println(i);
//			}
			System.out.println("\nSuccessfully copy");
			in.close();
	
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	void copyFile(String source, String destination) {
		try {
			FileInputStream in = new FileInputStream(source);
			FileOutputStream out = new FileOutputStream(destination);

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
//				System.out.println(c);
			}
			System.out.println("\nSuccessfully copy & paste");
			in.close();
			out.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
