package org.learning;

import org.learning.Exceptions.ContainsNegativeNumbersException;

import java.util.*;

public class IncubyteTDDAssessment {

    private static final int INCLUDE_EMPTY_TOKENS = -1;

    static private List<Integer> validateFormatAndParseNumbers(String numberSection, String delimiterPattern) {
        if (numberSection == null || numberSection.isEmpty()) {
            return List.of();
        }

        String[] splitTokens = numberSection.split(delimiterPattern , INCLUDE_EMPTY_TOKENS);

        List<Integer> numbers = Arrays.stream(splitTokens)
                .filter(token -> !token.isBlank())
                .map(token -> Integer.parseInt(token.trim()))
                .toList();

        // check format ( "1," , "1,,", "1,\n2" )
        if (numbers.size() != splitTokens.length) {
            throw new RuntimeException("format error : %s".formatted(numberSection));
        }

        return numbers;
    }

    static private List<Integer> findNegativeNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number < 0)
                .toList();
    }

    static private String formatNegativeNumbers(Collection<Integer> negativeNumbers) {
        StringBuilder formatted = new StringBuilder("<");
        boolean isFirst = true;

        for (int number : negativeNumbers) {
            if (number >= 0) {
                throw new IllegalArgumentException(
                        "Only negative numbers are allowed: found %d".formatted(number)
                );
            }
            if (!isFirst) {
                formatted.append(",");
            }
            formatted.append(number);
            isFirst = false;
        }

        formatted.append(">");
        return formatted.toString();
    }

    static private AbstractMap.SimpleEntry<String, String> extractDelimiterAndNumberSection(String input) {
        if (input.startsWith("//")) {
            int delimiterEndIndex = input.indexOf("\n");
            String delimiter = input.substring(2, delimiterEndIndex);
            String escapedDelimiter = java.util.regex.Pattern.quote(delimiter);
            String numberSection = input.substring(delimiterEndIndex + 1);
            return new AbstractMap.SimpleEntry<>(escapedDelimiter, numberSection);
        }

        return new AbstractMap.SimpleEntry<>(",|\n", input);
    }

    public int add(String input) {
        if (input == null || input.isBlank()) {
            return 0;
        }

        var delimiterAndNumbers = extractDelimiterAndNumberSection(input);
        String delimiterPattern = delimiterAndNumbers.getKey();
        String numberSection = delimiterAndNumbers.getValue();

        List<Integer> numbers = validateFormatAndParseNumbers(numberSection, delimiterPattern);
        List<Integer> negativeNumbers = findNegativeNumbers(numbers);

        if (!negativeNumbers.isEmpty()) {
            throw new ContainsNegativeNumbersException(
                    "negative numbers not allowed %s".formatted(
                            formatNegativeNumbers(negativeNumbers)
                    )
            );
        }

        return numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}