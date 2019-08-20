package com.leonardostevendev.masivian.binarytree;

import com.leonardostevendev.masivian.binarytree.structure.Tree;

import java.util.HashMap;

public class DataStoreSimulator {
    private static DataStoreSimulator dataStore;
    private HashMap<String, Tree> arboles;

    private DataStoreSimulator(HashMap<String, Tree> arboles) {
        this.arboles = new HashMap<>();
    }

    public static DataStoreSimulator getDataStoreInstance() {
        if (dataStore == null)
            dataStore = new DataStoreSimulator(new HashMap<>());
        return dataStore;
    }


}
