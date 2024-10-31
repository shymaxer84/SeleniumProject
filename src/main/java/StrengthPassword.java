import java.util.Scanner;

public class StrengthPassword {


    public static void main(String[] args) {


        System.out.println("Enter your password:");
        Scanner inputPassword = new Scanner(System.in);
        String myPassword = inputPassword.nextLine();



        if(myPassword.contains(" ")){

            System.out.println("Invalid Password");
            return;
        }

        boolean hasAtLeast8Chars = myPassword.length() >= 8;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for(int i =0;i<myPassword.length();i++)
        {
            char ch = myPassword.charAt((i));

            if (Character.isUpperCase(ch)){

                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
               hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                
                hasDigit = true;
            } else {
                hasSpecialChar =true;
            }
        }
        boolean isStrongPassword =hasAtLeast8Chars && hasDigit && hasUpperCase && hasLowerCase && hasSpecialChar;

        if(isStrongPassword){

            System.out.println(myPassword + "is a strong password");
        }else {
            System.out.println(myPassword + "is a weak password");
        }

    }


}
