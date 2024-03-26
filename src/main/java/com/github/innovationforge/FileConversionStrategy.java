package com.github.innovationforge;

// Step 1: Define the Strategy Interface
public interface FileConversionStrategy {
    void convert(String inputFile, String outputFile);
}