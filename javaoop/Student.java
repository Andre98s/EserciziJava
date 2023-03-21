package javaoop;

public class Student {
    private static String studentName;
    private static int studentAge;



    //creo il costruttore della classe Student
   //public Student(String theName, int theAge){

     // this.studentName = theName;
     // this.studentAge = theAge;
    //}

    //imposto i getter e i setter per gli attributi della classe
    // getter è una funzione publica che restituisce il valore di un attributo di classe privato
    // setter è una funzione publica che imposta il valore di un attributo di classe privato
    public String getName(){
        return studentName;
    }
    public void setName(String theName){
        studentName = theName;
    }
    public int getAge(){
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        Student.studentAge = studentAge;
    }
}
