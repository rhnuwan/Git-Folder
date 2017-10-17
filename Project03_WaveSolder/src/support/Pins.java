
package support;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pins {

	private final int number;
	public String label;
	private final String directory;
	private final String export;
	private final String direction;
	private final String level;
        private final String out;

	public Pins(String name, int number,String out) {
		this.label = name;
		this.number = number;
                this.out = out;
		this.directory = "/sys/class/gpio/gpio" + String.valueOf(number);
		this.export = "/sys/class/gpio/export";
		this.direction = this.directory + "_"+ this.out + "/direction";
		this.level = this.directory + "_" + this.out + "/value";

    }

	public int exportPin() {
		try {
			Process process = Runtime.getRuntime().exec(
					new String[] {
							"su",
							"-c",
							"echo " + String.valueOf(this.number) + " > "
									+ this.export });
			process.waitFor();
			if (process.exitValue() == 0)
				return 0;
		} catch (IOException | InterruptedException e) {
		}
		return -1;
	}

	public void setDirection(String direction) {
		try {
			Process process = Runtime.getRuntime().exec(
					new String[] { "su", "-c",
							"echo " + direction + " > " + this.direction });
			process.waitFor();
		} catch (IOException | InterruptedException e) {
		}
	}

	public void setLevel(int level) {
		try {
			Process process = Runtime.getRuntime().exec(
					new String[] {
							"su",
							"-c",
							"echo " + String.valueOf(level) + " > "
									+ this.level });
			process.waitFor();
                        System.out.println("PIN HIGH");
		} catch (IOException | InterruptedException e) {
		}
	}

	public int getStatus() {
		try {
			Process process = Runtime.getRuntime().exec(
					new String[] { "su", "-c", "cat " + this.level });

			process.waitFor();
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					process.getInputStream()));
			StringBuilder text = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				text.append(line);
			}
			if (text.toString().isEmpty())
				return -1;
			char ch = text.charAt(0);
			if (Character.isDigit(ch))
				return Character.getNumericValue(ch);
			else
				return -1;
		} catch (IOException | InterruptedException e) {
		}
		return -1;
	}

	public String getDirection() {
		try {
			Process process = Runtime.getRuntime().exec(
					new String[] {
							"su",
							"-c",
							"cat " + this.direction });

			process.waitFor();
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					process.getInputStream()));
			StringBuilder text = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				text.append(line);
			}
			if (text.toString().isEmpty())
				return null;

			return text.toString();

		} catch (IOException | InterruptedException e) {
		}

		return null;
	}
}
