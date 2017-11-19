import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordGenerator extends Thread {
	
	private Pipe pipe = null;
	
	public WordGenerator (Pipe _pipe) {
		pipe = _pipe;
	}
	
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("words.txt"));
			String word = null;
			while((word = br.readLine()) !=  null)
				pipe.put(word);
			
			pipe.put(null);
			br.close();
		} catch (IOException ioex) {
			ioex.printStackTrace();
		}
	}

}
