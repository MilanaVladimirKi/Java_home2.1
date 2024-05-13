package Main;

public class Main {
    public static void main(String[] args){

        int price = 13676;

        int mills = 20;

        int bonus = 0;

        if (price >= mills) {
            bonus = price / mills;
        }

        System.out.println("bonus");

        System.out.println(bonus);

    }

}
