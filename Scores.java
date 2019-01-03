package score;

import java.util.List;
import java.util.Map;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Scores {
	static List<Map<Integer, String>> scoresWithGradesList = new ArrayList<Map<Integer, String>>();
	static int n = 1;

	public static void main(String[] args) {
		List<Integer> scores = new ArrayList<Integer>();
		scores.add(4);
		scores.add(47);
		scores.add(47);
		scores.add(41);
		
		System.out.println(scoreGrading(scores));
	}

	public static char getGrade(char grade) {
		if (grade == 'E') {
			grade = 'F';
		}
		return grade;
	}

	public static List<Map<Integer, String>> totalNumOfStudentsLessThanFive(int numberOfStudents, char grade,
			List<Integer> scores) {
		for (int i = 0; i < numberOfStudents; i++) {
			Map<Integer, String> scoreGradeMap = new HashMap<Integer, String>();
			if (i < numberOfStudents - 1) {
				// If index 'i' score equals index 'i+1'
				while(scores.get(i) == scores.get(i + 1)) {
					int sameScoreValue = scores.get(i);
					scoreGradeMap.put(sameScoreValue, Character.toString(grade));
					scoresWithGradesList.add(scoreGradeMap);
					i++;
					if (i < numberOfStudents - 1) {
						continue;
					} else {
						break;
					}
				
				}
				
			} 
				scoreGradeMap.put(scores.get(i), Character.toString(grade));
				scoresWithGradesList.add(scoreGradeMap);
				grade++;
			
		}
		return scoresWithGradesList;
	}

	public static List<Map<Integer, String>> totalNumOfStudentsDivisibleByFive(int numberOfStudents, int gradeBucket,
			char grade, List<Integer> scores) {
		for (int i = 0; i < numberOfStudents; i++) {
			Map<Integer, String> scoreGradeMap = new HashMap<Integer, String>();
			if (n <= gradeBucket) {
				scoreGradeMap.put(scores.get(i), Character.toString(grade));
				scoresWithGradesList.add(scoreGradeMap);
				n++;
				if (n > gradeBucket) {
					n = 1;
					if (i < numberOfStudents - 1) {
						// While index 'i' score equal to index 'i+1' score
						while (scores.get(i) == scores.get(i + 1)) {
							scoreGradeMap.put(scores.get(i), Character.toString(grade));
							scoresWithGradesList.add(scoreGradeMap);
							i++;
							if (i < numberOfStudents - 1) {
								continue;
							} else {
								break;
							}
						}
						grade++;
						grade = getGrade(grade);
					}
				}
			}
		}
		return scoresWithGradesList;
	}

	public static List<Map<Integer, String>> remainderOneWhenDividedByFive(int numberOfStudents, int gradeBucket,
			char grade, List<Integer> scores) {
		boolean numOfExtraGradesToBeAdded = true;
		for (int i = 0; i < numberOfStudents; i++) {
			if (n <= gradeBucket) {
				Map<Integer, String> scoreGradeMap = new HashMap<Integer, String>();
				scoreGradeMap.put(scores.get(i), Character.toString(grade));
				scoresWithGradesList.add(scoreGradeMap);
				n++;
				if (n > gradeBucket) {
					if (grade < 'F') {
						n = 1;
						if (i < numberOfStudents - 1) {
							// While index 'i' score equal to index 'i+1' score
							while (scores.get(i) == scores.get(i + 1)) {
								scoreGradeMap.put(scores.get(i), Character.toString(grade));
								scoresWithGradesList.add(scoreGradeMap);
								i++;
								if (i < numberOfStudents - 1) {
									continue;
								} else {
									break;
								}
							}
							grade++;
							grade = getGrade(grade);
						}
					}
					if (numOfExtraGradesToBeAdded == true) {
						if (grade == 'F') {
							/*
							 * adding 1 additional number of gradeBucket for the Grade F because remainder
							 * equals 1 when Total number of students divided by 5
							 */
							gradeBucket++;
							numOfExtraGradesToBeAdded = false;
							continue;
						}
					}
					
				}
			}
		}

		return scoresWithGradesList;
	}

	public static List<Map<Integer, String>> remainderTwoWhenDividedByFive(int numberOfStudents, int gradeBucket,
			char grade, List<Integer> scores) {
		boolean numOfExtraGradesToBeAdded = true;
		for (int i = 0; i < numberOfStudents; i++) {
			if (n <= gradeBucket) {
				Map<Integer, String> scoreGradeMap = new HashMap<Integer, String>();
				scoreGradeMap.put(scores.get(i), Character.toString(grade));
				scoresWithGradesList.add(scoreGradeMap);
				n++;
				if (n > gradeBucket) {
					if (grade < 'D') {
						n = 1;
						if (i < numberOfStudents - 1) {
							// While index 'i' score equal to index 'i+1' score
							while (scores.get(i) == scores.get(i + 1)) {
								scoreGradeMap.put(scores.get(i), Character.toString(grade));
								scoresWithGradesList.add(scoreGradeMap);
								i++;
								if (i < numberOfStudents - 1) {
									continue;
								} else {
									break;
								}
							}
							grade++;
							grade = getGrade(grade);
						}
					}
					if (numOfExtraGradesToBeAdded == true) {
						if (grade == 'D') {
							/*
							 * adding 1 additional number of gradeBucket for the Grades D,F because
							 * remainder equals 2 when Total number of students divided by 5
							 */
							gradeBucket++;
							numOfExtraGradesToBeAdded = false;
							continue;
						}
					}
					if (numOfExtraGradesToBeAdded == false && grade > 'C') {
						n = 1;
						if (i < numberOfStudents - 1) {
							// While index 'i' score equal to index 'i+1' score
							while (scores.get(i) == scores.get(i + 1)) {
								scoreGradeMap.put(scores.get(i), Character.toString(grade));
								scoresWithGradesList.add(scoreGradeMap);
								i++;
								if (i < numberOfStudents - 1) {
									continue;
								} else {
									break;
								}
							}
							grade++;
							grade = getGrade(grade);
						}
					}
				}

			}
		}

		return scoresWithGradesList;
	}

	public static List<Map<Integer, String>> remainderThreeWhenDividedByFive(int numberOfStudents, int gradeBucket,
			char grade, List<Integer> scores) {
		boolean numOfExtraGradesToBeAdded = true;
		for (int i = 0; i < numberOfStudents; i++) {
			if (n <= gradeBucket) {
				Map<Integer, String> scoreGradeMap = new HashMap<Integer, String>();
				scoreGradeMap.put(scores.get(i), Character.toString(grade));
				scoresWithGradesList.add(scoreGradeMap);
				n++;
				if (n > gradeBucket) {
					if (grade < 'C') {
						n = 1;
						if (i < numberOfStudents - 1) {
							// While index 'i' score equal to index 'i+1' score
							while (scores.get(i) == scores.get(i + 1)) {
								scoreGradeMap.put(scores.get(i), Character.toString(grade));
								scoresWithGradesList.add(scoreGradeMap);
								i++;
								if (i < numberOfStudents - 1) {
									continue;
								} else {
									break;
								}
							}
							grade++;
							grade = getGrade(grade);
						}
					}
					if (numOfExtraGradesToBeAdded == true) {
						if (grade == 'C') {
							/*
							 * adding 1 additional number of gradeBucket for the Grade C,D,F because
							 * remainder equals 3 when Total number of students divided by 5
							 */
							gradeBucket++;
							numOfExtraGradesToBeAdded = false;
							continue;
						}
					}
					if (numOfExtraGradesToBeAdded == false && grade > 'B') {
						n = 1;
						if (i < numberOfStudents - 1) {
							// While index 'i' score equal to index 'i+1' score
							while (scores.get(i) == scores.get(i + 1)) {
								scoreGradeMap.put(scores.get(i), Character.toString(grade));
								scoresWithGradesList.add(scoreGradeMap);
								i++;
								if (i < numberOfStudents - 1) {
									continue;
								} else {
									break;
								}
							}
							grade++;
							grade = getGrade(grade);
						}
					}
				}
			}
		}
		return scoresWithGradesList;
	}

	public static List<Map<Integer, String>> remainderFourWhenDividedByFive(int numberOfStudents, int gradeBucket,
			char grade, List<Integer> scores) {
		Boolean numOfExtraGradesToBeAdded = true;
		for (int i = 0; i < numberOfStudents; i++) {
			if (n <= gradeBucket) {
				Map<Integer, String> scoreGradeMap = new HashMap<Integer, String>();
				scoreGradeMap.put(scores.get(i), Character.toString(grade));
				scoresWithGradesList.add(scoreGradeMap);
				n++;
				if (n > gradeBucket) {
					n = 1;
					if (i < numberOfStudents - 1) {
						// While index 'i' score equal to index 'i+1' score
						while (scores.get(i) == scores.get(i + 1)) {
							scoreGradeMap.put(scores.get(i), Character.toString(grade));
							scoresWithGradesList.add(scoreGradeMap);
							i++;
							if (i < numberOfStudents - 1) {
								continue;
							} else {
								break;
							}
						}
						grade++;
						grade = getGrade(grade);
					}
					if (numOfExtraGradesToBeAdded == true) {
						/*
						 * adding 1 additional number of gradeBucket for the Grade B,C,D,F because
						 * remainder equals 4 when Total number of students divided by 5
						 */
						gradeBucket++;
						numOfExtraGradesToBeAdded = false;
						continue;
					}
					numOfExtraGradesToBeAdded = false;
					grade = getGrade(grade);
				}
			}
		}
		return scoresWithGradesList;
	}

	public static List<Map<Integer, String>> scoreGrading(List<Integer> scores) {
		// your code here

		char grade = 'A';

		// sorting the list of integers in decreasing order

		Collections.sort(scores, Collections.reverseOrder());
		System.out.println(scores);
		int totalNumOfStudents = scores.size();

		// Condition1: If Total number of students less than 5

		if (totalNumOfStudents < 5) {
			return totalNumOfStudentsLessThanFive(totalNumOfStudents, grade, scores);

		} else {
			int gradeBucket = totalNumOfStudents / 5;

			/*
			 * Condition2: If Total number of students divisible by 5 and Total number of
			 * students greater than 4
			 */

			if (totalNumOfStudents % 5 == 0) {
				return totalNumOfStudentsDivisibleByFive(totalNumOfStudents, gradeBucket, grade, scores);
			}
			/*
			 * Condition3: If the remainder equals 1 when Total number of students divided
			 * by 5 and Total number of students greater than 4
			 */
			if ((totalNumOfStudents % 5) == 1) {
				return remainderOneWhenDividedByFive(totalNumOfStudents, gradeBucket, grade, scores);
			}
			/*
			 * Condition4: If the remainder equals 2 when Total number of students divided
			 * by 5 and Total number of students greater than 4
			 */
			if ((totalNumOfStudents % 5) == 2) {
				return remainderTwoWhenDividedByFive(totalNumOfStudents, gradeBucket, grade, scores);

			}
			/*
			 * Condition5: If the remainder equals 3 when Total number of students divided
			 * by 5 and Total number of students greater than 4
			 */
			if ((totalNumOfStudents % 5) == 3) {
				return remainderThreeWhenDividedByFive(totalNumOfStudents, gradeBucket, grade, scores);

			}
			/*
			 * Condition6: If the remainder equals 4 when Total number of students divided
			 * by 5 and Total number of students greater than 4
			 */

			else if ((totalNumOfStudents % 5) == 4) {

				return remainderFourWhenDividedByFive(totalNumOfStudents, gradeBucket, grade, scores);

			}
		}
		return scoresWithGradesList;
	}
}
