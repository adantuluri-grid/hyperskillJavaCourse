class Util {
    public static int indexOf(String src, String tgt) {
        // your code here
        if (tgt.isEmpty()) {
            return 0;
        }
        if (src.length() < tgt.length()) {
            return -1;
        }
        if (src.startsWith(tgt)) {
            return 0;
        }

        int subIndex = indexOf(src.substring(1), tgt);
        if (subIndex == -1) {
            return -1;
        } else {
            return 1 + subIndex;
        }
    }
}