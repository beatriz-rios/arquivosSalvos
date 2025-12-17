//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class PrisonTest_Student_7_5 {
    public static void main(String[] args){
        cell_7_5 celaA1 = new cell_7_5("A1", false,1234);

        Prisoner_Student_7_5 bubba = new Prisoner_Student_7_5("Bubba", 2.08, 4, celaA1);
     bubba.display();
    celaA1.setisOpen(1111, false);
    celaA1.setisOpen(1234, true);
    celaA1.setisOpen(1234, false);

    }
}
