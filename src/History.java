import java.util.Stack;

class History {
    private Stack<Memento> mementoStack = new Stack<>();

    public void save(Memento memento) {
        mementoStack.push(memento);
    }

    public Memento undo() {
        if (!mementoStack.isEmpty()) {
            return mementoStack.pop();
        }
        return null;
    }
}
