package home.javarush.javaCore.task16.task1631;

import home.javarush.javaCore.task16.task1631.common.ImageReader;
import home.javarush.javaCore.task16.task1631.common.ImageTypes;

/* 
Factory method pattern
*/

public class Solution {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
    }
}
