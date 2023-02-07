package org.example.patterns.bridge;

public class ShortFormView extends View {

    public ShortFormView(IResource resource) {
        super(resource);
    }

    @Override
    public String show() {
        resource.snippet();
        resource.title();
        resource.image();
        resource.url();
        return "<h1> Short Form View </h1>";
    }

}
