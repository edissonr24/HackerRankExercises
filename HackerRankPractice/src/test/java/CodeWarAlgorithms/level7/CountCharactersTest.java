package com.java.CodeWarAlgorithms.level7;

import com.java.CodeWarAlgorithms.Kata;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import org.junit.jupiter.api.*;

public class CountCharactersTest {

    @Test
    @Order(1)
    public void testEmptyString() {
        Map<Character, Integer> d = new HashMap<>();
        assertEquals(d, CountCharacters.count(""));
    }

    @Test
    @Order(2)
    public void testSingleCharacter() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 1);
        assertEquals(d, CountCharacters.count("a"));
    }

    @Test
    @Order(3)
    public void testMultipleCharacters() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 3);
        d.put('b', 3);
        d.put('c', 1);
        assertEquals(d, CountCharacters.count("aabbbac"));
    }

    @Test
    @Order(4)
    public void testAllCharactersUnique() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 1);
        d.put('b', 1);
        d.put('c', 1);
        assertEquals(d, CountCharacters.count("abc"));
    }

    @Test
    @Order(5)
    public void testAllCharactersSame() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 5);
        assertEquals(d, CountCharacters.count("aaaaa"));
    }

    @Test
    @Order(6)
    public void testDifferentCharacters() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 2);
        expected.put('b', 2);
        Map<Character, Integer> actual = CountCharacters.count("aabb");
        assertEquals(expected, actual);
    }

}