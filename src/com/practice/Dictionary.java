package com.practice;

import java.util.ArrayList;

public class Dictionary {
    private ArrayList<Definition> list; //when the object is initialized, it will take this field; this field will belong to the object!!!

    public Dictionary() {
        this.list = new ArrayList<Definition>();
    }

    public void newEntry(String key, String value) {
        this.list.add(new Definition(key, value)); //I'm using field from this class!
    }

    public String look(String key) {
        for(Definition i : this.list) {  //this list field will belong to the object!!!
            if(i.getWord().contains(key)) {
                return i.getDefinition();
            }
        }
        return "Cant find entry for " + key;
    }
}

class Definition {
    private String word, definition;

    public String getWord() {return word;}
    public String getDefinition() {return definition;}

    public Definition(String key, String value) {
        this.word = key;
        this.definition = value;
    }
}