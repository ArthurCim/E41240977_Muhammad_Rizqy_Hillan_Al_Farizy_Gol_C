/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mi5dapew;

public class Demo{
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();
        
        System.out.println("SuperClass");
        superOb.x = 10;
        superOb.y = 20;
        superOb.TampilkanNilaiXY();
        
        System.out.println("subClass");
        subOb.x = 5;
        subOb.y = 4;
        subOb.TampilkanNilaiXY();
        
        subOb.z = 50;
        subOb.TampilkanJumlah();
    }
}
