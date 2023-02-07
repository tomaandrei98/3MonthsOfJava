package org.example.patterns.bridge;

public abstract class View {
    protected IResource resource;

    public View(IResource resource) {
        this.resource = resource;
    }

    public abstract String show();
}
