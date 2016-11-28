/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_3;

import java.util.Scanner;

/**
 *
 * @author Polina
 */
public class HomeWork_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // x
        int width;
        width = 1;
        // y
        int length;
        length = 1;

        System.out.println("Enter width: ");
        Scanner in = new Scanner(System.in);
        width = in.nextInt();

        System.out.println("Enter length: ");
        length = in.nextInt();
        
        square(width, length);
    }

    public static void square(int width, int length) {

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= width; j++) {
               
                // ввести ряд (х)
                if (i == 1 || i == length) {
                    System.out.print("*");
                }
                else {
                    // ввести колонку (y)
                    if (j == 1 || j == width){
                        // сами звёздочки
                        System.out.print("*");
                      
                    }
                    else {
                        // в том случае, когда между звёздочками нужен пустой пробел
                        System.out.print(" ");
                    }
                }
            }
            // начало новой строки
            System.out.println("");
        }
    }

}
