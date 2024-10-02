// 12S24006 - Margareth Bungaran Sitompul   
// 12S24012 - Choqy Pananda Sirait  
import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, penerbit, formatBukuElektronik, kategori, kategoriDiskon;
        int tahunTerbit, stok;
        double hargaPembelian, minimumMargin, rating;

        iSBN = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahunTerbit = Integer.parseInt(input.nextLine());
        penerbit = input.nextLine();
        formatBukuElektronik = input.nextLine();
        hargaPembelian = Double.parseDouble(input.nextLine());
        minimumMargin = Double.parseDouble(input.nextLine());
        stok = Integer.parseInt(input.nextLine());
        rating = Double.parseDouble(input.nextLine());
        do {
            iSBN = input.nextLine();
            if (iSBN.equals("---")) {
            } else {
                judul = input.nextLine();
                penulis = input.nextLine();
                tahunTerbit = Integer.parseInt(input.nextLine());
                penerbit = input.nextLine();
                if (penerbit.equals("---")) {
                    penerbit = "---";
                } else {
                    penerbit = penerbit;
                }
                formatBukuElektronik = input.nextLine();
                hargaPembelian = Double.parseDouble(input.nextLine());
                minimumMargin = Double.parseDouble(input.nextLine());
                if (minimumMargin > 0) {
                    kategori = "---";
                } else {
                    if (minimumMargin < -(hargaPembelian * 40 / 100)) {
                        kategori = "Once in a lifetime";
                    } else {
                        if (minimumMargin < -(hargaPembelian * 20 / 100)) {
                            kategori = "Never come twice";
                        } else {
                            kategori = "No regret";
                        }
                    }
                }
                stok = Integer.parseInt(input.nextLine());
                rating = Double.parseDouble(input.nextLine());
            }
            if (rating >= 4.7) {
                kategori = "Must Read";
            } else {
                if (rating >= 4.5) {
                    kategori = "Must Read";
                } else {
                    if (rating >= 4.0) {
                        kategori = "Recommended";
                    } else {
                        if (rating >= 3.0) {
                            kategori = "Average";
                        } else {
                            kategori = "Low";
                        }
                    }
                }
            }
            if (kategori.equals("Once in a lifetime") && kategori.equals("Best Pick")) {
                kategori = "The Ultimate Best";
            } else {
                kategori = "---";
            }
            System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBukuElektronik + "|" + hargaPembelian + "|" + minimumMargin + "|" + stok + "|" + rating + "|" + kategori + "|" + kategori + "|" + kategori);
        } while (!iSBN.equals("---"));
    }
}

