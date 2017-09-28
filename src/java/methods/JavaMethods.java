/*
 * Soleeman Hakimi 28/09/2017
 * With the purpose to investigate java methods
 * 1CS4U Rm 302
 */

package java.methods;
import java.util.Scanner;
/**
 *With the purpose to investigate java methods
 * @author sohak9660
 */
public class JavaMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //A Menu to draw a house in parts
        //1. Select 1: Draw a roof
        //2. Select 2: Draw a base
        //3. Select 3: Draw a walk
        int select=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Pleas eselect from the following: ");
        System.out.println("1. Select 1 to draw a roof.");
        System.out.println("2. Select 2 to draw a base.");
        System.out.println("3. Select 3 to draw a walk.");
        select = input.nextInt();
        if (select==1){
            addRoof();
        }
        else if (select ==2){
            addBase();
        }
        else {
            addWalk();
        }
        input.close();
    }
/**
 * What the method does
 * Preconditions 
 * Postconditions
 * 
 */    public static void addRoof(){
      
     System.out.
     
    }
 /**
  * What the method does
  * Preconditions 
  * Postconditions
 * 
 */  public static void addBase(){

    }
 /**
  * What the method does
  * Preconditions 
  * Postconditions
 * 
 */ public static void addWalk(){

    }
    
}
