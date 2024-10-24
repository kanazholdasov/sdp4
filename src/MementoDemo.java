public class MementoDemo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.setText("Hello");
        history.save(editor.save());

        editor.setText("Hello World");
        history.save(editor.save());

        System.out.println("Current Text: " + editor.getText());
        editor.restore(history.undo());
        System.out.println("After undo: " + editor.getText());
        editor.restore(history.undo());
        System.out.println("After second undo: " + editor.getText());
    }
}
