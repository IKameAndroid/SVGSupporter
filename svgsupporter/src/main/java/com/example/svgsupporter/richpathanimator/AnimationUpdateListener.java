package com.example.svgsupporter.richpathanimator;


import com.example.svgsupporter.richpath.RichPath;

public interface AnimationUpdateListener {

    /**
     * Callback method to get the current animated path and the current animated value.
     *
     * @param path  the current animated path
     * @param value the current animated value.
     */
    void update(RichPath path, float value);
}
