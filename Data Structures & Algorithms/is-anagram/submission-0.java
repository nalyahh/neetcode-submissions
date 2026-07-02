class Solution {
    public boolean isAnagram(String s, String t) {

        char[] sArray = new char[s.length()];
        char[] tArray = new char[t.length()];

        s.getChars(0, s.length(), sArray, 0);
        t.getChars(0, t.length(), tArray, 0);


        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }
}
