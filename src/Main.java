public class Main {
    public static void main(String[] args) {
        String sampleString = "The weather is so sunny nowadays";
        String[] wordsOfString = sampleString.split("\\s+");
        for (int i = 0 ; i < wordsOfString.length ; i++){
            System.out.println(wordsOfString[i]);
        }
        String reversedString = "";
        for (int i = 0 ; i < wordsOfString.length ; i++){
            reversedString += wordsOfString[wordsOfString.length-i-1] + " ";
        }
        System.out.println(reversedString);
    }

}