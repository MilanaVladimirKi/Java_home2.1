package Main;

public class Main {
    public static void main(String[] args){

        int price = 13676;
        int bonus;

        if (price >= 20) {
            bonus = price / 20;
        } else {
            bonus = 0;
        }
        System.out.println("колличество бонусных миль " + bonus);

    }

}
