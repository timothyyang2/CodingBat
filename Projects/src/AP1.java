import java.util.ArrayList;
import java.util.List;

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

    public List wordsWithoutList(String[] words, int len) {
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != len) {
                result.add(words[i]);
            }
        }
        return result;
    }

    public boolean hasOne(int n) {
        String input = String.valueOf(n);
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') {
                return true;
            }
        }
        return false;
    }

    public boolean dividesSelf(int n) {
        String input = String.valueOf(n);
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '0' || n % Integer.parseInt(input.substring(i, i + 1)) != 0) {
                return false;
            }
        }
        return true;
    }

    public int[] copyEvens(int[] nums, int count) {
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (index < count && nums[i] % 2 == 0) {
                result[index] = nums[i];
                index++;
            }
        }
        return result;
    }

    public int[] copyEndy(int[] nums, int count) {
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (index < count && (nums[i] >= 0 && nums[i] <= 10 || nums[i] >= 90 && nums[i] <= 100)) {
                result[index] = nums[i];
                index++;
            }
        }
        return result;
    }

    public int matchUp(String[] a, String[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals("") && !b[i].equals("") && a[i].charAt(0) == b[i].charAt(0)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
