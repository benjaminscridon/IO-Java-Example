import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Beniamin Scridon
 */
public class CSVReader {

	private String fileName;

	public CSVReader(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * Note that BufferedReader instance br will be closed automatically and
	 * make sure that you are using JDK 7 for this
	 */
	public List<Tea> readFromFile() {
		List<Tea> teas = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line = "";

			while ((line = br.readLine()) != null && isValidLine(line)) {

				String[] info = line.split(",");
				teas.add(constructTeaObject(info));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return teas;
	}

	private Tea constructTeaObject(String[] info) {
		return new Tea(info[0], info[1], Integer.parseInt(info[2]), Integer.parseInt(info[3]));
	}

	private boolean isValidLine(String line) {
		return !line.isEmpty() && line.trim().length() > 0;
	}
}
