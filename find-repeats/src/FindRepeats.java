public class FindRepeats {
    int numberOfRepeats(String text, String substring) { // "раз, раз, раз", "раз"
        int count = 0;
        while (text.contains(substring)) {
            count++;
            // text.indexOf(substring) + substring.length()  индекс символа, cледующего за найденой подстрокой
            text = text.substring(text.indexOf(substring) + substring.length()); // возвращает символы,
                                                                                        // начиная с указанного индекса
        }
        return count;
    }
}