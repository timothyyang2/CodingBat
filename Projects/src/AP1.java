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

    public int scoreUp(String[] key, String[] answers) {
        int score = 0;
        for (int i = 0; i < key.length; i++) {
            if (answers[i] == key[i]) {
                score += 4;
            } else if (answers[i].equals("?")) {
                score += 0;
            } else {
                score -= 1;
            }
        }
        return score;
    }

    public String[] wordsWithout(String[] words, String target) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                count++;
            }
        }
        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                result[index] = words[i];
                index++;
            }
        }
        return result;
    }

    public int scoresSpecial(int[] a, int[] b) {
        return largestScore(a) + largestScore(b);
    }

    public int largestScore(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == 0 && array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        while (start < end) {
            sum = sum + Math.abs(heights[start] - heights[start + 1]);
            start++;
        }
        return sum;
    }

    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        while (start < end) {
            if (heights[start] - heights[start + 1] < 0) {
                sum = sum + Math.abs(heights[start] - heights[start + 1]) * 2;
            } else {
                sum = sum + Math.abs(heights[start] - heights[start + 1]);
            }
            start++;
        }
        return sum;
    }

    public int bigHeights(int[] heights, int start, int end) {
        int count = 0;
        while (start < end) {
            if (Math.abs(heights[start] - heights[start + 1]) >= 5) {
                count++;
            }
            start++;
        }
        return count;
    }

    public int userCompare(String aName, int aId, String bName, int bId) {
        if (aName.compareTo(bName) < 0) {
            return -1;
        } else if (aName.compareTo(bName) > 0) {
            return 1;
        } else if (aId < bId) {
            return -1;
        } else if (aId > bId) {
            return 1;
        } else {
            return 0;
        }
    }

    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] result = new String[n];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < n; i++) {
            if (a[index1].compareTo(b[index2]) < 0) {
                result[i] = a[index1];
                index1++;
            } else if (a[index1].compareTo(b[index2]) > 0) {
                result[i] = b[index2];
                index2++;
            } else {
                result[i] = a[index1];
                index1++;
                index2++;
            }
        }
        return result;
    }

    public int commonTwo(String[] a, String[] b) {
        int count = 0;
        String result = "";
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j].compareTo(b[i]) == 0 && !result.contains(a[j])) {
                    result += a[j];
                    count++;
                }
            }
        }
        return count;
    }
}
