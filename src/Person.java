import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends Person {
    private int[] testScores;

    Student(String firstName, String lastName,int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;

    }

    public String calculate() {
        int sum = 0;
        for (int i = 0; i<this.testScores.length; i++) {
            sum += this.testScores[i];
        }
        int average = Math.round((float) sum / this.testScores.length);
        return gradeAverage(average);
    }

    public String gradeAverage(int n) {
        if (n >= 90 && n <= 100) {
            return "O";
        }
        else if (n >= 80 && n <90) {
            return "E";
        }
        else if (n >= 70 && n <80) {
            return "A";
        }
        else if (n >= 55 && n <70) {
            return "P";
        }
        else if (n >= 40 && n <55) {
            return "D";
        }
        else return "T";
    }
}

class RunThis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}