public class Encrypte_Words {


    public static void main(String[] args) {

        String s1="Hello world!";
        int key =26;
        char[] characters = new char[s1.length()];

        for (int i =0;i<s1.length();i++)
        {
            if(Character.isLetter(s1.charAt(i)) && Character.isUpperCase(s1.charAt(i)))

                characters[i] = (char) (((((int) (s1.charAt(i))-65) + key)%26)+65);

            else if(Character.isLetter(s1.charAt(i)) && Character.isLowerCase(s1.charAt(i)))
                characters[i] = (char) (((((int) (s1.charAt(i))-97) + key)%26)+97);

            else
                characters[i] =s1.charAt(i);

        }
        System.out.println(characters);
        String s2 = String.copyValueOf(characters);
        System.out.println(s2+" "+s1);

    }

//
//    }


}
