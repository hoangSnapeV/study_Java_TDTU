package HomeWorkInSlide;

public class Test {
    public static void main(String[] args) {

        String text = new String("I'm studying 501043.");
        
        // or String text = "I'm studying 501043.";
        
        // We will explain the difference later.
        
        System.out.println("text: " + text);
        
        System.out.println("text.length() = " + text.length());
        
        System.out.println("text.charAt(5) = " + text.charAt(5));
        
        System.out.println("text.substring(5,8) = " +
        
        text.substring(5,8));
        
        System.out.println("text.indexOf(\"in\") = " +
        
        text.indexOf("in"));
        
        String newText = text + "How about you?";
        
        newText = newText.toUpperCase();
        
        System.out.println("newText: " + newText);
        
        if (text.equals(newText)) {
            System.out.println("text and newText are equal.");
        } else System.out.println("text and newText are not equal.");
        
        }
}
