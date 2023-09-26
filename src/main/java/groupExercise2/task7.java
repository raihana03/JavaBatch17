package groupExercise2;

public class task7 {
    /*
     You have a list of strings and you want to keep only those that start
with “A” and you want to return them in lower case"
     */
    public static void main(String[] args) {

        String sentences = "APPLES ARE SO DELICIOUS";
        System.out.println(sentences);
        String[] sentences1 = sentences.split(" ");
        for (String word : sentences1) {
            if (word.startsWith("A")) {
                System.out.println(word.toLowerCase());
            }
        }
    }}