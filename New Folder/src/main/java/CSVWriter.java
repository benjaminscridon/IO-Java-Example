import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * 
 * @author Beniamin Scridon
 *
 */
public class CSVWriter {

	public boolean writeToFile(String fileName, List<Tea> teas) {

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
			
			teas.forEach(tea -> writeLine(writer, tea));
		} catch (IOException e) {
			e.printStackTrace();
		} 

		return true;
	}
	
	private void writeLine(BufferedWriter writer,Tea tea) {
		try {
			writer.write(tea.getName()+"AA,"+tea.getPrice()*55+"\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
