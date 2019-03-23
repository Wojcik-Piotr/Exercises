import java.util.Scanner;
public class Hello{
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] angr){
		System.out.print("Witaj Świecie\n");
		Loop loop = new Loop();
		User user = new User(setNumber(), setNumber());
	}
	private static int setNumber(){
		System.out.print("podaj liczbę: \n");
		return scanner.nextInt();
	}
}