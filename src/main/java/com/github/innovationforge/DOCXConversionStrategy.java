package com.github.innovationforge;

import lombok.extern.java.Log;

@Log
public class DOCXConversionStrategy implements FileConversionStrategy {
    @Override
    public void convert(String inputFile, String outputFile) {
        // Convert input file to DOCX format
        log.info("Convert input file to DOCX format");
    }
}