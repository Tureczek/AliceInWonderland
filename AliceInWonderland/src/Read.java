import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Read {


    File file = new File("C:\\Users\\Nmtur\\IdeaProjects\\AliceInWonderland\\src\\Read");
    Scanner input = new Scanner(file);

    public Read() throws FileNotFoundException {
    }

    public void getChars() {
        System.out.println(file.length());
    }

    public void getCharNoSpace() {
        int count = 0;

        while (input.hasNext()) {
            String words = input.nextLine();
            String[] chars = words.split(" ");

            for (String charC : chars) {
                String nextword = charC.replace(" ", "");
                count++;
            }
        }
        System.out.println(count);
    }

    public void instances() throws FileNotFoundException {
        Map<String, Integer> wordsAndCount = new HashMap<>();
        Scanner input = new Scanner(file);
        while(input.hasNext()){
            String line = input.nextLine();
            String [] words = line. split(" ");

            for (String word : words) {
                String wordCounted = word.toLowerCase().replaceAll("[^a-zA-Z0-9_-]", ""); // Erstatter alle specielle karakterer

                if (wordsAndCount.containsKey(wordCounted)){
                    int count = wordsAndCount.get(wordCounted);
                    wordsAndCount.put(wordCounted, count+1);
                } else {
                    wordsAndCount.put(wordCounted, 1);
                }

            }
        }
        Set<String> numberOfWordsInMap = wordsAndCount.keySet();
        Set<String> wordsInMap = new TreeSet<>(numberOfWordsInMap);
        for (String fusion : wordsInMap) {
            System.out.println("The word: \"" + fusion + "\", occurs in the text: " + wordsAndCount.get(fusion) + " times.");

        }

    }


}
