package work.bracceChecker;

public class BraceChecker extends Stack {

    private final String text;
    private final Stack stack = new Stack();

    public BraceChecker(String text) {
        this.text = text;
    }


    public void check() {
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            switch (ch) {
                case '[':
                case '{':
                case '(':
                    stack.push(ch);
                    break;
                case ')':
                case '}':
                case ']':
                    if (stack.isEmpty()) {
                        System.out.println("Error: closed " + ch + " at " + i);
                        break;
                    }
                    char pop = stack.pop();
                    if (pop == '(' && ch == ')' || pop == '{' && ch == '}' || pop == '[' && ch == ']') {
                        System.out.println("It is true: opened " + pop + " closed " + ch + " at " + i);
                    } else {
                        System.out.println("Error: opened " + pop + " but closed " + ch + " at " + i);
                    }
                    break;
            }
        }
        if (!stack.isEmpty()){
            System.out.println("Error: brackets are not closed");
        }
    }
}
