
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class GantiKata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Print program header
        System.out.println("====Program Mengganti Kata====\n");
        
        // Get the initial sentence
        System.out.print("Masukkan Kalimat : ");
        String kalimatAwal = input.nextLine();
        
        // Get the word to replace
        System.out.print("Ganti Kata : ");
        String kataLama = input.nextLine();
        
        // Get the replacement word
        System.out.print("Menjadi Kata : ");
        String kataBaru = input.nextLine();
        
        // Replace all occurrences and create the new sentence
        String kalimatBaru = kalimatAwal.replaceAll(kataLama, kataBaru);
        
        // Print the results
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat awal : " + kalimatAwal);
        System.out.println("Kalimat baru : " + kalimatBaru);
        
        // Close scanner
        input.close();
    }
}
