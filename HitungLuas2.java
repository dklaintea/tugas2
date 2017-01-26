/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibnumasud
 */
import java.util.Scanner;
public class HitungLuas2 {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Panjang :");
	   double panjang = scanner.nextDouble();
	   System.out.println("Masukkan Lebar :");
	   double lebar = scanner.nextDouble();
	   //Luas persegi panjang = panjang*lebar;
	   double area = panjang*lebar;
	   System.out.println("Luas dari persegi panjang adalah :"+area);
    }
}
