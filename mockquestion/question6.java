package mockquestion;

import java.util.Stack;

public class question6 {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.addText("Hello");
        System.out.println("Current Text: " + editor.getCurrentText()); // Output: Hello
        
        editor.addText(", World!");
        System.out.println("Current Text: " + editor.getCurrentText()); // Output: Hello, World!
        
        editor.undo();
        System.out.println("After undo: " + editor.getCurrentText()); // Output: Hello
        
        editor.undo();
        System.out.println("After undo: " + editor.getCurrentText()); // Output: 
    }
}

// question 6
class TextEditor {
    private Stack<String> textStack;
    private String currentText;

    public TextEditor() {
        textStack = new Stack<>();
        currentText = "";
    }

    public void addText(String text) {
        textStack.push(currentText);
        currentText += text;
    }

    public void undo() {
        if (!textStack.isEmpty()) {
            currentText = textStack.pop();
        } else {
            System.out.println("No more undo operations available.");
        }
    }

    public String getCurrentText() {
        return currentText;
    }
}
