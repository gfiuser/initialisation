/**
 * Permet de contenir un ou des mots qui seront affich�s avec la classe
 * {@link #Show}
 * 
 * @author ymatagne
 * modifi� hat
 * 
 * modifi� mde
 *
 * modifi� gle
 *
 * modifi� sve
 *
 * modifi� abn
 *
 * modifi� jvn
 */
 
// Class Text
public class Text {
	private final String word;

	public Text(final String word) {
		// commentaire GLE
		// commentaire JVN
		// commentaire RBR

		this.word = word;
	}

	/**
	 * @return a word modiftest
	 */
	public String getWord() {
		// commentaire GLE
		// commentaire ABN
		// commentaire RBR
		return word;
	}

	@Override
	public String toString() {
		return word;
	}

}
