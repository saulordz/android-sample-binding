package com.virtroop.simpledatabinding;

/**
 * Created by kletuz on 7/11/2017.
 */

public class SimplePOJO {

    private String _sampleText;

    public SimplePOJO(String sampleText){
        _sampleText = sampleText;
    }

    public String getText(){
        return _sampleText;
    }

    public void setText(String sampleText) {
        _sampleText = sampleText;
    }
}
