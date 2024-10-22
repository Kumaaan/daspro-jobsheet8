import java.util.Scanner;
public class rataNilai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, nilaiMhs;
        float nilai, totalNilai, rataNilai;

        i = 1;
        while (i <= 5) {
            System.out.print("Masukkan nilai mahasiswa ke- " + i );
            System.out.println();
            totalNilai = 0;
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilaiMhs = sc.nextInt();
                totalNilai += nilaiMhs;
            } 
            rataNilai = totalNilai / 5;
            
            System.out.println("Nilai rata-rata mahasiswa ke- " + i + " = " + rataNilai);
            i++;
        }

    }
}