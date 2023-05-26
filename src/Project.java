
import java.util.Scanner;
public class Project {
    public static void main(String[] args) {
        System.out.println("Welcome to Physics Quiz");
        System.out.println("all subscripts are to be written after each number!");
        questions q1 = new questions("Question 1: When 2 waves with a 0 degrees difference pass through each other they cause?", "Constructive Interference");
        questions q2 = new questions("Question 2: What type of wave is sound?", "Transversal and Mechanical");
        questions q3 = new questions("Question 3: What is the formula to find the gravitational force one object exerts on another?", "(Gq1q2)/(r)^2");
        questions q4 = new questions("Question 4: What is the KE of a closed system if PE is 120 Joules? ", "120 Joules");
        questions q5 = new questions("Question 5: What causes loss of energy while creating heat in a system?", "Friction");
        questions q6 = new questions("Question 6: What are positively charged objects attracted to?", "Electrons");
        questions q7 = new questions("Question 7: If a circuit had a Voltage of 40 V and 2 Resistors of 5 and 2.5 ohms (series), what is the current?", "5.33 A");
        questions q8 = new questions("Question 8: What is the value of an elementary charge in terms of coulombs (in terms of E)?", "1.6E^-19");
        questions q9 = new questions("Question 9: What does K stand for in terms of springs?", "Spring Constant");
        questions q10 = new questions("Question 10: What equation is used to find refracted angle?", "n1*sin(θ1) = n2*sin(θ2)");


        System.out.println(q1.state());
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        int i = 0;
        while (i == 0) {
            if (q1.ask(answer)) {
                i++;
            }
            else {
                System.out.println("Try again");
                answer = scan.nextLine();
            }
        }
        System.out.println(q2.state());
        answer = scan.nextLine();
        while (i == 1) {
            if (q2.ask(answer)) {
                i++;
            }
            else {
                System.out.println("Try again");
                answer = scan.nextLine();
            }
        }
        System.out.println(q3.state());
        answer = scan.nextLine();
        while (i == 2) {
            if (q3.ask(answer)) {
                i++;
            }
            else {
                System.out.println("Try again");
                answer = scan.nextLine();
            }
        }
        System.out.println(q4.state());
        answer = scan.nextLine();
        while (i == 3) {
            if (q4.ask(answer)) {
                i++;
            }
            else {
                System.out.println("Try again");
                answer = scan.nextLine();
            }
        }
        System.out.println(q5.state());
        answer = scan.nextLine();
        while (i == 4) {
            if (q5.ask(answer)) {
                i++;
            }
            else {
                System.out.println("Try again");
                answer = scan.nextLine();
            }
        }
        System.out.println(q6.state());
        answer = scan.nextLine();
        while (i == 5) {
            if (q6.ask(answer)) {
                i++;
            }
            else {
                System.out.println("Try again");
                answer = scan.nextLine();
            }
        }
        System.out.println(q7.state());
        answer = scan.nextLine();
        while (i == 6) {
            if (q7.ask(answer)) {
                i++;
            }
            else {
                System.out.println("Try again");
                answer = scan.nextLine();
            }
        }
        System.out.println(q8.state());
        answer = scan.nextLine();
        while (i == 7) {
            if (q8.ask(answer)) {
                i++;
            }
            else {
                System.out.println("Try again");
                answer = scan.nextLine();
            }
        }
        System.out.println(q9.state());
        answer = scan.nextLine();
        while (i == 8) {
            if (q9.ask(answer)) {
                i++;
            }
            else {
                System.out.println("Try again");
                answer = scan.nextLine();
            }
        }
        System.out.println(q10.state());
        answer = scan.nextLine();
        while (i == 9) {
            if (q10.ask(answer)){
                i++;
            }
            else {
                System.out.println("Try again");
                answer = scan.nextLine();
            }
        }
        System.out.println("Congrats on being done wooo!");
    }
}
