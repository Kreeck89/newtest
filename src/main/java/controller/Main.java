package controller;

import service.impl.*;

import java.awt.image.BufferedImage;

public class Main {

    public static void main(String[] args) {
        int width = 1;
        int height = 2;
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        int[] pixels = {255,0,0};

        bufferedImage.setRGB(0,0,width, height, pixels, 0 , width);

        System.out.println("Result is: " + new SumInteger().count(6, 4));
        System.out.println("Result is: " + new MinusInteger().count(6, 4));
        System.out.println("Result is: " + new MultiplyInteger().count(6, 4));
        System.out.println("Result is: " + new SplitInteger().count(6, 4));
        System.out.println("Result is: " + new SumString().count("6", "4"));

    }
}
