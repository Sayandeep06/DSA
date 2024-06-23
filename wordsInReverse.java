class wordsInReverse {
    public String reverseWords(String s) {
        // Trim the input string to remove leading and trailing spaces
        String[] str = s.trim().split("\\s+");

        // Initialize the output string
        String out = "";

        // Iterate through the words in reverse order
        int i = str.length - 1;
        while(i>=0){
            // Append the current word and a space to the output
            out += str[i] + " ";
            i--;
        }

        // Append the first word to the output (without trailing space)
        return out.trim();
    }
}