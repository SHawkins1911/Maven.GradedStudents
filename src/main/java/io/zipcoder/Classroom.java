package io.zipcoder;

public class Classroom {
  private Student [] students;
  private int maxNumberOfStudents;
  private Student [] preEnrollment;
  private Student [] postEnrollment;

    public void setPreEnrollment(Student[] preEnrollment) {
        this.preEnrollment = students;
    }

    public void setPostEnrollment(Student[] postEnrollment) {
        this.postEnrollment = new Student[preEnrollment.length+1];
    }

    public Classroom(int maxNumberOfStudents){
        this.maxNumberOfStudents = maxNumberOfStudents;
    }
    public Classroom(Student[] students){
        this.students = students;
    }
    public Classroom(){
        this.students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }

    public Student [] addStudent(Student student){
        postEnrollment[postEnrollment.length-1] = student;
       return postEnrollment;
    }
    public Double getClassAverageExamScore(){
        Double result;
        Double examTotals = 0.0;
        for (Student student : students) {

            examTotals += student.getAveragExamScore();
        }
        result = examTotals/students.length;
        System.out.println(result);
        return result;
    }
    }

