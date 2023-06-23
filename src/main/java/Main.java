import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);
        HashMap<String, String> p_b = new HashMap<>();

        System.out.print("Enter the size of the phone_book: ");
        int p_b_size = enter.nextInt();

        for (int i = 0; i < p_b_size; i++) {
            System.out.print("Enter the name of the phone number's owner: ");
            String name = enter.next();
            name = name.substring(0, 1).toUpperCase() + name.substring(1);

            System.out.print("Enter the phone number you want to add: ");
            String phone_num = enter.next();

//            String sub_p_n = phone_num;
//
//            if (phone_num.startsWith("+")) {
//                sub_p_n = phone_num.substring(1);
//            } else {
//                Integer sub_p_n1 = Integer.parseInt(sub_p_n);
//            }
//            if (sub_p_n1 instanceof int) {
//                System.out.println("You have entered the non-numeric symbol. Please try again!");
//                break;
//            }
            if (p_b.containsKey(name)) {
                p_b.compute(name, (key, value) -> value + ", " + phone_num);
            } else {
                p_b.put(name, " " + phone_num);
            }

            if (i == p_b_size - 1) {
                for (String key :
                        p_b.keySet()) {
                    System.out.println(key + ": " + p_b.get(key));
                }
            }
        }
    }
}
