package com.example.svgsupporter.richpathanimator;


import android.animation.TypeEvaluator;

import com.example.svgsupporter.richpath.pathparser.PathDataNode;
import com.example.svgsupporter.richpath.pathparser.PathParserCompat;


public class PathEvaluator implements TypeEvaluator<PathDataNode[]> {

    private PathDataNode[] evaluatedNodes;

    @Override
    public PathDataNode[] evaluate(float fraction, PathDataNode[] startPathDataNodes, PathDataNode[] endPathDataNodes) {

        if (evaluatedNodes == null) {
            evaluatedNodes = PathParserCompat.deepCopyNodes(startPathDataNodes);
        }

        for (int i = 0; i < startPathDataNodes.length; i++) {
            for (int j = 0; j < startPathDataNodes[i].getParams().length; j++) {
                float startFloat = startPathDataNodes[i].getParams()[j];
                float value = startFloat + fraction * (endPathDataNodes[i].getParams()[j] - startFloat);
                evaluatedNodes[i].getParams()[j] = value;
            }
        }

        return evaluatedNodes;
    }


}
