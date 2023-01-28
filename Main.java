import java.util.*;  
public class Main
{
	public static void main(String[] args) {
		System.out.println("Welcome");
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int sec = hour*60*60;
		System.out.println(sec);
	}
}

