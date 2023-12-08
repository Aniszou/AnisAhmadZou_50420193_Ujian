package absensiswa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AbsenSiswa {
    public static void main(String[]args){
        List<siswabaru> daftarSiswa = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("Tambah Data Siswa (y/n): ");
            String jawaban = input.nextLine();
            
            if(jawaban.equalsIgnoreCase("n")){
                break;
            }
            System.out.print("Nama: ");
            String nama = input.nextLine();
            
            System.out.print("Jenis Kelamin: ");
            String jenkel = input.nextLine();
            
            System.out.print("Umur: ");
            int umur = input.nextInt();
            input.nextLine();
            
            System.out.print("Kelas: ");
            String kelas = input.nextLine(); 
            
            siswabaru siswa = new siswabaru(nama,jenkel,umur,kelas);
            daftarSiswa.add(siswa);
        }
        System.out.println("Daftar Siswa:");
        for (siswabaru siswa : daftarSiswa){
            System.out.println(siswa);
        }       
    }
}
