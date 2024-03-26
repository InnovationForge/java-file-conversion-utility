package com.github.innovationforge;

import lombok.extern.java.Log;

// Step 2: Implement Concrete Strategies
@Log
public class PDFConversionStrategy implements FileConversionStrategy {
    @Override
    public void convert(String inputFile, String outputFile) {
        // Convert input file to PDF format
        log.info("Convert input file to PDF format");
    }
}