package com.example.anonotationnormal.yiibai;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/9/28 9:31 下午
 * @description
 */

public class TextEditor {
    private SpellChecker spellChecker;

    @Autowired
    public void setSpellChecker( SpellChecker spellChecker ){
        this.spellChecker = spellChecker;
    }
    public SpellChecker getSpellChecker( ) {
        return spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
