public class Main {
    public static void main(String[] args) {
        task1() ;
        task2() ;
        task3() ;
        task4() ;
        task5() ;
        task6() ;
        task7() ;
        task8() ;
    }
    public static void task1() {
        System.out.println ("Задача 1") ;

        byte books = 25 ;
        System.out.println (books) ;
        short temperature = -32 ;
        System.out.println (temperature) ;
        int militaryStrength = 500000 ;
        System.out.println (militaryStrength) ;
        long populationWorld = 7000000000L ;
        System.out.println (populationWorld) ;
        float a = 548.6578f ;
        System.out.println (a) ;
        double b = -2548.8645689945 ;
        System.out.println (b) ;
    }
    public static void task2() {
        System.out.println ("Задача 2") ;

        float a = 27.12f ;
        System.out.println (a) ;
        long b = 987678965549L ;
        System.out.println (b) ;
        double c = 2.786 ;
        System.out.println (c) ;
        short d = 569 ;
        System.out.println (d) ;
        short e = -159 ;
        System.out.println (e) ;
        short f = 27897 ;
        System.out.println (f) ;
        long g = 67L;
        System.out.println (g) ;
    }
    public static void task3() {
        System.out.println ("Задача 3") ;

        byte classStudentsNumber1 = 23 ;
        System.out.println (classStudentsNumber1) ;
        short classStudentsNumber2 = 27 ;
        System.out.println (classStudentsNumber2) ;
        int classStudentsNumber3 = 30 ;
        System.out.println (classStudentsNumber3) ;
        int studentsTotalNumber = classStudentsNumber1 + classStudentsNumber2 + classStudentsNumber3 ;
        System.out.println (studentsTotalNumber) ;
        short paperTotalSheetsNumber = 480 ;
        System.out.println (paperTotalSheetsNumber) ;
        int studentPaperSheetsNumber = (paperTotalSheetsNumber / studentsTotalNumber) ;
        System.out.println ("На каждого ученика рассчитано " + studentPaperSheetsNumber + " листов бумаги") ;
    }
    public static void task4() {
        System.out.println ("Задача 4") ;

        byte machinePerformance = 16 / 2 ;
        System.out.println ("Производительность машины " + machinePerformance + " штук бутылок в минуту") ;
        short machinePerformance1 = (short)(machinePerformance * 20) ;
        System.out.println ("За 20 минут машина произвела " + machinePerformance1 + " штук бутылок") ;
        short machinePerformance2 = (short)(machinePerformance * 60 * 24) ;
        System.out.println ("За сутки машина произвела " + machinePerformance2 + " штук бутылок") ;
        int machinePerformance3 = (machinePerformance * 60 * 24 * 3) ;
        System.out.println ("За 3 дня машина произвела " + machinePerformance3 + " штук бутылок") ;
        int machinePerformance4 = (machinePerformance * 60 * 24 * 30) ;
        System.out.println ("За 1 месяц машина произвела " + machinePerformance4 + " штук бутылок") ;
    }
    public static void task5() {
        System.out.println ("Задача 5") ;

        short schoolCansNumber = 120 ;
        System.out.println (schoolCansNumber) ;
        byte classCansNumber = 6 ;
        System.out.println (classCansNumber) ;
        byte classCansWhitePaintNumber = 2 ;
        System.out.println (classCansWhitePaintNumber) ;
        byte classCansBrownPaintNumber = 4 ;
        System.out.println (classCansBrownPaintNumber) ;
        short classNumber = (short)(schoolCansNumber / classCansNumber) ;
        System.out.println (classNumber) ;
        short cansWhitePaintNumber = (short)(classNumber * classCansWhitePaintNumber) ;
        int cansBrownPaintNumber = (classNumber * classCansBrownPaintNumber) ;
        System.out.println ("В школе, где " + classNumber + " классов, нужно " + cansWhitePaintNumber + " банок белой краски и " + cansBrownPaintNumber + " банок коричневой краски") ;
    }
    public static void task6() {
        System.out.println ("Задача 6") ;

        byte bananasNumber = 5;
        System.out.println (bananasNumber);
        short bananaWeight = 80;
        System.out.println (bananaWeight);
        short bananasWeight = (short) (bananasNumber * bananaWeight);
        System.out.println (bananasWeight);

        short milkVolume = 200;
        System.out.println (milkVolume);
        int milk100Weight = 105;
        System.out.println (milk100Weight);
        float milk01Weight = (float) milk100Weight / 100;
        System.out.println (milk01Weight);
        float milkWeight = (float) milkVolume * milk01Weight;
        System.out.println (milkWeight);

        byte iceCreamBriquettesNumber = 2;
        System.out.println (iceCreamBriquettesNumber);
        short iceCreamBriquetteWeight = 100;
        System.out.println (iceCreamBriquetteWeight);
        short iceCreamBriquettesWeight = (short) (iceCreamBriquettesNumber * iceCreamBriquetteWeight);
        System.out.println (iceCreamBriquettesWeight);

        byte eggsNumber = 4;
        System.out.println (eggsNumber);
        short eggWeight = 70;
        System.out.println (eggWeight);
        short eggsWeight = (short) (eggsNumber * eggWeight);
        System.out.println (eggsWeight);

        float productsWeight01 = (float) bananasWeight + milkWeight + iceCreamBriquettesWeight + eggsWeight;
        System.out.println ("Вес такого спортзавтрака составляет " + productsWeight01 + " грамм");
        float productsWeight02 = (float) productsWeight01 / 1000;
        System.out.println ("Вес такого спортзавтрака составляет " + productsWeight02 + " кг");
    }

