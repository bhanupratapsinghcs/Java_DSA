package org.javaDSA.leetCode.Goldman;

import java.util.ArrayList;
import java.util.List;

public class RemoveComment {
    public static void main(String[] args) {
        String[] code = {"/*Test program */", "int main()", "{ ",
                "  // variable declaration ", "int a, b, c;",
                "/* This is a test", "   multiline  ", "   comment for ", "   testing */",
                "a = b + c;", "}"};

        List<String> cleanedCode = removeComments(code);
        System.out.println(cleanedCode);
    }

    private static List<String> removeComments(String[] code) {
        List<String> result = new ArrayList<>();
        boolean inBlockComment = false;

        for (String line : code) {
            StringBuilder cleanedLine = new StringBuilder();
            int i = 0;

            while (i < line.length()) {
                if (!inBlockComment && i + 1 < line.length() && line.charAt(i) == '/' && line.charAt(i + 1) == '*') {
                    inBlockComment = true;
                    i += 2; // Skip the block comment start
                } else if (inBlockComment && i + 1 < line.length() && line.charAt(i) == '*' && line.charAt(i + 1) == '/') {
                    inBlockComment = false;
                    i += 2; // Skip the block comment end
                } else if (!inBlockComment && i + 1 < line.length() && line.charAt(i) == '/' && line.charAt(i + 1) == '/') {
                    break; // Ignore the rest of the line as it's a single-line comment
                } else if (!inBlockComment) {
                    cleanedLine.append(line.charAt(i)); // Keep the character if not in a comment
                    i++;
                } else {
                    i++; // Skip characters in block comment
                }
            }

            if (!cleanedLine.toString().trim().isEmpty()) {
                result.add(cleanedLine.toString());
            }
        }

        return result;
    }
}
