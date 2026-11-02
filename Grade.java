package edu.monmouth.lab1;

public class Grade {
	private String letter;
	
	private static final String DEFAULT_LETTER="UNKNOWN";
	private static final int MIN_LETTER_LENGTH = 1;
	
	
	public Grade() {
		
	}
	public Grade(String letter) {
		setGradeLetter(letter);
	}
	
	public String getGradeLetter() {
		return letter;
	}
	
	public double getGradeValue() {
		
		if (letter.equals("a")){
			return 90;
		}
		else if (letter.equals("b")) {
			return 80;
		}
		else if (letter.equals("c")) {
			return 70;
		}
		else {
			return 0;
		}
		
		
	}

	
	
	public void setGradeLetter(String letter) {
		this.letter = letter;
		
		if (letter == null) {
			this.letter = DEFAULT_LETTER;
		}
		else if (letter.length() < MIN_LETTER_LENGTH) {
			this.letter = DEFAULT_LETTER;
		}
		else if (letter.startsWith("A") || letter.startsWith("B") ||
				letter.startsWith("C")) {
			this.letter = letter.toLowerCase();
		}
		else {
			this.letter = DEFAULT_LETTER;
		}
			
	}

}
