public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here

        int totalEggs = 0;
        int eggsPerChicken = 0;
        int chickenCount =0 ;


        //Primeiro Cenário
        eggsPerChicken = 5;
        chickenCount = 3;

        //SEGUNDA-FEIRA

        totalEggs = eggsPerChicken * chickenCount;


        //terça feira

        chickenCount++;
        totalEggs += eggsPerChicken * chickenCount;

        //quarta feira

        chickenCount = chickenCount / 2;
        totalEggs += eggsPerChicken * chickenCount;




        System.out.println(totalEggs);

        chickenCount = 0;


        //Primeiro Cenário
        eggsPerChicken = 4;
        chickenCount = 8;

        //SEGUNDA-FEIRA

        totalEggs = eggsPerChicken * chickenCount;


        //terça feira

        chickenCount++;
        totalEggs += eggsPerChicken * chickenCount;

        //quarta feira

        chickenCount = chickenCount / 2;
        totalEggs += eggsPerChicken * chickenCount;

        System.out.println(totalEggs);

    }   
}
