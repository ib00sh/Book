package Ex_1;

import javax.swing.*;
import java.util.Random;

public class UsingArrayDemo {
    public static void main(String[] args) {
        int size = 10;
        Random rnd = new Random();
        int[] nums = new int[size];
        String txt = "Массив случайных числе:\n| ";
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rnd.nextInt(10) + 1;
            txt += nums[i] + " | ";
        }
        txt += "\nПроверка:\n|";
        for (int s : nums) {
            txt += s + " | ";
        }
        JOptionPane.showMessageDialog(null,
                txt,
                "Случайные числа",
                JOptionPane.PLAIN_MESSAGE);
    }
}
