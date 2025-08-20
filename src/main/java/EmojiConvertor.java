import java.util.*;

public class EmojiConvertor {

    public static void main(String[] args) {
        System.out.println("Enter your text please>>");
        Scanner input = new Scanner(System.in);
        HashMap emojis = new HashMap();


                    emojis.put("lol", "🤣");
                    emojis.put("happy", "😂");
                    emojis.put(":)", "😊");
                    emojis.put("sad", "🙁");
                    emojis.put(":(", "😔");

        String output = " ";
        String arr[]= input.nextLine().split(" ");
        for(String word : arr )
        {
            output += emojis.getOrDefault(word,word)+" ";

        }
        System.out.println(output);








    }
}
