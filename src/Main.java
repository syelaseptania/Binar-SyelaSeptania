import java.util.Scanner;

//PROGRAM PARKIR//

public class Main {
    public static void main(String[] args) {
        Scanner input_masuk = new Scanner (System.in);
        double tarif_parkir= 0;
        int total_hari;
        int total_Jam_Parkir;
        double jumlah_bayar;

        System.out.println("=================");
        System.out.println("-----Welcome-----");
        System.out.println("=================");
        System.out.println("masukan no plat : ");
        String No_Plat = input_masuk.next();
        System.out.println("**INPUT JAM -> 00-24**");
        System.out.println("masukan jam masuk : ");
        int jam_masuk = input_masuk.nextInt();
        System.out.println("masukan jam keluar : ");
        int jam_keluar = input_masuk.nextInt();
        System.out.println("masukan Tanggal masuk : ");
        int tanggal_masuk = input_masuk.nextInt();
        System.out.println("masukan Tanggal keluar : ");
        int tanggal_keluar = input_masuk.nextInt();

        total_hari = tanggal_keluar-tanggal_masuk;
        total_Jam_Parkir = jam_keluar-jam_masuk;

        System.out.println("================");
        System.out.println("--Biaya Parkir--");
        System.out.println("================");
        if (total_hari == 0){
            if (total_Jam_Parkir <= 5){
                tarif_parkir = total_Jam_Parkir *1;
            }
            else if (total_Jam_Parkir >= 6) {
                tarif_parkir = 5+((total_Jam_Parkir-5)*0.5);
            }
        }
        else if (total_hari >= 1){
            if (total_Jam_Parkir <= 24){
                tarif_parkir = 15+(total_Jam_Parkir*0.5);
            }
            else {
                tarif_parkir = 0;
            }
        }
        System.out.println("No Plat : "+ No_Plat);
        System.out.println("Jam Masuk : " + jam_masuk + " WIB");
        System.out.println("Jam Keluar : " + jam_keluar + " WIB");
        System.out.println("Lama Parkir : " + total_Jam_Parkir + " Jam");
        System.out.println("Tarif Parkir : " + tarif_parkir +"$");
    }

}