    public static void task7() {
        System.out.println ("Задача 7");

        float Weight = (float) 7.0;
        System.out.println (Weight);

        float dayWeight01 = (float) 0.25;
        System.out.println (dayWeight01);
        float dayNumber01 = Weight / dayWeight01;
        System.out.println (dayNumber01);

        float dayWeight02 = (float) 0.5;
        System.out.println (dayWeight02);
        float dayNumber02 = Weight / dayWeight02;
        System.out.println (dayNumber02);

        float dayNumber03 = (dayNumber01 + dayNumber02) / 2;
        System.out.println (dayNumber03);
    }
    public static void task8() {
        System.out.println ("Задача 8") ;

        float salaryMonthlyMasha01 = (float) 67760.0;
        System.out.println (salaryMonthlyMasha01);
        double salaryAnnualMasha01 = salaryMonthlyMasha01 * 12;
        System.out.println (salaryAnnualMasha01);
        double salaryMonthlyMasha02 = salaryMonthlyMasha01 * 1.1;
        double salaryAnnualMasha02 = salaryAnnualMasha01 * 0.1;
        System.out.println ("Маша теперь получает " + salaryMonthlyMasha02 + " рублей. Годовой доход вырос на " + salaryAnnualMasha02 + " рублей");

        float salaryMonthlyDenis01 = (float) 83690.0;
        System.out.println (salaryMonthlyDenis01);
        float salaryAnnualDenis01 = (float)(salaryMonthlyDenis01 * 12);
        System.out.println (salaryAnnualDenis01);
        float salaryMonthlyDenis02 = (float)(salaryMonthlyDenis01 * 1.1);
        float salaryAnnualDenis02 = (float)(salaryAnnualDenis01 * 0.1);
        System.out.println ("Денис теперь получает " + salaryMonthlyDenis02 + " рублей. Годовой доход вырос на " + salaryAnnualDenis02 + " рублей");

        float salaryMonthlyKristina01 = (float) 76230.0;
        System.out.println (salaryMonthlyKristina01);
        double salaryAnnualKristina01 = salaryMonthlyKristina01 * 12;
        System.out.println (salaryAnnualKristina01);
        double salaryMonthlyKristina02 = salaryMonthlyKristina01 * 1.1;
        double salaryAnnualKristina02 = salaryAnnualKristina01 * 0.1;
        System.out.println ("Кристина теперь получает " + salaryMonthlyKristina02 + " рублей. Годовой доход вырос на " + salaryAnnualKristina02 + " рублей");
    }

}