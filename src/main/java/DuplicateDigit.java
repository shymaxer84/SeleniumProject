public class DuplicateDigit {

    public static void main(String[] args) {

        int number =123415;
        String str= Integer.toString(number);
        String result ="";
        String temp ="";
        for (int i = 0; i < str.length(); i++) {
            String ch =""+str.charAt(i);
            if (result.contains(ch)) {
               temp=ch;
                continue;

            }
            result += ch;

        }
        System.out.println(result+temp);
    }

    }
