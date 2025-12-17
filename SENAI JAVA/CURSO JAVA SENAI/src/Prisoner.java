 public class Prisoner {
    //Campos
    String name;
    double altura;
    int sentenca;



    //Metodo
    public void pensar(){ System.out.println("Eu ainda terei a minha vingança!!! HA HA HA...");}
    //Construtor
    public Prisoner(String name, double altura, int sentenca) {
        this.name = name;
        this.altura = altura;
        this.sentenca = sentenca;
    }
        public void  display(){
            System.out.println("Nome: " + name);
            System.out.println("Altura: " + altura);
            System.out.println("Sentença: " + sentenca);
        }
     public void  display(boolean b) {
         System.out.println("Nome: " + name);
         System.out.println("Altura: " + altura);
         System.out.println("Sentença: " + sentenca);
         if (b == true){
             pensar();
         }
     }
}


