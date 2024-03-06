import java.util.List;

public class Functional2 {

    public List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(num -> num < 0);
        return nums;
    }

    public List<Integer> no9(List<Integer> nums) {
        nums.removeIf(num -> num % 10 == 9);
        return nums;
    }

    public List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(num -> num >= 13 && num <= 19);
        return nums;
    }

    public List<String> noZ(List<String> strings) {
        strings.removeIf(str -> str.contains("z"));
        return strings;
    }

    public List<String> noLong(List<String> strings) {
        strings.removeIf(str -> str.length() >= 4);
        return strings;
    }

    public List<String> no34(List<String> strings) {
        strings.removeIf(str -> str.length() == 3 || str.length() == 4);
        return strings;
    }

    public List<String> noYY(List<String> strings) {
        strings.replaceAll(str -> str + "y");
        strings.removeIf(str -> str.contains("yy"));
        return strings;
    }

    public List<Integer> two2(List<Integer> nums) {
        nums.replaceAll(num -> num * 2);
        nums.removeIf(num -> num % 10 == 2);
        return nums;
    }

    public List<Integer> square56(List<Integer> nums) {
        nums.replaceAll(num -> num * num + 10);
        nums.removeIf(num -> num % 10 == 5 || num % 10 == 6);
        return nums;
    }
}
