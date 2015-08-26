
public class ThereWasAnOldLady {
    public static void fly() {
        System.out.println("There was an old lady who swallowed a fly.");
    }
    
    public static void flyEnd() {
        System.out.println("I don't know why she swallowed the fly.");
        System.out.println("Perhaps she'll die.");
    }
    
    public static void spider() {
        System.out.println("There was an old lady who swallowed a spider.");
        System.out.println("That wriggled and jiggled and tickled inside her.");
    }
    
    public static void spiderPhrase() {
        System.out.println("She swallowed the spider to catch the fly.");
        flyEnd();
    }
    
    public static void bird() {
        System.out.println("There was an old lady who swallowed a bird.");
        System.out.println("How absurd! To swallow a bird.");
    }
    
    public static void birdPhrase() {
        System.out.println("She swallowed the bird to catch the spider.");
        spiderPhrase();
    }
    
    public static void cat() {
        System.out.println("There was an old lady who swallowed a cat.");
        System.out.println("Imagine that! To swallow a cat.");
    }
    
    public static void catPhrase() {
        System.out.println("She swallowed the cat to catch the bird.");
        birdPhrase();
    }
    
    public static void dog() {
        System.out.println("There was an old lady who swallowed a dog.");
        System.out.println("What a hog! To swallow a dog.");
    }
    
    public static void dogPhrase() {
        System.out.println("She swallowed the dog to catch the cat.");
        catPhrase();
    }
    
    public static void goat() {
        System.out.println("There was an old lady who swallowed a goat.");
        System.out.println("Just opened her throat! To swallow a goat.");
    }
    
    public static void goatPhrase() {
        System.out.println("She swallowed the goat to catch the dog.");
        dogPhrase();
    }
    
    public static void cow() {
        System.out.println("There was an old lady who swallowed a cow.");
        System.out.println("I don't know how she swallowed a cow!");
    }
    
    public static void cowPhrase() {
        System.out.println("She swallowed the cow to catch the goat.");
        goatPhrase();
    }
    
    public static void horse() {
        System.out.println("There was an old lady who swallowed a horse.");
        System.out.println("She died, of course!");
    }
    
    public static void main(String[] args) {
        fly();
        flyEnd();
        System.out.println();
        spider();
        spiderPhrase();
        System.out.println();
        bird();
        birdPhrase();
        System.out.println();
        cat();
        catPhrase();
        System.out.println();
        dog();
        dogPhrase();
        System.out.println();
        goat();
        goatPhrase();
        System.out.println();
        cow();
        cowPhrase();
        System.out.println();
        horse();
    }
}
        
   