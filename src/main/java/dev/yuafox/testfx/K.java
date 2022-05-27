package dev.yuafox.testfx;

import dev.yuafox.testfx.logic.Enigma;

import java.util.ArrayList;
import java.util.List;

public class K {

    public static final K instance = new K();

    private final List<Enigma> enigmas;

    public K(){
        this.enigmas = new ArrayList<>();
    }
}
