package com.github.innovationforge;

import lombok.extern.java.Log;

// Step 3: Use Context
@Log
public class FileConversionContext {
    private FileConversionStrategy strategy;
    public void setStrategy(FileConversionStrategy strategy) {
        this.strategy = strategy;
    }
    public void convertFile(String inputFile, String outputFile) {
        if (strategy != null) {
            log.info("Converting file ...");
            strategy.convert(inputFile, outputFile);
        } else {
            log.info("No conversion strategy set.");
        }
    }
}