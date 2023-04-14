package labwork;

//Define the Person interface
interface Person {
 void speak(); // Declare the speak method
}

//Define the Student class that implements the Person interface
class Studennt implements Person {
 @Override
 public void speak() {
     System.out.println("I am a student.");
 }
}

//Define the Teacher class that implements the Person interface
class Teacher implements Person {
 @Override
 public void speak() {
     System.out.println("I am a teacher.");
 }
}

//Main class
public class  PersonEg {

 public static void main(String[] args) {
     Person student = new Studennt(); // Create an object of Student class
     Person teacher = new Teacher(); // Create an object of Teacher class
     
     student.speak(); // Call speak method of Student class
     teacher.speak(); // Call speak method of Teacher class
 }
}

