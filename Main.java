
/**
 * This program will generate the ingredients needed based on the number of eggs given.
 *
 * @author (Rebecca)
 * @version (Mar.2nd/23)
 */
import java.util.Scanner;
public class RebeccaCupcakeProgram{
    public static void main(String[] args){
    
        //declare variables 
        byte bytBatches;
        String strName;
        
            //constants 
            float fltButter = 0.5f;
            byte bytSugar = 1;
            byte bytEggs = 2;
            byte bytVanilla = 1;
            float fltCocoa = 0.25f;
            float fltFlour = 0.5f;
            float fltSalt = 0.25f;
            float fltBakingPowder = 0.25f;
            
            //1lb = 1.91 cups
            float fltlb= 1.91f;
            
        //declare scanner
            //for recipe
            Scanner Batches = new Scanner(System.in);
            
            //for recipe name
            Scanner Name = new Scanner(System.in);
        
        //welcome
        System.out.println("Welcome to the Cupcake Ingredients Calculator!");
        
        System.out.println();
        
        //input number of eggs
        System.out.println("How many eggs do you have in your fridge?");
        bytBatches = Batches.nextByte();
        
        System.out.println();
        
        //output number of batches
        bytBatches = (byte)(bytBatches / 2);
        System.out.print("It looks like you can make ");
        System.out.println(bytBatches + " batches of cupcakes!");
        
        //recipe calculation
        fltButter = (fltButter * bytBatches);
        bytSugar = (byte)(bytSugar * bytBatches);
        bytEggs = (byte)(bytEggs * bytBatches);
        bytVanilla = (byte)(bytVanilla * bytBatches);
        fltCocoa = (fltCocoa * bytBatches);
        fltFlour = (fltFlour * bytBatches);
        fltSalt = (fltSalt * bytBatches);
        fltBakingPowder = (fltBakingPowder * bytBatches);
        
        System.out.println();
        
        //recipe output
        System.out.println("Based on the recipe, you will need: ");
        System.out.println(" - " + fltButter + " cups of butter");
        System.out.println(" - " + bytSugar + " cups of sugar");
        System.out.println(" - " + bytEggs + " eggs");
        System.out.println(" - " + bytVanilla + " teaspoons of vanilla extract");
        System.out.println(" - " + fltCocoa + " cups of cocoa powder");
        System.out.println(" - " + fltFlour + " cups of flour");
        System.out.println(" - " + fltSalt + " teaspoons of salt");
        System.out.println(" - " + fltBakingPowder + " teaspoons of baking powder");
        
        System.out.println();
        
        //ingredients needed calculation & output
        System.out.print("Based on " + bytBatches + " batches of cupcakes, ");
        System.out.println("you will need to buy the following: ");
        System.out.print(" - Buy " + (byte)Math.ceil((fltFlour / fltlb) / 5));
        System.out.println(" bags of flour");
        System.out.print(" - Buy " + (byte)Math.ceil((bytSugar / fltlb) / 7));
        System.out.println(" bags of sugar");
        System.out.print(" - Buy " + (byte)Math.ceil(fltButter / 8));
        System.out.println(" blocks of butter");
        
        System.out.println();
        
        //asking for name of recipe
        System.out.println("Final step, what would you like to call your cupcakes?");
        strName = Name.nextLine();
        
        //closing
        System.out.println("Excellent! I can't wait to try " + strName + "!");
    }
}
