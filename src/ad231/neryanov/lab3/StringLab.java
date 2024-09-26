package ad231.neryanov.lab3;

public class StringLab {

    /**
     * Проверяет, заканчивается ли строка на "ed".
     *
     * @param s строка, которую необходимо проверить
     * @return true, если строка заканчивается на "ed"; иначе false
     */
    public static boolean firstTask(String s) {
        int length = s.length();
        if (length >= 2 && s.charAt(length - 1) == 'd' && s.charAt(length - 2) == 'e') {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Суммирует все цифры в строке.
     *
     * @param s строка, в которой будут суммироваться цифры
     * @return сумма всех найденных цифр; 0, если цифр нет
     */
    public static int secondTask(String s) {
        int length = s.length();
        int sum = 0;
        for(int i = 0; i < length; i++) {
            if(Character.isDigit(s.charAt(i))) {
                sum += Character.getNumericValue(s.charAt(i));
            }
        }
        return sum;
    }

    /**
     * Находит длину самой длинной последовательности одинаковых символов в строке.
     *
     * @param s строка, в которой будет искаться самая длинная последовательность
     * @return длина самой длинной последовательности одинаковых символов
     */
    public static int thirdTask(String s) {
        int count = 1;
        int sum = 1;
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                if(count > sum){
                    sum = count;
                }
                count = 1;
            }
        }
        if(count > sum){
            sum = count;
        }
        return sum;
    }

    /**
     * Выводит слова из строки, разделяя их на отдельные строки.
     *
     * @param s строка, из которой будут извлекаться слова
     */
    public static void fourthTask(String s) {
        System.out.println("\nСлова:");
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                System.out.print("\n");
            } else {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println("\n");
    }

    /**
     * Объединяет символы двух строк, чередуя их.
     *
     * @param a первая строка
     * @param b вторая строка
     * @return строка, состоящая из чередующихся символов обеих строк
     */
    public static String fiveTask(String a, String b) {
        String result = "";
        int maxSize;
        if(a.length() > b.length()) {
            maxSize = a.length();
        } else {
            maxSize = b.length();
        }

        for (int i = 0; i < maxSize; i++) {
            if (i < a.length()) {
                result += a.charAt(i);
            }
            if (i < b.length()) {
                result += b.charAt(i);
            }
        }
        return result.toString();
    }
}
