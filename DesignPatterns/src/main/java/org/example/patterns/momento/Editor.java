package org.example.patterns.momento;

public class Editor {
    private String content;
    private History history = new History();

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
        updateHistory();
        System.out.println("Historical changes: " + history.getStates());
    }

    private void updateHistory() {
        EditorState tempState = createState();
        history.push(tempState);
    }

    private EditorState createState() {
        return new EditorState(content);
    }

    public void restore() {
        try {
            String undoState = getAnOlderState(history);
            setContent(undoState);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private String getAnOlderState(History history) {
        if (history.getStates().size() == 1) {
            throw new IllegalArgumentException("No older version available!");
        }
        history.pop();
        return history.pop().getContent();
    }

}
