/**
 * Permet de contenir un ou des mots qui seront affichés avec la classe
 * {@link #Show}
 * 
 * @author ymatagne
 * 
 */
 
public class Text {
	private final String word;

	public Text(final String word) {
		this.word = word;
	}

	/**
	 * @return a word modiftest
	 */
	public String getWord() {
		return word;
	}

	@Override
	public String toString() {
		return word;
	}

}
