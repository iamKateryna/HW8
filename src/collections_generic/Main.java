package collections_generic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);/*

        System.out.println("Enter first line");
        String line = scanner.nextLine();
        System.out.println("Enter second line");
        String word = scanner.nextLine();
        System.out.println(line.contains(word));

        System.out.println("Enter surname");
        String surname = scanner.nextLine();
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter patronomic");
        String patronomic = scanner.nextLine();

        System.out.println(surname + ' ' + name.substring(0, 1) + '.' + patronomic.substring(0, 1) + '.');
        System.out.println(name);
        System.out.println(name.concat(' ' + patronomic.concat(' ' + surname)));*/

        String[] userName;
        userName = new String[5];
        userName[0] = "hdiuhois_hohwoi23ho";
        userName[1] = "hdiuhois  76uds.ho";
        userName[2] = "hdiuhois_hohwoi23ho";
        userName[3] = "hdiuh_o2shoho";
        userName[4] = "hd";

        for(int i = 0; i < userName.length; i++) {
            System.out.println(checkWithRegExp(userName[i]));
        }

    }
    public static boolean checkWithRegExp(String userNameString){
        Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }
}
