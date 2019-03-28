import java.util.Scanner;

public class Course {


    private String courseName;
    private String[] students= new String [100];
    private int numbersOfStudents;

    Course( String courseName ){
        this.courseName=courseName;
    }

        public void addStudents(String student){
            students[numbersOfStudents]=student;
        numbersOfStudents++;
        }

        public String[] getStudents(){

            return students;
        }
        public int getNumberOfStudents(){

            return numbersOfStudents;
        }
        public void removeStudents(String e){

           int n;
           for(n=0;n<students.length;n++){
               if(e.equalsIgnoreCase (students[n])){
                students[n]=null;
                numbersOfStudents = numbersOfStudents-1;
                System.out.println("Dato eliminado");
               }else{
               }
            }
        }
    }

        
