package work.bracceChecker;

public class BraceChecker {

    private final String text;
    private final Stack stack = new Stack();

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case '[':
                case '{':
                case '(':
                    stack.push(text.charAt(i));
                    break;
                case ')':
                case '}':
                case ']':
                    if (stack.arraySize() < 0) {
                        System.out.println("Error: closed " + text.charAt(i) + " at " + i);
                        break;
                    }
                    char pop = stack.pop();
                    if (pop == '(' && text.charAt(i) == ')') {
                        System.out.println("It is true: opened " + pop + " closed " + text.charAt(i));
                        break;
                    }
                    if (pop == '{' && text.charAt(i) == '}') {
                        System.out.println("It is true: opened " + pop + " closed " + text.charAt(i));
                        break;
                    }
                    if (pop == '[' && text.charAt(i) == ']') {
                        System.out.println("It is true: opened " + pop + " closed " + text.charAt(i));
                        break;
                    }
                    if (pop != text.charAt(i)) {
                        System.out.println("Error: opened " + pop + " but closed " + text.charAt(i) + " at " + i);
                        break;
                    }
            }
        }
//        char pop = stack.pop();
//        switch (pop) {
//            case '[':
//            case '{':
//            case '(':
//                System.out.println("It is false: opened " + stack.pop() + " and don't closed");
//        }
    }
}
