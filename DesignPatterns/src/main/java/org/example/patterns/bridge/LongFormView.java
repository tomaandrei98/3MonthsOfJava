package org.example.patterns.bridge;

public class LongFormView extends View {

    public LongFormView(IResource resource) {
        super(resource);
    }

    @Override
    public String show() {
        resource.snippet();
        resource.title();
        resource.image();
        resource.url();
        return "<h1> Long Form View </h1>";
    }
}
