import java.util.HashMap;
import java.util.Map;

public class Map2 {

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> result = new HashMap();
        for (int i = 0; i < strings.length; i++) {
            result.put(strings[i], 0);
        }
        return result;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> result = new HashMap();
        for (int i = 0; i < strings.length; i++) {
            result.put(strings[i], strings[i].length());
        }
        return result;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> result = new HashMap();
        for (int i = 0; i < strings.length; i++) {
            result.put(strings[i].substring(0, 1), strings[i].substring(strings[i].length() - 1));
        }
        return result;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        int count = 0;
        Map<String, Integer> result = new HashMap();
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (strings[i].equals(strings[j])) {
                    count++;
                }
            }
            result.put(strings[i], count);
            count = 0;
        }
        return result;
    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> result = new HashMap();
        for (int i = 0; i < strings.length; i++) {
            if (result.containsKey(strings[i].substring(0, 1))) {
                result.put(strings[i].substring(0, 1), result.get(strings[i].substring(0, 1)) + strings[i]);
            } else {
                result.put(strings[i].substring(0, 1), strings[i]);
            }
        }
        return result;
    }

    public String wordAppend(String[] strings) {
        Map<String, Integer> count = new HashMap();
        String result = "";
        for (int i = 0; i < strings.length; i++) {
            if (count.containsKey(strings[i])) {
                count.put(strings[i], count.get(strings[i]) + 1);
                if (count.get(strings[i]) % 2 == 0) {
                    result += strings[i];
                }
            } else {
                count.put(strings[i], 1);
            }
        }
        return result;
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> result = new HashMap();
        for (int i = 0; i < strings.length; i++) {
            if (result.containsKey(strings[i])) {
                result.put(strings[i], true);
            } else {
                result.put(strings[i], false);
            }
        }
        return result;
    }

}
