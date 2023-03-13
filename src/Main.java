public class Main {
    public static void main(String[] args) {
       int startSum = 100;
       int deposit = 1000;
       int bonus;
       int finalSum;

       if (deposit >= 1000) {
           finalSum = deposit / 100 + deposit + startSum; bonus = deposit / 100;
       } else {
           finalSum = deposit + startSum; bonus = 0;
       }
        System.out.println("Итоговый счет " + finalSum);
        System.out.println("Бонусный счет " + bonus);
    }
}