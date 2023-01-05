import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String [][] Tovar = {{"Апельсин","20"},{"Бананы","30"},{"Киви","50"}};
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели?");
        String on = in.nextLine();
        String chek = "Понедельник";
        String chek2 = "Среда";
        if(chek.equals(on)) {
            for (int i = 0; i < Tovar.length; i++) {
                int number = Integer.parseInt(Tovar[i][1]);
                double skidka = number-number*0.15;
                String skidka2 = String.valueOf(skidka);
                Tovar[i][1] = skidka2;
                System.out.println(Tovar[i][0]+" "+Tovar[i][1]);
            }
            } else {
            if(chek2.equals(on)){
                for (int i = 0; i < Tovar.length; i++) {
                    int number = Integer.parseInt(Tovar[i][1]);
                    double skidka = number-number*0.25;
                    String skidka2 = String.valueOf(skidka);
                    Tovar[i][1] = skidka2;
                    System.out.println(Tovar[i][0]+" "+Tovar[i][1]);
            }
        } else {
                for(int i=0;i<Tovar.length;i++)
                    System.out.println(Tovar[i][0]+" "+Tovar[i][1]);
            }
            }
        }
    }
