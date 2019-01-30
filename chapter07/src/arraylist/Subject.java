package arraylist;

public class Subject {
	
	// field
	String subjectName;
	int score;
	
	// constructor
	public Subject() {}
	public Subject(String subjectName, int score) {
		this.subjectName = subjectName;
		this.score = score;
	}
	
	// getter & setter
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
