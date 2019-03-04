import java.io.IOException;
import java.util.Scanner;

public class TestProblema{
	private static String input, line;
	
	public static String getInput() {
		return input;
	}

	public static void setInput(String input) {
		TestProblema.input = input;
	}

	public static String getLine() {
		return line;
	}

	public static void setLine(String line) {
		TestProblema.line = line;
	}

	public static void main(String[] args) throws IOException 
		{
		
		Scanner scanner = new Scanner(System.in);
		WriteInFile  wi = new WriteInFile();
		try 
		{
			while (true) 
			{
				
				
				{
					System.out.println("Introduceti un text");
					setInput(scanner.nextLine());

					if ("quit".equals(input)) {
						System.out.println("Am terminat");
						return;
					}
					
				
				}
				System.out.println("Introduceti calea catre un fisier de iesire");
				setLine(scanner.nextLine());
				wi.writeFile();
			
			}
		} finally 
			{
				scanner.close();
			}
	}
	


}
