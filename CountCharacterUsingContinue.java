package _MNC_Coding_Que;

// How to count the occurrence of the given character in a String?

public class CountCharacterUsingContinue {
    public static void main(String[] args) {
        String inputString = "Invimatic Technologies Pvt Ltd";
        int count = 0;

        for(int i = 0; i<inputString.length(); i++){
            if(inputString.charAt(i)!='i'){
                continue;
            }
            count++;
        }
        System.out.println("I found 'a' in the inputString '"+inputString+ "'," + count + " times.");
    }
}
