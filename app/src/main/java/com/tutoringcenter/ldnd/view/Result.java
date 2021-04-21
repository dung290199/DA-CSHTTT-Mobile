package com.tutoringcenter.ldnd.view;

import android.app.Activity;

import com.tutoringcenter.ldnd.dao.DictionaryDaoImpl;
import com.tutoringcenter.ldnd.models.Word;

public class Result extends Activity {
    public static void main(String[] args) {
        DictionaryDaoImpl a=new DictionaryDaoImpl();
        Word w=a.getWord("anh_viet","loan");
        System.out.println(w.getWord());
    }
}
