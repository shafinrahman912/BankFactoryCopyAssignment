package root;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str[];
		str = sc.nextLine().split(" ");
//		for (String string : str) {
//			System.out.println(string);
//		}
		if (str.length == 3) {
			Copy copyContent = new Copy(str[0], str[1], str[2]);
		} else if (str.length == 4) {
			Copy copyContent = new Copy(str[0], str[1], str[2], str[3]);
		} else
			System.out.println("wrong command");
		sc.close();


	}

}
