
package methods;

import java.util.ArrayList;

    public class Methods {


        public static class Course {
            private String name;
            private String code;
            private int unit;
            private int score;

            public Course(String name, String code, int unit, int score) {
                this.name = name;
                this.code = code;
                this.unit = unit;
                this.score = score;
            }

            public int getUnit() {
                return unit;
            }

            public int calculateQualityPoints() {
                int qualityPoint;

                if (score >= 70 && score <= 100) {
                    qualityPoint = 5;
                } else if (score >= 60 && score < 70) {
                    qualityPoint = 4;
                } else if (score >= 50 && score < 60) {
                    qualityPoint = 3;
                } else if (score >= 45 && score < 50) {
                    qualityPoint = 2;
                } else if (score >= 40 && score < 45) {
                    qualityPoint = 1;
                } else {
                    qualityPoint = 0;
                }

                return unit * qualityPoint;
            }

            public void displayCourse() {
                System.out.printf("| %-25s | %-13d | %-6s | %-11d |\n", name + " (" + code + ")", unit, getGrade(), calculateQualityPoints());
            }

            private String getGrade() {
                if (score >= 70 && score <= 100) {
                    return "A";
                } else if (score >= 60 && score < 70) {
                    return "B";
                } else if (score >= 50 && score < 60) {
                    return "C";
                } else if (score >= 45 && score < 50) {
                    return "D";
                } else if (score >= 40 && score < 45) {
                    return "E";
                } else {
                    return "F";
                }
            }
        }

        public static class GPAcalculator {
            private ArrayList<Course> courses = new ArrayList<>();

            public void addCourse(Course course) {
                courses.add(course);
            }

            public double calculateGPA() {
                int totalQualityPoints = 0;
                int totalGradeUnits = 0;

                for (Course course : courses) {
                    totalQualityPoints += course.calculateQualityPoints();
                    totalGradeUnits += course.getUnit();
                }

                return (double) totalQualityPoints / totalGradeUnits;
            }

            public void displayFinalResult() {
                System.out.println("|----------------------------|-----------------------|------------|---------------------|");
                System.out.println("| COURSE & CODE              | COURSE UNIT           | GRADE      | GRADE-UNIT          |");
                System.out.println("|----------------------------|-----------------------|------------|---------------------|");

                for (Course course : courses) {
                    course.displayCourse();
                }

                System.out.println("|---------------------------------------------------------------------------------------|");
                System.out.printf("\nYour GPA is = %.2f to 2 decimal places.\n", calculateGPA());
            }
        }


    }

