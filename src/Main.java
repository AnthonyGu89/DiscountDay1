import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String [][] Tovar = {{"Апельсин","20"},{"Бананы","30"},{"Киви","50"}};
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели?");
        String on = in.nextLine();
        String chek = "Понедельник";
        String chek2 = "Среда";
        System.out.println(on);
        System.out.println(chek.equals(on));
        if(chek.equals(on)) {
            for (int i = 0; i < Tovar.length; i++) {
                System.out.println(Tovar[i][1]);
                int number = Integer.parseInt(Tovar[i][1]);
                System.out.println(number*0.15);
                double skidka = number-number*0.15;
                System.out.println(skidka);
                String skidka2 = String.valueOf(skidka);
                Tovar[i][1] = skidka2;
                System.out.println(Tovar[i][0]+" "+Tovar[i][1]);
            }
            } else {
            if(chek2.equals(on)){
                for (int i = 0; i < Tovar.length; i++) {
                    System.out.println(Tovar[i][1]);
                    int number = Integer.parseInt(Tovar[i][1]);
                    System.out.println(number*0.25);
                    double skidka = number-number*0.25;
                    System.out.println(skidka);
                    String skidka2 = String.valueOf(skidka);
                    Tovar[i][1] = skidka2;
                    System.out.println(Tovar[i][0]+" "+Tovar[i][1]);
            }
        } else {
                for(int i=0;i<Tovar.length;i++)
                    System.out.println(Tovar[i][0]+" "+Tovar[i][1]);
            }
            }
        int j = 7;
        do{
            System.out.println(j);
            j--;
        }
        while (j > 0);
        int q = 6;
        while(q<15){
            System.out.println(q);
            q++;
        }
        }
    }
