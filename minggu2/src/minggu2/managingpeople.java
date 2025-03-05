/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu2;

/**
 *
 * @author THINKPAD
 */
public class managingpeople {
    
    public static void main(String[] args) {
        
        person p1 = new person("ixia", 22);
        person p2 = new person("beatrix", 25);
        if(p1.getAge()==p2.getAge()) {
            System.out.println(p1.getName()+" is the same age as "+p2.getName());
        }
        else {
            System.out.println(p1.getName()+" is NOT the same age "+p2.getName());
        }
    }
}
