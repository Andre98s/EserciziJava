package javaoop.incapsulamento;

import java.sql.SQLOutput;

public class Student {

    private String studentName;
    private String studentSurname;
    private int studentAge;
    private String studentAddress;
    private String studentCity;


    private int nGetName = 0;

    public Student(String name, String surname, int age, String address, String city){
        this.studentName = name;
        this.studentSurname = surname;
        this.studentAge = age;
        this.studentAddress = address;
        this.studentCity = city;
    }
    public Student(){

    }

    public  void checkNGetStudentName(){

        System.out.println("hai chiamato il metodo: " + nGetName+ " volte");
    }
    public String getStudentName() {
        nGetName++;
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentSurname(){
        return studentSurname;
    }
    public void setStudentSurname(String studentSurname){
        this.studentSurname = studentSurname;
    }
    public int getStudentAge(){
        return studentAge;
    }
    public void setStudentAge(int studentAge){
        if(studentAge<=0){
            System.out.println("Hai inserito un valore errato");
        }else{
            this.studentAge = studentAge;
            System.out.println("Valore giusto");
        }

    }
    public String getStudentAddress(){
        return studentAddress;
    }
    public void setStudentAddress(String studentAddress){
        this.studentAddress = studentAddress;
    }
    public  String getStudentCity(){
        return studentCity;
    }
    public void setStudentCity(String studentCity){
        this.studentCity = studentCity;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", studentAge=" + studentAge +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentCity='" + studentCity + '\'' +
                '}';
    }
}
