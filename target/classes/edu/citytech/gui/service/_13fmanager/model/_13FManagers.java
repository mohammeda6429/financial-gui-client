package edu.citytech.gui.service._13fmanager.model;

import edu.citytech.gui.service._13fmanager.model._13FDetails;

import java.util.Arrays;
import java.util.List;

public class _13FManagers {
    private int size;
    private List<_13FDetails> results;

    public int getSize(){

        return size;
    }

    public List<_13FDetails> getResults() {

        return results;
    }

    @Override
    public String toString() {
        return "_13FManagers{" +
                "size=" + size +
                ", results=" + results +
                '}' ;
    }
}