public class AP1 {

    public boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public boolean scores100(int[] scores) {
        int count = 0;
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 100 && scores[i + 1] == 100) {
                count++;
            }
        }
        return count > 0;
    }

    public boolean scoresClump(int[] scores) {
        int count = 0;
        for (int i = 0; i < scores.length - 2; i++) {
            if (scores[i + 2] - scores[i] <= 2) {
                count++;
            }
        }
        return count > 0;
    }

    public int scoresAverage(int[] scores) {
        int firstHalf = average(scores, 0, scores.length / 2);
        int secondHalf = average(scores, scores.length / 2, scores.length);

        return firstHalf > secondHalf ? firstHalf : secondHalf;
    }

    public int average(int[] scores, int start, int end) {
        int result = 0;
        for (int i = start; i < end; i++) {
            result += scores[i];
        }
        return result / (end - start);
    }

    public int wordsCount(String[] words, int len) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len) {
                count++;
            }
        }
        return count;
    }

    public String[] wordsFront(String[] words, int n) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = words[i];
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
