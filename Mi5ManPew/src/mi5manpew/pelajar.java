/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mi5manpew;

public class pelajar extends orang{
    private String NIM;
    private String  asalSekolah;
    private double nilai;
    
    public pelajar (String nama, double tinggi, double berat, String NIM, String asalSekolah, double nilai){
        super(nama, tinggi, berat);
        this.NIM = NIM;
        this.asalSekolah = asalSekolah;
        this.nilai = nilai;
    }
    public String toString(){
        return (super.toString()+"\nNIM : "+ NIM +"\nasal Sekolah : "+ asalSekolah +"\nnilai : "+ nilai);
    }
}
