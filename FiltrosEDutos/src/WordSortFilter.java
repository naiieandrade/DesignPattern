import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WordSortFilter extends Thread {
	private Pipe pipe =  null;
	private List<String> wordList = new ArrayList<String>();
	
	public WordSortFilter (Pipe _pipe) {
		pipe = _pipe;
	}
	
	public void run () {
		String word = null;
		
		try {
			while ((word=(String) pipe.get()) != null)
				wordList.add(word);
		} catch (InterruptedException i) {}
		
		//now sort the word list
		Collections.sort(wordList);
		
		//print the sorted word list and write is to a file
		try {
			FileWriter fw = new FileWriter("sortedWords.txt");
			for (String s : wordList) {
				System.out.println(s);
				fw.write(s + "\n");
			}
			fw.close();
		} catch (IOException io) {
			io.printStackTrace();
		}
	}

}
