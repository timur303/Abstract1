package HomeWorking;

public class Main {
    public static void main(String[] args) {

        Cow cow1 = new Cow("Marusia", 4, 500.0, "Cow");
        Cow cow2 = new Cow("Muffin", 5, 700.0, "Bull");
        Cow cow3 = new Cow("Kok ui", 7, 900.0, "Cow");
        Cow cow4 = new Cow("Kara", 4, 1000.0, "Bull");
        Cow cow5 = new Cow("Sary ", 4, 500.0, "Bull");
        Cow cow6 = new Cow("Kunajyn",2,200,"Cow");

        Cow[] cows1 = {cow1, cow2, cow3, cow4, cow5};
        Cow [] cows2 ={cow6};

        Horse horse1 = new Horse("Jerde at", 5, 300, "Stallion");
        Horse horse2 = new Horse("Toru", 4, 400, "Mare");
        Horse horse3 = new Horse("Kara", 6, 600, "Stallion");
        
        Horse[] hors1 = {horse1, horse2};
        Horse [] hors2 ={horse3};   

        Sheep sheep1 = new Sheep("Ak koi", 4, 30.2, "Ewe");
        Sheep sheep2 = new Sheep("Sary ", 3, 50.2, "Ram");
        Sheep sheep3 = new Sheep("Kok koi", 4, 30.2, "Ewe");
        Sheep sheep4 = new Sheep("Kyzyl koi",3,50,"Ewe");
        
        Sheep[] sheeps1 = {sheep1, sheep2, sheep3};
        Sheep [] sheeps2 = {sheep4};


        Farm farm1 = new Farm("Ош", cows1, hors1, sheeps1, "Тимур");
        Farm farm2 = new Farm("Москва",cows2,hors2,sheeps2,"Эшмат");

        System.out.println(farm1);
        System.out.println(farm2);


    }
}
