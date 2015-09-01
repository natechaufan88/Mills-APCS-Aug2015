/* Nathan Chau
 * August 31, 2015
 * This program outputs the entire lyrics of the song, "There Was An Old Lady Who Swallowed A Fly."
 */

public class ThereWasAnOldLady {
    public static void starter() {
        System.out.print("There was an old lady who swallowed a ");
    }
    
    public static void fly() {
        starter();
        System.out.println("fly.");
    }
    
    public static void flyEnd() {
        System.out.println("I don't know why she swallowed the fly.");
        System.out.println("Perhaps she'll die.");
        System.out.println();
    }
    
    public static void spider() {
        starter();
        System.out.println("spider.");
        System.out.println("That wriggled and jiggled and tickled inside her.");
    }
    
    public static void spiderPhrase() {
        System.out.println("She swallowed the spider to catch the fly.");
        flyEnd();
    }
    
    public static void bird() {
        starter();
        System.out.println("bird.");
        System.out.println("How absurd! To swallow a bird.");
    }
    
    public static void birdPhrase() {
        System.out.println("She swallowed the bird to catch the spider.");
        spiderPhrase();
    }
    
    public static void cat() {
        starter();
        System.out.println("cat.");
        System.out.println("Imagine that! To swallow a cat.");
    }
    
    public static void catPhrase() {
        System.out.println("She swallowed the cat to catch the bird.");
        birdPhrase();
    }
    
    public static void dog() {
        starter();
        System.out.println("dog.");
        System.out.println("What a hog! To swallow a dog.");
    }
    
    public static void dogPhrase() {
        System.out.println("She swallowed the dog to catch the cat.");
        catPhrase();
    }
    
    public static void goat() {
        starter();
        System.out.println("goat.");
        System.out.println("Just opened her throat! To swallow a goat.");
    }
    
    public static void goatPhrase() {
        System.out.println("She swallowed the goat to catch the dog.");
        dogPhrase();
    }
    
    public static void cow() {
        starter();
        System.out.println("cow.");
        System.out.println("I don't know how she swallowed a cow!");
    }
    
    public static void cowPhrase() {
        System.out.println("She swallowed the cow to catch the goat.");
        goatPhrase();
    }
    
    public static void horse() {
        starter();
        System.out.println("horse.");
        System.out.println("She died, of course!");
    }
    
    public static void main(String[] args) {
        fly();
        flyEnd();
        spider();
        spiderPhrase();
        bird();
        birdPhrase();
        cat();
        catPhrase();
        dog();
        dogPhrase();
        goat();
        goatPhrase();
        cow();
        cowPhrase();
        horse();
    }
}
        
   