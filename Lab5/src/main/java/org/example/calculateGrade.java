package org.example;

public class calculateGrade {
    String grade(float marks){
        if(marks>=80){
            return "A+";
        }
        else if(marks>=75 && marks<80){
            return "A";
        }
        else if(marks>=70 && marks<75){
            return "A-";
        }
        else if(marks>=60 && marks<70){
            return "B+";
        }
        else if(marks>=50 && marks<60){
            return "B";
        }
        else if(marks>=40 && marks<50){
            return "B-";
        }
        else
            return "F";
    }
}
