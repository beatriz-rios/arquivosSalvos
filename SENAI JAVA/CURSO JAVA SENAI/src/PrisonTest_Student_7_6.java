//Section 7, Lesson 6 Starter for Exercise 2 - Slide 16

public class PrisonTest_Student_7_6 {
    public static void main(String[] args){
        Cell_Student_7_6 cellA1 = new Cell_Student_7_6("A1", false, 1234);
        Cell_Student_7_6 cellB1 = new Cell_Student_7_6("B1", false, 1234);
        Cell_Student_7_6 cellC1 = new Cell_Student_7_6("C1", false, 1234);
        Cell_Student_7_6 cellD1 = new Cell_Student_7_6("D1", false, 1234);
        
        Prisoner_Student_7_6 bubba = new Prisoner_Student_7_6("Bubba", 2.08, 4, cellA1);
        Prisoner_Student_7_6 Ian = new Prisoner_Student_7_6("Ian", 1.85,20,cellD1);
        Prisoner_Student_7_6 Nahyron = new Prisoner_Student_7_6("Nahyron",1.60,40,cellD1);
        Prisoner_Student_7_6 JhonBlack = new Prisoner_Student_7_6("João Pedro",1.70,15,cellC1);

        bubba.display();
        Ian.display();
        Nahyron.display();
        JhonBlack.display();
        
    }
}
