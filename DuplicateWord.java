/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cfg;
/**
 * Nguyen Thi Quynh Tram.SE1303.SWE.EX6
 * @author Quynh Tram
 */
import java.util.ArrayList;
import java.util.List;

public class DuplicateWord {

    public static String repeat(String s) {
        String[] words = s.split(" ");
        ArrayList<String> list = new ArrayList<>();
        String result = "";
        int k = 0;
        for (String r : words) {
            list.add(r);
        }
        ArrayList<Integer> position = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    position.add(j);
                    list.set(i, "REPEAT");
                } else {
                    break;
                }
            }
        }
        for (Integer integer : position) {
            list.set(integer, "");
        }
        for (String string : list) {
            if (!string.equals("")) {
                result += string + " ";
            }
        }
        result = result.replace("", "");
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Input: big big black bug bit bit  a a big black dog on his big black nose");
        System.out.println("Expect output: REPEAT black bug REPEAT REPEAT big black dog on his big black nose ");
        System.out.println("Real out put: ");
        System.out.println(repeat(" big big black bug bit bit  a a big black dog on his big black nose "));
        System.out.println("");
        System.out.println("Input: big big black bug Bit bit  a a big black dog on his big black nose");
        System.out.println("Expect output: REPEAT black bug Bit bit  REPEAT big black dog on his big black nose ");
        System.out.println("Real out put: ");
        System.out.println(repeat(" big big black bug Bit bit  a a big black dog on his big black nose "));
        System.out.println("");
        System.out.println("I want to to go to the the the zoo");
        System.out.println("Expect output: I want REPEAT go to REPEAT zoo  ");
        System.out.println("Real out put: ");
        System.out.println(repeat("I want to to go to the the the zoo "));
        System.out.println("");
        System.out.println("I I want to to go to the the the zoo");
        System.out.println("Expect output: REPEAT want REPEAT go to REPEAT zoo  ");
        System.out.println("Real out put: ");
        System.out.println(repeat("I I want to to go to the the the zoo "));
        System.out.println("");
        System.out.println("I want to to go to the the the zoo zoo");
        System.out.println("Expect output: REPEAT want REPEAT go to REPEAT REPEAT  ");
        System.out.println("Real out put: ");
        System.out.println(repeat("I I want to to go to the the the zoo zoo "));
        System.out.println("");
        System.out.println("I want to to go to the the the zoo 1 1");
        System.out.println("Expect output: REPEAT want REPEAT go to REPEAT zoo REPEAT   ");
        System.out.println("Real out put: ");
        System.out.println(repeat("I I want to to go to the the the zoo 1 1 "));

    }

}
