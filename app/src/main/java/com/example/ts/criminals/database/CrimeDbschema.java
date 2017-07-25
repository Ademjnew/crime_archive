package com.example.ts.criminals.database;

/**
 * Created by TS on 09/07/2017.
 */

public class CrimeDbschema {
    public static final class CrimeTable {
        public static final String NAME = "crimes";
        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
            public static final String SUSPECT="suspect";
        }
    }
}
