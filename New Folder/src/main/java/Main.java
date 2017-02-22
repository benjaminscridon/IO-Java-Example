/**
 * 
 * @author Beniamin Scridon
 *
 */
public class Main {
	public static void main(String[] args) {
		new CSVWriter().writeToFile("src/main/resources/output.csv",
				new CSVReader("src/main/resources/input.csv").readFromFile());
	}
}
