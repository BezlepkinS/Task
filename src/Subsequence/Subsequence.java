package Subsequence;

import java.util.*;
import java.util.function.BiPredicate;

public class Subsequence {
        public static void main(String[] args) {

            List<List<Integer>> testSequences = new ArrayList<>();

            testSequences.add(Arrays.asList(10, 2, 3, 5, 2, 3, 3, 5, 6, 7));
            testSequences.add(Arrays.asList(10, 9, 8));
            testSequences.add(Arrays.asList(2, 3, 4, 5, 5));

            for (List<Integer> sequence : testSequences) {
                List<Integer> longest = findLongestSequence(sequence, (previous, current) -> previous < current);

                System.out.println("For sequence " + sequence + " longest is : " + longest + " (length " + longest.size() + ")");
            }
        }

        private static List<Integer> findLongestSequence(List<Integer> source, BiPredicate<Integer, Integer> predicate) {
            List<Integer> longestSequence = Collections.emptyList();

            int fromIndex = -1;
            int toIndex = -1;

            int currentFrom = -1;
            int currentTo;

            for (int i = 1; i < source.size(); i++) {
                if (predicate.test(source.get(i - 1), source.get(i))) {
                    if (currentFrom == -1)
                        currentFrom = i - 1;

                    if (i == source.size() - 1) {
                        currentTo = source.size();

                        if (currentTo - currentFrom > toIndex - fromIndex) {
                            fromIndex = currentFrom;
                            toIndex = currentTo;
                        }
                    }
                } else {
                    currentTo = i;

                    if (currentTo - currentFrom > toIndex - fromIndex) {
                        fromIndex = currentFrom;
                        toIndex = currentTo;
                    }
                    currentFrom = -1;
                }
            }

            if (fromIndex > -1)
                longestSequence = source.subList(fromIndex, toIndex);

            return longestSequence;
        }
}
