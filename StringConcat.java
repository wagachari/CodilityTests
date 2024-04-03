class StringConcat {
    public static void main(String[] args) {
        StringConcat myClass = new StringConcat();
        myClass.mergeAlternately("abc", "pqr88");
    }

    public String mergeAlternately(String word1, String word2) {
        String newString = "";
        int wordSize = word1.length();
        int word2Size = word2.length();
        if (wordSize >= word2Size) {
            System.out.println("word1 is bigger");
            for (int i = 0; i < wordSize; i++) {
                newString = newString.concat(String.valueOf(word1.charAt(i)));
                if (word2Size > i) {
                    newString = newString.concat(String.valueOf(word2.charAt(i)));
                }
                System.out.println("loop" + i);

            }

            System.out.println("newString is =" + newString);

        } else {
            System.out.println("word2 2 is bigger");
            for (int i = 0; i < word2Size; i++) {
                if (wordSize > i) {
                    newString = newString.concat(String.valueOf(word1.charAt(i)));
                }
                newString = newString.concat(String.valueOf(word2.charAt(i)));

                System.out.println("loop" + i);

            }

            System.out.println("newString is =" + newString);
        }

        return newString;

    }
}