package Assignment;

import java.util.Scanner;

public class Cube55 {
    int Height, Width, Length;

        public void volume() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the height ");
            Height = scanner.nextInt();
            System.out.println("enter the width");
            Width = scanner.nextInt();
            System.out.println("enter the length");
            Length = scanner.nextInt();
            int vol = Height * Width * Length;


            System.out.println("The volume of cube is  "+vol);
        }
        public static void main(String[] args) {
        Cube55 obj=new Cube55();
    obj.volume();
    }
    }
