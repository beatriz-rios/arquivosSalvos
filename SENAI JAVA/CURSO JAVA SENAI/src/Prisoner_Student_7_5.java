//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class Prisoner_Student_7_5 {
    //Fields 
    private String name;
    private double height;
    private int sentence;
    private cell_7_5 cela;

    //Constructor
    public Prisoner_Student_7_5(String name, double height, int sentence, cell_7_5 cela) {
        this.name = name;
        this.height = height;
        this.sentence = sentence;
        this.cela = cela;
    }

    //Methods
    public void think() {
        System.out.println("I'll have my revenge.");
    }

    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Height: " + getHeight());
        System.out.println("Sentence: " + getSentence());
        System.out.println("Cela: " + getCela().getName());
    }

    /*
    public void portaAberta(){
        if(cela.getisOpen() == true){
            cela.setisOpen(1234, false);
            System.out.println("Cela: " + cela.getName() + "Fechada");
        }else{
            cela.setisOpen(1234, true);
            System.out.println("Cela: " + cela.getName() + "Aberta");
        }
    }*/
    //Getters
    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public int getSentence() {
        return sentence;
    }
    public cell_7_5 getCela() {
        return cela;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setSentence(int sentence){
        this.sentence = sentence;
    }
    public void setCela(cell_7_5 cela){
        this.cela = cela;
    }
}
    





















