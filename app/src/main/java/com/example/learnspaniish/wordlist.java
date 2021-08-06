package com.example.learnspaniish;

public class wordlist {
    private String spanishword;
    private String defaultword;
    private int imageresourceid=NO_IMAGE_FOUND;
    private  static final int NO_IMAGE_FOUND=-1;


    public wordlist(String spanishword, String defaultword) {
        this.spanishword = spanishword;
        this.defaultword = defaultword;
    }

    public wordlist(String spanishword, String defaultword, int imageresourceid) {
        this.spanishword = spanishword;
        this.defaultword = defaultword;
        this.imageresourceid = imageresourceid;
    }

    public int getImageresourceid() { return imageresourceid; }

    public String getSpanishword() {
        return spanishword;
    }

    public String getDefaultword() {
        return defaultword;
    }

    public boolean hasImage()
    {
        return imageresourceid != NO_IMAGE_FOUND;
    }
}
