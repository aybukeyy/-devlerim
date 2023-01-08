
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author asus
 */
public class taskagitmakas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rastgele = new Random();
        String[] secenek = {"tas", "kagit", "makas"};
        System.out.println("taş kağıt makastan hangisi?");
        String kullanici = input.nextLine();
        int pc = rastgele.nextInt(secenek.length);
        System.out.println(secenek[pc]);
        int sayacpc=0;
        int sayackul=0;

        for (int i = 0; i <3; i++) {
            
        if (secenek[pc].equals(kullanici)) {
            System.out.println("berabere kaldınız.");

        } else if (secenek[pc].equals("tas") && kullanici.equals("makas")) {
            System.out.println("bilgisayar kazandı");
            sayacpc++;

        } else if (secenek[pc].equals("tas") && kullanici.equals("kagit")) {
            System.out.println("sen kazandın.");
            sayackul++;

        } else if (secenek[pc].equals("kagit") && kullanici.equals("makas")) {
            System.out.println("sen kazandın.");
            sayackul++;

        } else if (secenek[pc].equals("kagit") && kullanici.equals("tas")) {
            System.out.println("bilgisayar kazandı.");
            sayacpc++;

        } else if (secenek[pc].equals("makas") && kullanici.equals("tas")) {
            System.out.println("sen kazandın.");
            sayackul++;

        } else if (secenek[pc].equals("makas") && kullanici.equals("kagit")) {
            System.out.println("bilgisayar kazandı.");
            sayacpc++;

        }

    }
        System.out.println(sayacpc);
        System.out.println(sayackul);
}}
