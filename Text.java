/**
 * Permet de contenir un ou des mots qui seront affich�s avec la classe
 * {@link #Show}
 * 
 * @author ymatagne
 * modifi� pfa
 * 
 */
 
// Class Text
// Class Text2
// Class Text3
public class Text {
	private final String word;

	public Text(final String word) {
		// Commentaire VDU
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
