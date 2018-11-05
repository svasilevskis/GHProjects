package sarakstapiemers;

import java.util.ArrayList;
import java.util.Scanner;

public class SarakstaPiemers {

    public static void main(String[] args) {

        apvienosana();
//        ArrayList<String> saraksts = new ArrayList<>();
//        saraksts.add("elements1");
//        saraksts.add("elements2");
//
//        int garums = saraksts.size();
//
//        System.out.println(garums);
//
//        for (int i = 0; i < garums; i++) {
//            System.out.println(saraksts.get(i));
//        }
//        
//        for(String elements : saraksts){
//            System.out.println(elements);
//        }
//
////        String apvienotais = saraksts.toString();
////        System.out.println(apvienotais);

    }

    public static void uzdevums() {
        //uztaisit sarakstu ar int tipa skaitliem,laut cilvekam ievadit sk., tik ilgi kamer, vins grib
        //katras ievades beigas izvaditos pilns saraksts ( ar ciklu)
        //kartas skaitlis plus elements
        //Parbaudam vai cilveks nav ievadijis simbolus, ja ir,tad paradit kludu, sarakstam neko nepievienot
        //boolean izvele;
        ArrayList<Integer> skaitlusaraksts = new ArrayList<>();

        while (true) {
            Scanner sc = new Scanner(System.in);

            try {
                System.out.println("Ievadiet skaitli!");

                int skaitlis = sc.nextInt();
                skaitlusaraksts.add(skaitlis);
            } catch (Exception ex) {
                System.out.println("ERROR");
            }

            for (int i = 0; i < skaitlusaraksts.size(); i++) {
                System.out.println(i + ".elements " + skaitlusaraksts.get(i));
            }

            System.out.println("Vai turpinat?");
            if (sc.nextLine().equals("n")) {
                break;
            }
        }
    }

    public static void Dzesana() {
        ArrayList<Integer> skaitluSaraksts = new ArrayList<>();
        skaitluSaraksts.add(1);
        skaitluSaraksts.add(3);
        skaitluSaraksts.add(4);
        skaitluSaraksts.add(5);
        skaitluSaraksts.add(6);
        skaitluSaraksts.add(7);

        System.out.println("Kuru elementu velaties dzest?");
        for (Integer elements : skaitluSaraksts) {
            System.out.println(elements);
        }
        while (true) {
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();

            try {
                if (skaitluSaraksts.size() > 0) {

                    skaitluSaraksts.remove(i);

                    String apvienotais = skaitluSaraksts.toString();
                    System.out.println(apvienotais);
                } else {
                    System.out.println("Tukss");
                    break;
                }
            } catch (Exception ex) {
                if (i > skaitluSaraksts.size()) {
                    System.out.println("ERROR");
                }
            }
        }
    }

    public static void apvienosana() {

        ArrayList<Integer> skaitlusaraksts = new ArrayList<>();

        System.out.println("Pievienot + | Atnemt - ");
        Scanner sc = new Scanner(System.in);
        String izvele = sc.nextLine();
        switch (izvele) {
            case "+":
                while (true) {
                    try {
                        System.out.println("Ievadiet skaitli! Spiediet n kad velaties iziet");

                        int skaitlis = sc.nextInt();
                        skaitlusaraksts.add(skaitlis);
                    } catch (Exception ex) {
                        if (sc.nextLine().equals("n")) {
                            break;
                        }
                    }
                }

            case "-":
                System.out.println("Kuru elementu velaties dzest?");
                System.out.println(skaitlusaraksts.toString());
                while (true) {
                    int i = sc.nextInt();

                    try {
                        if (skaitlusaraksts.size() > 0) {

                            skaitlusaraksts.remove(i);

                            String apvienotais = skaitlusaraksts.toString();
                            System.out.println(apvienotais);
                        } else {
                            System.out.println("Tukss");
                            break;
                        }
                    } catch (Exception ex) {
                        if (i > skaitlusaraksts.size()) {
                            System.out.println("ERROR");

                        }
                    }
                }
            default:
                System.out.println(skaitlusaraksts.toString());
                break;
        }

    }
}
