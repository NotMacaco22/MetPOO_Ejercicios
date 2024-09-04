package models;

/**
 * @author silva
 * @version 1.0
 * @created 03-Sep-2024 5:53:22 PM
 */
public class Admission {

	public Admission(){
	}

	public void finalize() throws Throwable {

	}
	/**
	 * @param student
	 * @return
	 */
	public void calcScholarship(Student student) {
		student.setHasSchoolarship(student.getAverage() >= 80);
	}



}//end Admission