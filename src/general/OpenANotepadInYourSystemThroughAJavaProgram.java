package general;

import java.io.IOException;

public class OpenANotepadInYourSystemThroughAJavaProgram {

	public static void main(String[] args) {
		try {
			Runtime.getRuntime().exec("notepad.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
