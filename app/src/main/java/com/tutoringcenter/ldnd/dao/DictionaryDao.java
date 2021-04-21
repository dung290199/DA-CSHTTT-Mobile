/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutoringcenter.ldnd.dao;

import com.tutoringcenter.ldnd.models.Word;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/**
 *
 * @author ADMIN
 */
public interface DictionaryDao {

    Word getWord(String name, String word);

    Map<String, String> getWords(String name, String word);

    public Map<String, String> getAll(String dic);
}
