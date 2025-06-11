/*complete the Function*/

class Solution {
    public ArrayList<String> generateIp(String s) {
      List<String> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return (ArrayList<String>) result;
    }

    private static void backtrack(String s, int index, List<String> path, List<String> result) {
        if (path.size() == 4 && index == s.length()) {
            result.add(String.join(".", path));
            return;
        }

        if (path.size() == 4) {
            return;
        }

        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {
            String segment = s.substring(index, index + len);

            if (segment.startsWith("0") && segment.length() > 1) continue;

            int num = Integer.parseInt(segment);
            if (num >= 0 && num <= 255) {
                path.add(segment);
                backtrack(s, index + len, path, result);
                path.remove(path.size() - 1);
            }
        }
    }
}
    