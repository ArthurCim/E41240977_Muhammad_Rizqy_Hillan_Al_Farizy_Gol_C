/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mi5manpew;

/**
 *
 * @author THINKPAD
 */
public class orang {
        private String nama;
        private double tinggi;
        private double berat;
        
        public orang (String nama, double tinggi, double berat){
            this.nama = nama;
            this.tinggi = tinggi;
            this.berat = berat;
        }
        public String toString() {
            return ("nama : "+ nama +"\ntinggi : "+ tinggi +"\nberat : "+ berat);
        }
}
