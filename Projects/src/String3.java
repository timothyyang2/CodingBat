public class String3 {

    public int countYZ(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if ((Character.toLowerCase(str.charAt(i)) == 'y' || Character.toLowerCase(str.charAt(i)) == 'z')
                    && (!Character.isLetter(str.charAt(i + 1)))) {
                count++;
            }
        }
        if (Character.toLowerCase(str.charAt(str.length() - 1)) == 'y'
                || Character.toLowerCase(str.charAt(str.length() - 1)) == 'z') {
            count++;
        }
        return count;
    }

    public String withoutString(String base, String remove) {
        String result = "";
        for (int i = 0; i < base.length();) {
            if (!(i + remove.length() > base.length())
                    && base.substring(i, i + remove.length()).equalsIgnoreCase(remove)) {
                i += remove.length();
                continue;
            } else {
                result += base.substring(i, i + 1);
                i++;
            }
        }
        return result;
    }

    public boolean equalIsNot(String str) {
        int is = 0;
        int not = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!(i + 2 > str.length()) && str.substring(i, i + 2).equals("is")) {
                is++;
            }
            if (!(i + 3 > str.length()) && str.substring(i, i + 3).equals("not")) {
                not++;
            }
        }
        return is == not;
    }

    public int sumDigits(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        return count;
    }

    public int maxBlock(String str) {
        int count = 0;
        int maxBlock = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count > maxBlock) {
                maxBlock = count;
            }
            count = 0;
        }
        return maxBlock;
    }

    public static void main(String[] args) {

    }

}
