/* Nathan Chau
 * August 30, 2015
 * This program outputs three letters addressed to three different family members.
 */

public class Letters {
    public static void main(String[] args) {
        mom();
        dad();
        brother();
    }
    
    public static void mom() {
        dear();
        System.out.println("Mom,");
        body();
    }
    
    public static void dad() {
        dear();
        System.out.println("Dad,");
        body();
    }
        
    public static void brother() {
        dear();
        System.out.println("Brother,");
        body();
    }
    
    public static void dear() {
        System.out.print("Dear ");
    }
    
    public static void body() {
        System.out.println("\tI haven't seen you since I left the United States 768 years ago!");
        System.out.println("I wanted to let you know that I'll be back within the millennium");
        System.out.println("to share all the experiences I've had in the galaxy far, far away.");
        System.out.println("Say hello to my great-great-great-great-great-great-grandson to me!");
        System.out.println("\t\t\t\t\tLove,");
        System.out.println("\t\t\t\t\t   Nathan");
    }
}
