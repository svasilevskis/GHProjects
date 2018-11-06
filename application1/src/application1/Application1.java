package application1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Application1 {

    public static void main(String[] args) {
        colors();
    }

    public static void pievienosana() {
        ArrayList<Integer> skaitlusaraksts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        double sum = 0;
        double videlements = 0;

        for (i = 0; i <= 4; i++) {
            System.out.println("Ievadiet piecus skaitlus");
            int skaitlis = sc.nextInt();
            skaitlusaraksts.add(skaitlis);
        }
        for (Integer elements : skaitlusaraksts) {
            System.out.println(elements);
            sum += elements;
            videlements = sum / skaitlusaraksts.size();
        }

        System.out.println(sum + " " + videlements);

    }

    public static ArrayList<Integer> colors() {
        ArrayList<String> saraksts = new ArrayList<>();
        ArrayList<Integer> sar = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet krasu");
        while (true) {
            String list = sc.nextLine();
            saraksts.add(list);

            if (sc.nextLine().equals("n")) {
                
                System.out.println("Kuru krasu velaties atrast?");
                String atr = sc.nextLine();

                for (int i = 0; i <= saraksts.size(); i++) {
                    if (saraksts.contains(atr)) {
                        int indexOf = atr.indexOf(atr);
                        //return sar;
                        System.out.println(indexOf);
                    }
                }
            }
        }
    }
}
