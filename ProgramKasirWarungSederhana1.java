/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    import java.util.Scanner;
    public class ProgramKasirWarungSederhana {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalBiaya, diskon;
        
        System.out.println("--Selamat datang di Warung Sederhana!--");
        System.out.println("Silakan pilih menu makanan:");
        System.out.println("1. Sate");
        System.out.println("2. Pecel");
        System.out.println("3. Penyetan");
        
        System.out.print("Masukkan pilihan (1-3): ");
        int menuPilihan = scanner.nextInt();
        
        switch (menuPilihan) {
            case 1: // Sate
                System.out.println("Pilih jenis sate:");
                System.out.println("1. Ayam : Rp 1.500/tusuk");
                System.out.println("2. Kambing : Rp 3.000/tusuk");
                
                System.out.print("Masukkan pilihan (1-2) : ");
                int satePilihan = scanner.nextInt();
                System.out.print("Masukkan jumlah tusuk : ");
                int jumlahSate = scanner.nextInt();
                
                if (satePilihan == 1) {
                    totalBiaya = 1500 * jumlahSate;
                } else if (satePilihan == 2) {
                    totalBiaya = 3000 * jumlahSate;
                } else {
                    System.out.println("Pilihan tidak tersedia.");
                    return;
                }
                break;

            case 2: // Pecel
                System.out.println("Pilih lauk pecel:");
                System.out.println("1. Lauk Ayam : Rp 13.000/porsi");
                System.out.println("2. Lauk Empal : Rp 15.000/porsi");
                
                System.out.print("Masukkan pilihan (1-2): ");
                int pecelPilihan = scanner.nextInt();
                System.out.print("Masukkan jumlah porsi: ");
                int jumlahPecel = scanner.nextInt();
                
                if (pecelPilihan == 1) {
                    totalBiaya = 13000 * jumlahPecel;
                } else if (pecelPilihan == 2) {
                    totalBiaya = 15000 * jumlahPecel;
                } else {
                    System.out.println("Pilihan tidak tersedia.");
                    return;
                }
                break;

            case 3: // Penyetan
                System.out.println("Pilih lauk penyetan:");
                System.out.println("1. Lauk Tahu/Tempe : Rp 5.000/porsi");
                System.out.println("2. Lauk Telur : Rp 7.000/porsi");
                System.out.println("3. Lauk Ayam : Rp 10.000/porsi");
                
                System.out.print("Masukkan pilihan (1-3): ");
                int penyetanPilihan = scanner.nextInt();
                System.out.print("Masukkan jumlah porsi: ");
                int jumlahPenyetan = scanner.nextInt();
                
                switch (penyetanPilihan) {
                    case 1:
                        totalBiaya = 5000 * jumlahPenyetan;
                        break;
                    case 2:
                        totalBiaya = 7000 * jumlahPenyetan;
                        break;
                    case 3:
                        totalBiaya = 10000 * jumlahPenyetan;
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia.");
                    return;
                    }
                    break;

        default:
            System.out.println("Pilihan menu tidak tersedia.");
        return;
        }

            System.out.print("Apakah Anda memiliki kartu member? (y/n): ");
        char member = scanner.next().charAt(0);
        if (member == 'y') {
            diskon= 0.05*totalBiaya;
            System.out.println("Diskon = Rp "+diskon);
            totalBiaya=totalBiaya - diskon;
            System.out.println("Total biaya yang harus dibayarkan: Rp " +totalBiaya);  
            System.out.println("--Terima kasih telah berkunjung ke Warung Sederhana!--");
        }else if(member == 'n') {
            totalBiaya=totalBiaya;
            System.out.println("Total biaya yang harus dibayarkan: Rp "+totalBiaya);
      
                
    }
}
    }
    


