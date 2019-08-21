public class FizzBuzz {
    public static void main(String[] args) throws Exception {
        String[] words = {"Fizz", "Buzz"};
        int[] multiples = {3, 5};
        int limit = 100;

        if (words.length != multiples.length) {
            throw new Exception("Something went wrong there, pardner.");
        }

        for (int i = 1; i <= limit; i++) {
            StringBuilder stringBuilder = new StringBuilder();

            for (int j = 0; j < multiples.length; j++) {
                if (i % multiples[j] == 0) {
                    stringBuilder.append(words[j]);
                }
            }
            if (stringBuilder.length() == 0) {
                stringBuilder.append(i);
            }
            System.out.println(stringBuilder);
            }
        }
    }
}
