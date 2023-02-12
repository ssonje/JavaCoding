public class RemoveAllOccurrencesOfChar {

    public static void main(String[] args) {
        String s = "sanketsanketsanketsanket";
        char c = 'n';

        // Remove all Occurrences of char c
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0; i<s.length(); i++) {
            if (s.charAt(i) != c) {
                stringBuffer.append(s.charAt(i));
            }
        }

        System.out.println("Removed all the occurrences of char `" + c + "` and final string = " + stringBuffer.toString());
    }
}
