# GradeAlgorithm
A teacher gives a class of students an exam.  She decides to grade the exam using the following method:

* A score in the top 20% of all scores is an A.
* A score in the next 20% of scores is a B.
* A score in the next 20% of scores is a C.
* A score in the next 20% of scores is a D.
* A score in the bottom 20% of scores is an F.

For example, if a class of 20 students has the following scores:

99, 92, 91, 91, 89, 85, 83, 82, 80, 79, 78, 78, 77, 76, 75, 74, 62, 55, 43, 20

As there are 20 grades in this example, each 20% grade bucket will contain 4 scores.
The first four scores (99, 92, 91, 91) would be an A, scores 5 through 8 (89,85, 83, 82) would be a B,
scores 9 through 12 (80, 79, 78, 78) would be a C,scores 13 through 16 would be a D (77, 76, 75, 74) and 
scores 17 through 20 (62, 55, 43, 20) would be an F.
