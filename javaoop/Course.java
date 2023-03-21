package javaoop;


import java.util.ArrayList;
import java.util.List;

public class Course {

    //private = modificatore d'accesso
    //static =
    private static String courseName; // questi sono gli attributi della classe
    private static int maxStudents;
    private static int qualityRatingOutOf10;
    private static String typeOfCourse1;
    private static String typeOfCourse2;


    List<Student> students = new ArrayList<Student>();


    //creo il costruttore della classe Course
    // public Course(String name, int maxStd, int qualityRate, String type1, String type2){

    // this.courseName = name;
    //  this.maxStudents = maxStd;
    //  this.qualityRatingOutOf10 = qualityRate;
    // this.typeOfCourse1 = type1;
    // this.typeOfCourse2 = type2;
    //}


    //imposto i getter e i setter per gli attributi della classe
    // getter è una funzione publica che restituisce il valore di un attributo di classe privato
    // setter è una funzione publica che imposta il valore di un attributo di classe privato
    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String name){
        courseName = name;
    }
    public int getMaxStudents(){
        return maxStudents;
    }
    public void setMaxStudents(int maxStd){
        maxStudents = maxStd;
    }
    public int getQualityRatingOutOf10(){
        return qualityRatingOutOf10;
    }
    public void setQualityRatingOutOf10(int qualityRate){
        qualityRatingOutOf10 = qualityRate;
    }
    public String getTypeOfCourse1(){
        return typeOfCourse1;
    }
    public void setTypeOfCourse1(String type1){
        typeOfCourse1 = type1;
    }
    public String getTypeOfCourse2(){
        return typeOfCourse2;
    }
    public void setTypeOfCourse2(String type2){
        typeOfCourse2 = type2;
    }
}
