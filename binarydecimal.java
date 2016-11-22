package binarytodecimal;
import java.util.Scanner; 

/**
 *
 * @author daylinhenry
 */
public class BinaryToDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in); 
      
      System.out.println("Enter a binary number"); 
      String binaryString =keyboard.nextLine(); 
      System.out.println("Decimal number: "+Integer.parseInt(binaryString,2));
    
      
    }
    
}
