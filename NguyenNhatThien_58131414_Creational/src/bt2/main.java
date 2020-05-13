/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

/**
 *
 * @author thien
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStringBuilder string = new MyStringBuilder.Builder()
                .addString("Cộng 2 số: ")
                .addFloat((float) 9.999)
                .addString(" + ")
                .addFloat((float) 8.888)
                .addString(" = ")
                .addBool(true)
                .build();
        System.out.println(string.toString());
    }
    
}
