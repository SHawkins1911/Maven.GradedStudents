package io.zipcoder;


import java.util.ArrayList;

public class Student {
 private String firstName;
 private String lastName;
 private ArrayList<Double> examScores = new ArrayList<>();
 private Integer numberOfExamsTaken = 0;

    public Student(String firstName, String lastName, ArrayList<Double> examScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setExamScores(ArrayList<Double> examScores) {
        this.examScores = examScores;
    }

    public void setExamScore(int examNumber, Double newExamScore ){
        examScores.add(examNumber, newExamScore);

    }

    public Integer getNumberOfExamsTaken(){
        return numberOfExamsTaken;
    }

    public void getExamScores(){
        System.out.println(examScores.toString());
    }

    public void addExamScore(Double examScore){
        examScores.add(examScore);
    }

    public Double getAveragExamScore(){
        Double result;
        Double examTotals = 0.0;
        for (Double examScore : examScores) {
            examTotals += examScore;
        }
        result = examTotals/examScores.size();
        return result;
    }
}
