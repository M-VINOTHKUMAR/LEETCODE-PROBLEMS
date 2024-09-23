class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        int i = 0;
        
        while (i < words.length) {
            int lineLength = words[i].length();
            int last = i + 1;
            
            // Determine how many words fit in this line
            while (last < words.length && lineLength + words[last].length() + (last - i) <= maxWidth) {
                lineLength += words[last].length();
                last++;
            }
            
            StringBuilder sb = new StringBuilder();
            int wordCount = last - i;  // Number of words in this line
            
            // If it's the last line or only one word in the line, left-justify
            if (last == words.length || wordCount == 1) {
                for (int j = i; j < last; j++) {
                    sb.append(words[j]);
                    if (j < last - 1) sb.append(" ");
                }
                
                // Add remaining spaces to the end of the line
                while (sb.length() < maxWidth) {
                    sb.append(" ");
                }
            } else {
                // Fully justify the line
                int totalSpaces = maxWidth - lineLength;
                int spacesBetweenWords = totalSpaces / (wordCount - 1);
                int extraSpaces = totalSpaces % (wordCount - 1);
                
                for (int j = i; j < last; j++) {
                    sb.append(words[j]);
                    if (j < last - 1) {
                        // Append the standard space between words
                        for (int k = 0; k < spacesBetweenWords; k++) {
                            sb.append(" ");
                        }
                        // Append extra space (if needed) for left-most gaps
                        if (extraSpaces > 0) {
                            sb.append(" ");
                            extraSpaces--;
                        }
                    }
                }
            }
            
            res.add(sb.toString());
            i = last;  // Move to the next set of words
        }
        
        return res;
    }
}
