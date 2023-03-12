package _MNC_Coding_Que;

public class CountCharacter {
    public static void main(String[] args) {
        String inputString="College";
        char ch ='l';
        int count = 0;
        for(int i=0; i< inputString.length(); i++){
            if(inputString.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("The Character '"+ch+"' found "+count+" times in a string '"+inputString+"'.");
    }
}
