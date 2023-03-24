package javaoop.incapsulamento;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        Student student = new Student("Andrea" , "Spinola",24,"XXIV maggio","Alezio");
        System.out.println( "Name: " + student.getStudentName() + " Surname: " + student.getStudentSurname()+
                            " Age: "+ student.getStudentAge()+ " Address: "+ student.getStudentAddress()+
                            " City: "+ student.getStudentCity());

        // Write and use your 5 getters and setters!
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        Student student = new Student("Andrea", "Spinola", 24,"XXIV MAggio","Alezio");
        System.out.println(student);

        Student student1 = new Student("Andrea", "Spinola", -1,"XXIV MAggio","Alezio");
        System.out.println(student1);

        Student student2 = new Student();
        student2.setStudentName("Andrea");
        student2.setStudentAge(-1);
        System.out.println(student2);

        student.getStudentName();
        student1.getStudentName();
        student2.getStudentName();
        student.getStudentName();

        student1.checkNGetStudentName();
        student2.checkNGetStudentName();
        student.checkNGetStudentName();

        //Write your code here
    }

}
