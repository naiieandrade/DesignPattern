
public class WordSortMain {

	public static void main(String[] args) {
		
		//Create pipe between a generator and filter
		Pipe pipe = new PipeImpl();
		
		//create the generator and filter
		Thread wordGenerator = new WordGenerator(pipe);
		Thread wordSortFilter = new WordSortFilter(pipe);
		
		//start the generator and the filter
		wordGenerator.start();
		wordSortFilter.start();

	}

}
