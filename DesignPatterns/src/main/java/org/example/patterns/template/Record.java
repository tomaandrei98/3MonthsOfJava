package org.example.patterns.template;

public abstract class Record {
    //template method
    public void save() {
        this.validate();
        this.beforeSave();
        //query saves to DB
        this.afterSave();
    }
    public abstract void validate();
    public void beforeSave(){
        // virtual default implementation
    }
    public void afterSave(){
        // virtual default implementation
    }
}
