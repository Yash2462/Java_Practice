package edabit_questions;

import java.util.Scanner;

public class FramesPerSecond {
    public static int frames(int min, int fps) {
       int Frame_per_second = min * 60 * fps;

       return Frame_per_second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter minute :");
        int minutes = sc.nextInt();

        System.out.println("Enter fps Game gives :");
        int fps = sc.nextInt();

        System.out.println("Frames per second :" +frames(minutes,fps));
    }
}
