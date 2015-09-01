/* Nathan Chau
 * August 30, 2015
 * This program prints out "MISSISSIPPI", with each individual letter constructed out of the same
 * respective letters of smaller size, in a vertical line.
 */

public class Mississippi {
    public static void main(String[] args) {
        entireM();
        entireI();
        entireS();
        entireS();
        entireI();
        entireS();
        entireS();
        entireI();
        entireP();
        entireP();
        entireI();
    }
    
    public static void entireM() {
        twoM();
        midM();
        twoM();
        twoM();
        twoM();
    }
    
    public static void twoM() {
        System.out.println("M     M");
    }
    
    public static void midM() {
        System.out.println("MM   MM");
        System.out.println("M M M M");
        System.out.println("M  M  M");
    }
    
    public static void entireI() {
        lineI();
        midI();
        midI();
        midI();
        midI();
        midI();
        lineI();
    }
    
    public static void lineI() {
        System.out.println("IIIII");
    }
    
    public static void midI() {
        System.out.println("  I  ");
    }
    
    public static void entireS() {
        lineS();
        System.out.println("S     S");
        System.out.println("S");
        lineS();
        System.out.println("      S");
        System.out.println("S     S");
        lineS();
    }
    
    public static void lineS() {
        System.out.println(" SSSSS");
    }
    
    public static void entireP() {
        lineP();
        outP();
        outP();
        lineP();
        oneP();
        oneP();
        oneP();
    }
    
    public static void lineP() {
        System.out.println("PPPPPP");
    }
    
    public static void outP() {
        System.out.println("P     P");
    }
    
    public static void oneP() {
        System.out.println("P");
    }
}