package com.github.innovationforge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class FileConverterTest {

    @Test
    @DisplayName("Test File Conversion")
    void testFileConversion() {
        FileConversionContext context = new FileConversionContext();

        // Set the conversion strategy based on user input or any other criteria
        context.setStrategy(new PDFConversionStrategy());

        // Perform file conversion using the selected strategy
        context.convertFile("input.txt", "output.pdf");
    }
}
