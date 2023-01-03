package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import java.nio.file.Paths;

public class MP3UtilTest extends TestCase {

    @Test
    public void testGetArtist() {
        String artist = MP3Util.getArtist(Paths.get("C:\\Users\\Toma\\IDEA Projects\\maven-tutorial\\NANE - LA PIEPT.mp3"));
        assertEquals("NANE", artist);
    }

    @Test
    public void testGetComposer() {
        String composer = MP3Util.getComposer(Paths.get("C:\\Users\\Toma\\IDEA Projects\\maven-tutorial\\NANE - LA PIEPT.mp3"));
        assertEquals("Paul Iorga", composer);
    }
}