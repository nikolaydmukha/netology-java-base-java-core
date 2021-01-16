package home.netology.javabase.exceptions.urlvalidator;

import home.netology.javabase.exceptions.urlvalidator.ex.NotValidUrlException;
import home.netology.javabase.exceptions.urlvalidator.ex.UnsupportedSchemaException;

public class UrlUtils {

    public static void validate(String value) throws NotValidUrlException {
        boolean isValidSchema = value.startsWith("http://") || value.startsWith("https://");
        if (!isValidSchema) {
            throw new UnsupportedSchemaException(value);
        }
        if (value.contains(" ")) {
            throw new NotValidUrlException("Url содержит пробелы: " + value);
        }
    }
}
