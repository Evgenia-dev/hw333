public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
    // task 1
        System.out.println("task 1");
    int y = 4;
    byte q = 5;
    short s = 6;
    long m = 7L;
    float f = 8.9f;
    double d = 9.1;

    // task 2
        System.out.println("task 2")
    double value1 = 27.12;
    long value2 = 987678965549L;
    double value3 = 2.786;
    int value4 = 569;
    int value5 = -159;
    int value6 = 27897;
    int value7 = 67;

    // task 3
        System.out.println("task 3");
    int studentsLyudmila = 23;
    int studentsAnna = 27;
    int studentsEkaterina = 30;
    int totalPaperSheets = 480;
    int totalStudents = studentsLyudmila + studentsAnna + studentsEkaterina;
    double sheetsPerStudent = (double) totalPaperSheets / totalStudents;
        System.out.printf("На каждого ученика рассчитано %.2f листов бумаги%n",sheetsPerStudent);

    // task 4
        System.out.println("task 4");
    int bottlesPerTwoMinutes = 16;
    int minutesInHour = 60;
    int hoursInDay = 24;
    int daysInMonth = 30;
    double bottlesPerMinute = (double) bottlesPerTwoMinutes / 2;
    int production20Minutes = (int) (bottlesPerMinute * 20);
        System.out.printf("За 20 минут машина произвела %d штук бутылок%n",production20Minutes);
    int productionPerDay = (int) (bottlesPerMinute * minutesInHour * hoursInDay);
        System.out.printf("За сутки машина произвела %d штук бутылок%n",productionPerDay);
    int productionForThreeDays = productionPerDay * 3;
        System.out.printf("За 3 дня машина произвела %d штук бутылок%n",productionForThreeDays);
    int productionForOneMonth = productionPerDay * daysInMonth;
        System.out.printf("За 1 месяц машина произвела %d штук бутылок%n",productionForOneMonth);

    // task 5
        System.out.println("task 4")
    int totalCans = 120;
    int classes = totalCans / 6;
    int whiteCans = 2 * classes;
    int brownCans = 4 * classes;
        System.out.printf("В школе, где %d классов, нужно %d банок белой краски и %d банок коричневой краски.%n",classes,whiteCans,brownCans);

    // task 6
        System.out.println("task 6")
    int bananasCount = 5;
    int bananaWeight = 80;
    int milkVolume = 200;
    int milkWeightPer100ml = 105;
    int milkWeight = (milkVolume / 100) * milkWeightPer100ml;
    int iceCreamWeightPerBrick = 100;
    int iceCreamWeight = iceCreamCount * iceCreamWeightPerBrick;
    int eggsCount = 4;
    int eggWeight = 70;
    int eggsWeight = eggsCount * eggWeight;
    int totalWeightInGrams = (bananasCount * bananaWeight) + milkWeight + iceCreamWeight + eggsWeight;
    double totalWeightInKilograms = totalWeightInGrams / 1000.0;
        System.out.printf("Общий вес спортзавтрака: %d граммов\n",totalWeightInGrams);
        System.out.printf("Общий вес спортзавтрака: %.2f килограммов\n",totalWeightInKilograms);

    // task 7
        System.out.println("task 7")
    int weightToLose = 7000;
    int lossPerDayLow = 250;
    int lossPerDayHigh = 500;
    int daysLow = weightToLose / lossPerDayLow;
    int daysHigh = weightToLose / lossPerDayHigh;
    double averageDays = (daysLow + daysHigh) / 2.0;
        System.out.printf("Количество дней для похудения при потере 250 грамм в день: %d дней\n",daysLow);
        System.out.printf("Количество дней для похудения при потере 500 грамм в день: %d дней\n",daysHigh);
        System.out.printf("Среднее количество дней для достижения результата: %.2f дней\n",averageDays);

    // task 8
        System.out.println("task 8")
    String[] names = {"Маша", "Денис", "Кристина"};
    double[] currentSalaries = {67760, 83690, 76230};
    double increasePercentage = 0.10;
    for(
    int i = 0;
    i<names.length;i++)
    String name = names[i];
    double currentSalary = currentSalaries[i];
    double newSalary = currentSalary * (1 + increasePercentage);
    double currentAnnualIncome = currentSalary * 12;
    double newAnnualIncome = newSalary * 12;
    double incomeDifference = newAnnualIncome - currentAnnualIncome;
        System.out.printf("%s теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей.%n",name,newSalary,incomeDifference);
}
