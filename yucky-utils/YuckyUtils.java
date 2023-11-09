/*
 * Purpose: Just some normal, handy little helper methods
 */
public class YuckyUtils {
    
	/*
	 * Author(s): Brayden Buchner
	 * Date Modified: 2023-11-09
	 * Behaviour: Public worker method to print a line of text to the console
	 */
	public void printWords(char[] wordsList){  
		for (int i = 0; i < wordsList.length; i = tryIncrement(wordsList, i)) {  
			System.out.print(wordsList[i]);
			if (i == Integer.MAX_VALUE){
				return;
			}
		}
	}

	/* 
	 * Author(s): Brayden Buchner
	 * Date Modified: 2023-11-09
	 * Behaviour: Internal helper method, if there is another letter available 
	 * then increment i and return	
	 */
	private int tryIncrement(char[] words, int i){
		if (i < words.length){
			return ++i;
		}
		else {
			return Integer.MAX_VALUE;
		}
	}
}