/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serchseq;
public class Serchseq {
    public static void main(String[] args) {
        int[] ex = {2, 9, 6, 7, 4, 5, 3, 0, 1};
        int target = 4;
        sequentialSearch(ex, target);
    }

    public static void sequentialSearch(int parameterone[], int parametertwo) {
        int index = -1;
        for (int i = 0; i < parameterone.length; i++) {
            if (parameterone[i] == parametertwo) {
                index = i;
                break;
            }
        }
        if (index == 1) {
            System.out.println("Your target integer does not exist in the array");
        } else {
            System.out.println("Your target integer is in index " + index + " of the array");
        }
    }
}
