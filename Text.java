/**
 * Permet de contenir un ou des mots qui seront affichés avec la classe
 * {@link #Show}
 * 
 * @author ymatagne
 * modifié hat
 * 
 * modifié mde
 *
 * modifié gle
 *
 * modifié sve
 *
 * modifié abn
 *
 * modifié jvn
 *
 * modifié mam
 * 
 * modifié fgo
 * 
 * modifié lma2
 *
 * modifié jda
 *
 * modifié jbg
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
		// commentaire JD
		return word;
	}

	@Override
	public String toString() {
		return word;
	}

}
