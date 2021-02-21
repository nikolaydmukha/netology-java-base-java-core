package home.javarush.javaCore.task16.task1631;

import home.javarush.javaCore.task16.task1631.common.BmpReader;
import home.javarush.javaCore.task16.task1631.common.JpgReader;
import home.javarush.javaCore.task16.task1631.common.PngReader;
import home.javarush.javaCore.task16.task1631.common.ImageReader;
import home.javarush.javaCore.task16.task1631.common.ImageTypes;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes type) {

        if (type == null){
            throw  new IllegalArgumentException("Неизвестный тип картинки");
        }
        switch (type){
            case JPG:
                return new JpgReader();
            case BMP:
                return new BmpReader();
            case PNG:
                return new PngReader();
            default:
                throw  new IllegalArgumentException("Неизвестный тип картинки");

        }
    }

}
