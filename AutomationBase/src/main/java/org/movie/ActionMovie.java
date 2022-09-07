package org.movie;

public class ActionMovie extends Movie{

    private String classification;
    public ActionMovie(){

    }

    public ActionMovie(ActionMovie clone)
    {
        super(clone);
        if(clone != null)
        {
            this.classification = clone.classification;
        }
    }

    @Override
    public Movie clone() {
        return new ActionMovie(this);
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }
}
