import java.util.Scanner;

/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 * Program  : Massa Jenis
 */
public class PBO10k10119915 {
    public static void main(String[] args) {
        int volume,parMassa;
        kubus jenis = new kubus();
        System.out.println("======Massa Jenis Kubus======");
        System.out.println("Sisi\t = " + jenis.getSisi());
        System.out.println("Massa\t = " + jenis.getMassa());

        System.out.println("======Hasil Perhitungan======");
        parMassa = jenis.getMassa();
        volume = jenis.hitungVolume(jenis.getSisi());
        System.out.println("Volume\t = " + jenis.hitungVolume(jenis.getSisi()));
        System.out.println("Massa\t = " + jenis.hitungMassaJenis(parMassa, volume));
        
    }
}