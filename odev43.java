
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
public class odev43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // KELİMEYİ ORTADAN BÖLEREK HER BİR PARÇASINI TERSTEN YAZDIRMA
        Scanner input=new Scanner(System.in);
        System.out.println("kelime giriniz.");
        String txt=input.nextLine();
        for (int i =txt.length()/2-1; i>=0; i--) {
            System.out.print(txt.charAt(i));
            
            
        }
        for (int i =txt.length(); i >=txt.length()/2; i--) {
            System.out.print(txt.charAt(i));
            
        }
        
    }
    
}
