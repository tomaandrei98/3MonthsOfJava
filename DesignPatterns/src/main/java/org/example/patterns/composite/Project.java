package org.example.patterns.composite;

import java.util.List;

public class Project implements ToDoList {
    private String title;
    private List<ToDoList> todos;

    public Project(String title, List<ToDoList> todos) {
        this.title = title;
        this.todos = todos;
    }

    @Override
    public String getHtml() {
        StringBuilder html = new StringBuilder("<h1>");
        html.append(title);
        html.append("</h1> <ul>");
        for (ToDoList tl : todos) {
            html.append("<li>");
            html.append(tl.getHtml());
            html.append("</li>");
        }
        html.append("</ul>");
        return html.toString();
    }
}
