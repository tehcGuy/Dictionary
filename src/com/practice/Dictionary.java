package com.practice;
import java.util.ArrayList;

/*
One of the principles of object-oriented programming is encapsulation. It says that one should hide the internal structure
 of the object and prevent direct access to it.

In your case this means that those who use your class should not "know" whether your class Dictionary uses ArrayList or
Map or something other to store elements.
That's why option 1 is better.

One of benefits of such approach is that you can change the implementation of the class Dictionary whenever you wish,
e.g. you may decide to use a tree structure instead of list, and all who use your class will not need to modify their code.
*/

public class Dictionary {
    private ArrayList<Definition> list; //when the object is initialized, it will take this field; this field will belong to the object!!!

    public Dictionary() {
        this.list = new ArrayList<>();
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