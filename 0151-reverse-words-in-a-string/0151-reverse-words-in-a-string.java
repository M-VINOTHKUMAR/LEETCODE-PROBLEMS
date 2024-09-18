class Solution {
    public String reverseWords(String s) {
        // Trim the input string
        s = s.trim();
        
        // Split the string by spaces
        String[] a = s.split(" ");
        
        // Use StringBuilder for efficient string manipulation
        StringBuilder result = new StringBuilder();
        
        // Iterate backwards through the array
        for (int i = a.length - 1; i >= 0; i--) {
            if (!a[i].isEmpty()) {
                // Append the word and a space
                result.append(a[i]).append(" ");
            }
        }
        
        // Convert to string and trim any trailing space
        return result.toString().trim();
    }
}
