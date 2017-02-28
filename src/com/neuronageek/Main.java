package com.neuronageek;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        RtRandomForest instance = new RtRandomForest( );
        ArrayList< Prediction > predictions = new ArrayList<>( );
        instance.runClassifiers( predictions );

        for( Prediction p : predictions ){
            System.out.println( p );
        }
    }
}
