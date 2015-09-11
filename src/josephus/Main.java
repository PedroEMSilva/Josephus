/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package josephus;

/**
 *
 * @author DAELN
 */
public class Main {
     public static void main(String [ ] args)
{
    JosephusXY l1 = new JosephusXY();
    l1.add(2,"a");
    l1.add(1,"b");
    l1.add(2,"c");
    l1.add(3,"d");
    l1.add(4,"e");
    l1.add(5,"f");
    
    
    System.out.println(l1);
    System.out.println(l1.soldadoAEscapar("a"));
    System.out.println(l1);
    
}
}
