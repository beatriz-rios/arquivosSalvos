public class cell_7_5 {
    private String name;
    private boolean isOpen;
    private int seguranca;

    public cell_7_5 (String name, boolean isOpen, int seguranca){
        this.name = name;
        this.isOpen = isOpen;
        this.seguranca = seguranca;
    }

    public  String getName(){
        return name;
    }

    public boolean getisOpen(){
        return isOpen;
    }

    public void setisOpen(int code, boolean isOpen){
        if(code != seguranca){
            System.out.println("Código incorreto");
        }else{
            if (isOpen == true){
                isOpen = false;
                System.out.println("Cela: " + name + " Fechada");
            }else{
                isOpen = true;
                System.out.println("Cela: " + name + " Aberta");
            }
        }
    }
}
