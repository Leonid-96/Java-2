import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int amount = 21_500;
        int part = 20;
        int miles = 1;

        int bonus = amount / part * miles;
        System.out.println("Количество начисленных миль за купленный билет:" + bonus);
    }
}
