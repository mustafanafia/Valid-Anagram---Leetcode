public class Main {
    public static void main(String[] args) {

       Main o = new Main();

        System.out.println(o.isAnagram("anagram", "nagaram"));

    }

    public boolean isAnagram(String s, String t) {
        int[] c = new int[26];

        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            c[t.charAt(i) - 'a']--;
        }

        for (int i : c) {
            if(i != 0){
                return false;
            }
        }

        return true;


    }

}