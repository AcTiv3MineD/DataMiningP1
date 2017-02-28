

package com.neuronageek;

import java.util.List;

public class RtRandomForest extends RandomForest {

    public String bars;
    public String gold;
    public String text;
    public String crescent;
    public String landmass;
    public String zone;
    public double area;
    public String colours;
    public String black;
    public String white;
    public double population;
    public String red;
    public String circles;
    public String stripes;
    public String sunstars;
    public String botright;
    public String saltires;
    public String icon;
    public String topleft;
    public String language;
    public String green;
    public String mainhue;

    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("MyClass: ");
        b.append(MyClass);
        b.append(", bars: ");
        b.append(bars);
        b.append(", gold: ");
        b.append(gold);
        b.append(", text: ");
        b.append(text);
        b.append(", crescent: ");
        b.append(crescent);
        b.append(", landmass: ");
        b.append(landmass);
        b.append(", zone: ");
        b.append(zone);
        b.append(", area: ");
        b.append(area);
        b.append(", colours: ");
        b.append(colours);
        b.append(", black: ");
        b.append(black);
        b.append(", white: ");
        b.append(white);
        b.append(", population: ");
        b.append(population);
        b.append(", red: ");
        b.append(red);
        b.append(", circles: ");
        b.append(circles);
        b.append(", stripes: ");
        b.append(stripes);
        b.append(", sunstars: ");
        b.append(sunstars);
        b.append(", botright: ");
        b.append(botright);
        b.append(", saltires: ");
        b.append(saltires);
        b.append(", icon: ");
        b.append(icon);
        b.append(", topleft: ");
        b.append(topleft);
        b.append(", language: ");
        b.append(language);
        b.append(", green: ");
        b.append(green);
        b.append(", mainhue: ");
        b.append(mainhue);
        return b.toString();
    }

    protected void runClassifiers(List<Prediction> predictions) {
        predictions.add(runTree0());
    }

    private Prediction runTree0() {
        if( area >= 20 ) {
            if( "green".equals(mainhue) ) {
                if( "2".equals(language) ) { return new Prediction("0", 1, 0); }
                if( "8".equals(language) ) { return new Prediction("2", 5, 0); }
                if( "1".equals(language) ) {
                    if( population < 0.5 ) { return new Prediction("1", 1, 0); }
                    if( population >= 0.5 ) {
                        if( "7".equals(colours) ) { return new Prediction("0", 0, 0); }
                        if( "5".equals(colours) ) { return new Prediction("4", 1, 0); }
                        if( "4".equals(colours) ) { return new Prediction("0", 0, 0); }
                        if( "3".equals(colours) ) { return new Prediction("5", 1, 0); }
                        if( "1".equals(colours) ) { return new Prediction("0", 0, 0); }
                        if( "8".equals(colours) ) { return new Prediction("0", 0, 0); }
                        if( "2".equals(colours) ) { return new Prediction("0", 0, 0); }
                        if( "6".equals(colours) ) { return new Prediction("0", 0, 0); }
                    }
                }
                if( "7".equals(language) ) { return new Prediction("0", 0, 0); }
                if( "5".equals(language) ) { return new Prediction("0", 0, 0); }
                if( "9".equals(language) ) { return new Prediction("0", 0, 0); }
                if( "4".equals(language) ) { return new Prediction("0", 0, 0); }
                if( "10".equals(language) ) {
                    if( "green".equals(botright) ) {
                        if( "1".equals(white) ) {
                            if( population < 12 ) { return new Prediction("5", 1, 0); }
                            if( population >= 12 ) { return new Prediction("2", 2, 0); }
                        }
                        if( "0".equals(white) ) { return new Prediction("5", 1, 0); }
                    }
                    if( "gold".equals(botright) ) { return new Prediction("0", 0, 0); }
                    if( "orange".equals(botright) ) { return new Prediction("0", 0, 0); }
                    if( "blue".equals(botright) ) { return new Prediction("5", 2, 0); }
                    if( "black".equals(botright) ) { return new Prediction("0", 0, 0); }
                    if( "white".equals(botright) ) { return new Prediction("0", 0, 0); }
                    if( "red".equals(botright) ) {
                        if( population >= 15.5 ) { return new Prediction("1", 1, 0); }
                        if( population < 15.5 ) { return new Prediction("5", 1, 0); }
                    }
                    if( "brown".equals(botright) ) { return new Prediction("5", 1, 0); }
                }
                if( "3".equals(language) ) {
                    if( "4".equals(zone) ) { return new Prediction("2", 1, 0); }
                    if( "2".equals(zone) ) { return new Prediction("0", 0, 0); }
                    if( "3".equals(zone) ) { return new Prediction("0", 0, 0); }
                    if( "1".equals(zone) ) {
                        if( "7".equals(colours) ) { return new Prediction("0", 0, 0); }
                        if( "5".equals(colours) ) { return new Prediction("0", 0, 0); }
                        if( "4".equals(colours) ) { return new Prediction("7", 1, 0); }
                        if( "3".equals(colours) ) { return new Prediction("0", 0, 0); }
                        if( "1".equals(colours) ) { return new Prediction("0", 0, 0); }
                        if( "8".equals(colours) ) { return new Prediction("0", 0, 0); }
                        if( "2".equals(colours) ) { return new Prediction("5", 1, 0); }
                        if( "6".equals(colours) ) { return new Prediction("0", 0, 0); }
                    }
                }
                if( "6".equals(language) ) {
                    if( "4".equals(zone) ) { return new Prediction("0", 0, 0); }
                    if( "2".equals(zone) ) { return new Prediction("0", 0, 0); }
                    if( "3".equals(zone) ) { return new Prediction("0", 1, 0); }
                    if( "1".equals(zone) ) { return new Prediction("2", 2, 0); }
                }
            }
            if( "red".equals(mainhue) ) {
                if( "0".equals(gold) ) {
                    if( "4".equals(sunstars) ) { return new Prediction("0", 0, 0); }
                    if( "7".equals(sunstars) ) { return new Prediction("0", 0, 0); }
                    if( "14".equals(sunstars) ) { return new Prediction("3", 1, 0); }
                    if( "3".equals(sunstars) ) {
                        if( "green".equals(topleft) ) { return new Prediction("0", 0, 0); }
                        if( "white".equals(topleft) ) { return new Prediction("5", 1, 0); }
                        if( "gold".equals(topleft) ) { return new Prediction("0", 0, 0); }
                        if( "red".equals(topleft) ) { return new Prediction("2", 1, 0); }
                        if( "black".equals(topleft) ) { return new Prediction("0", 0, 0); }
                        if( "orange".equals(topleft) ) { return new Prediction("0", 0, 0); }
                        if( "blue".equals(topleft) ) { return new Prediction("0", 0, 0); }
                    }
                    if( "6".equals(sunstars) ) { return new Prediction("0", 0, 0); }
                    if( "50".equals(sunstars) ) { return new Prediction("0", 0, 0); }
                    if( "15".equals(sunstars) ) { return new Prediction("0", 0, 0); }
                    if( "9".equals(sunstars) ) { return new Prediction("0", 0, 0); }
                    if( "10".equals(sunstars) ) { return new Prediction("0", 0, 0); }
                    if( "5".equals(sunstars) ) { return new Prediction("0", 0, 0); }
                    if( "0".equals(sunstars) ) {
                        if( "4".equals(zone) ) { return new Prediction("1", 2, 0); }
                        if( "2".equals(zone) ) {
                            if( area >= 1245.5 ) { return new Prediction("2", 1, 0); }
                            if( area < 1245.5 ) { return new Prediction("1", 1, 0); }
                        }
                        if( "3".equals(zone) ) { return new Prediction("0", 1, 0); }
                        if( "1".equals(zone) ) {
                            if( "3".equals(landmass) ) {
                                if( "1".equals(green) ) { return new Prediction("6", 1, 0); }
                                if( "0".equals(green) ) {
                                    if( "2".equals(language) ) { return new Prediction("0", 0, 0); }
                                    if( "8".equals(language) ) { return new Prediction("0", 0, 0); }
                                    if( "1".equals(language) ) { return new Prediction("0", 0, 0); }
                                    if( "7".equals(language) ) { return new Prediction("0", 0, 0); }
                                    if( "5".equals(language) ) { return new Prediction("0", 0, 0); }
                                    if( "9".equals(language) ) { return new Prediction("0", 0, 0); }
                                    if( "4".equals(language) ) {
                                        if( area < 62.5 ) { return new Prediction("1", 1, 0); }
                                        if( area >= 62.5 ) { return new Prediction("0", 1, 0); }
                                    }
                                    if( "10".equals(language) ) { return new Prediction("0", 0, 0); }
                                    if( "3".equals(language) ) { return new Prediction("0", 0, 0); }
                                    if( "6".equals(language) ) { return new Prediction("1", 3, 0); }
                                }
                            }
                            if( "1".equals(landmass) ) { return new Prediction("0", 0, 0); }
                            if( "5".equals(landmass) ) {
                                if( "2".equals(language) ) { return new Prediction("0", 0, 0); }
                                if( "8".equals(language) ) { return new Prediction("2", 1, 0); }
                                if( "1".equals(language) ) { return new Prediction("0", 0, 0); }
                                if( "7".equals(language) ) { return new Prediction("0", 0, 0); }
                                if( "5".equals(language) ) { return new Prediction("0", 0, 0); }
                                if( "9".equals(language) ) { return new Prediction("0", 0, 0); }
                                if( "4".equals(language) ) { return new Prediction("0", 0, 0); }
                                if( "10".equals(language) ) {
                                    if( "4".equals(stripes) ) { return new Prediction("0", 0, 0); }
                                    if( "13".equals(stripes) ) { return new Prediction("0", 0, 0); }
                                    if( "3".equals(stripes) ) { return new Prediction("6", 1, 0); }
                                    if( "0".equals(stripes) ) { return new Prediction("0", 0, 0); }
                                    if( "6".equals(stripes) ) { return new Prediction("0", 0, 0); }
                                    if( "1".equals(stripes) ) { return new Prediction("0", 0, 0); }
                                    if( "5".equals(stripes) ) { return new Prediction("3", 1, 0); }
                                    if( "14".equals(stripes) ) { return new Prediction("0", 0, 0); }
                                    if( "11".equals(stripes) ) { return new Prediction("0", 0, 0); }
                                    if( "9".equals(stripes) ) { return new Prediction("0", 0, 0); }
                                    if( "2".equals(stripes) ) { return new Prediction("0", 0, 0); }
                                    if( "7".equals(stripes) ) { return new Prediction("0", 0, 0); }
                                }
                                if( "3".equals(language) ) { return new Prediction("0", 0, 0); }
                                if( "6".equals(language) ) { return new Prediction("2", 1, 0); }
                            }
                            if( "4".equals(landmass) ) {
                                if( "4".equals(circles) ) { return new Prediction("0", 0, 0); }
                                if( "0".equals(circles) ) { return new Prediction("2", 1, 0); }
                                if( "2".equals(circles) ) { return new Prediction("0", 0, 0); }
                                if( "1".equals(circles) ) { return new Prediction("5", 1, 0); }
                            }
                            if( "2".equals(landmass) ) { return new Prediction("0", 0, 0); }
                            if( "6".equals(landmass) ) { return new Prediction("0", 0, 0); }
                        }
                    }
                    if( "1".equals(sunstars) ) {
                        if( "green".equals(topleft) ) { return new Prediction("0", 0, 0); }
                        if( "white".equals(topleft) ) { return new Prediction("0", 0, 0); }
                        if( "gold".equals(topleft) ) { return new Prediction("0", 0, 0); }
                        if( "red".equals(topleft) ) { return new Prediction("2", 5, 0); }
                        if( "black".equals(topleft) ) { return new Prediction("5", 1, 0); }
                        if( "orange".equals(topleft) ) { return new Prediction("0", 0, 0); }
                        if( "blue".equals(topleft) ) {
                            if( "4".equals(stripes) ) { return new Prediction("0", 0, 0); }
                            if( "13".equals(stripes) ) { return new Prediction("0", 0, 0); }
                            if( "3".equals(stripes) ) { return new Prediction("0", 0, 0); }
                            if( "0".equals(stripes) ) { return new Prediction("3", 1, 0); }
                            if( "6".equals(stripes) ) { return new Prediction("0", 0, 0); }
                            if( "1".equals(stripes) ) { return new Prediction("0", 0, 0); }
                            if( "5".equals(stripes) ) { return new Prediction("0", 0, 0); }
                            if( "14".equals(stripes) ) { return new Prediction("0", 0, 0); }
                            if( "11".equals(stripes) ) { return new Prediction("5", 1, 0); }
                            if( "9".equals(stripes) ) { return new Prediction("0", 0, 0); }
                            if( "2".equals(stripes) ) { return new Prediction("0", 1, 0); }
                            if( "7".equals(stripes) ) { return new Prediction("0", 0, 0); }
                        }
                    }
                    if( "2".equals(sunstars) ) {
                        if( "1".equals(black) ) { return new Prediction("2", 1, 0); }
                        if( "0".equals(black) ) { return new Prediction("0", 1, 0); }
                    }
                    if( "22".equals(sunstars) ) { return new Prediction("0", 0, 0); }
                }
                if( "1".equals(gold) ) {
                    if( "4".equals(zone) ) {
                        if( "1".equals(icon) ) { return new Prediction("0", 2, 0); }
                        if( "0".equals(icon) ) {
                            if( "3".equals(landmass) ) { return new Prediction("0", 1, 0); }
                            if( "1".equals(landmass) ) { return new Prediction("0", 0, 0); }
                            if( "5".equals(landmass) ) { return new Prediction("0", 0, 0); }
                            if( "4".equals(landmass) ) { return new Prediction("5", 2, 0); }
                            if( "2".equals(landmass) ) { return new Prediction("1", 1, 0); }
                            if( "6".equals(landmass) ) { return new Prediction("0", 0, 0); }
                        }
                    }
                    if( "2".equals(zone) ) { return new Prediction("5", 3, 0); }
                    if( "3".equals(zone) ) { return new Prediction("0", 2, 0); }
                    if( "1".equals(zone) ) {
                        if( "green".equals(botright) ) { return new Prediction("0", 0, 0); }
                        if( "gold".equals(botright) ) { return new Prediction("0", 0, 0); }
                        if( "orange".equals(botright) ) { return new Prediction("0", 0, 0); }
                        if( "blue".equals(botright) ) { return new Prediction("0", 0, 0); }
                        if( "black".equals(botright) ) { return new Prediction("0", 0, 0); }
                        if( "white".equals(botright) ) { return new Prediction("2", 1, 0); }
                        if( "red".equals(botright) ) {
                            if( "3".equals(landmass) ) { return new Prediction("6", 4, 0); }
                            if( "1".equals(landmass) ) { return new Prediction("0", 0, 0); }
                            if( "5".equals(landmass) ) {
                                if( "2".equals(language) ) { return new Prediction("0", 0, 0); }
                                if( "8".equals(language) ) { return new Prediction("0", 0, 0); }
                                if( "1".equals(language) ) { return new Prediction("0", 0, 0); }
                                if( "7".equals(language) ) { return new Prediction("6", 1, 0); }
                                if( "5".equals(language) ) { return new Prediction("6", 1, 0); }
                                if( "9".equals(language) ) { return new Prediction("0", 0, 0); }
                                if( "4".equals(language) ) { return new Prediction("0", 0, 0); }
                                if( "10".equals(language) ) {
                                    if( "1".equals(crescent) ) { return new Prediction("6", 1, 0); }
                                    if( "0".equals(crescent) ) {
                                        if( population < 33 ) { return new Prediction("3", 1, 0); }
                                        if( population >= 33 ) { return new Prediction("6", 1, 0); }
                                    }
                                }
                                if( "3".equals(language) ) { return new Prediction("0", 0, 0); }
                                if( "6".equals(language) ) { return new Prediction("0", 0, 0); }
                            }
                            if( "4".equals(landmass) ) { return new Prediction("0", 0, 0); }
                            if( "2".equals(landmass) ) { return new Prediction("0", 0, 0); }
                            if( "6".equals(landmass) ) { return new Prediction("0", 0, 0); }
                        }
                        if( "brown".equals(botright) ) { return new Prediction("0", 0, 0); }
                    }
                }
            }
            if( "brown".equals(mainhue) ) { return new Prediction("4", 1, 0); }
            if( "orange".equals(mainhue) ) {
                if( "3".equals(landmass) ) { return new Prediction("0", 0, 0); }
                if( "1".equals(landmass) ) { return new Prediction("0", 0, 0); }
                if( "5".equals(landmass) ) {
                    if( "1".equals(red) ) { return new Prediction("3", 1, 0); }
                    if( "0".equals(red) ) { return new Prediction("4", 1, 0); }
                }
                if( "4".equals(landmass) ) {
                    if( "2".equals(language) ) { return new Prediction("0", 0, 0); }
                    if( "8".equals(language) ) { return new Prediction("0", 0, 0); }
                    if( "1".equals(language) ) { return new Prediction("0", 0, 0); }
                    if( "7".equals(language) ) { return new Prediction("0", 0, 0); }
                    if( "5".equals(language) ) { return new Prediction("0", 0, 0); }
                    if( "9".equals(language) ) { return new Prediction("0", 0, 0); }
                    if( "4".equals(language) ) { return new Prediction("0", 0, 0); }
                    if( "10".equals(language) ) { return new Prediction("0", 0, 0); }
                    if( "3".equals(language) ) { return new Prediction("2", 1, 0); }
                    if( "6".equals(language) ) { return new Prediction("1", 1, 0); }
                }
                if( "2".equals(landmass) ) { return new Prediction("0", 0, 0); }
                if( "6".equals(landmass) ) { return new Prediction("0", 0, 0); }
            }
            if( "gold".equals(mainhue) ) {
                if( "4".equals(stripes) ) { return new Prediction("0", 0, 0); }
                if( "13".equals(stripes) ) { return new Prediction("0", 0, 0); }
                if( "3".equals(stripes) ) {
                    if( "3".equals(landmass) ) { return new Prediction("6", 1, 0); }
                    if( "1".equals(landmass) ) { return new Prediction("0", 0, 0); }
                    if( "5".equals(landmass) ) { return new Prediction("0", 0, 0); }
                    if( "4".equals(landmass) ) { return new Prediction("0", 0, 0); }
                    if( "2".equals(landmass) ) { return new Prediction("0", 2, 0); }
                    if( "6".equals(landmass) ) { return new Prediction("0", 0, 0); }
                }
                if( "0".equals(stripes) ) {
                    if( "3".equals(landmass) ) { return new Prediction("0", 1, 0); }
                    if( "1".equals(landmass) ) { return new Prediction("0", 0, 0); }
                    if( "5".equals(landmass) ) { return new Prediction("3", 1, 0); }
                    if( "4".equals(landmass) ) {
                        if( "green".equals(botright) ) { return new Prediction("2", 1, 0); }
                        if( "gold".equals(botright) ) {
                            if( population < 5 ) { return new Prediction("5", 1, 0); }
                            if( population >= 5 ) { return new Prediction("1", 1, 0); }
                        }
                        if( "orange".equals(botright) ) { return new Prediction("0", 0, 0); }
                        if( "blue".equals(botright) ) { return new Prediction("0", 0, 0); }
                        if( "black".equals(botright) ) { return new Prediction("0", 0, 0); }
                        if( "white".equals(botright) ) { return new Prediction("0", 0, 0); }
                        if( "red".equals(botright) ) {
                            if( population >= 5.5 ) { return new Prediction("2", 1, 0); }
                            if( population < 5.5 ) { return new Prediction("5", 1, 0); }
                        }
                        if( "brown".equals(botright) ) { return new Prediction("0", 0, 0); }
                    }
                    if( "2".equals(landmass) ) { return new Prediction("0", 0, 0); }
                    if( "6".equals(landmass) ) { return new Prediction("0", 0, 0); }
                }
                if( "6".equals(stripes) ) { return new Prediction("5", 1, 0); }
                if( "1".equals(stripes) ) { return new Prediction("0", 0, 0); }
                if( "5".equals(stripes) ) { return new Prediction("5", 1, 0); }
                if( "14".equals(stripes) ) { return new Prediction("0", 0, 0); }
                if( "11".equals(stripes) ) { return new Prediction("0", 0, 0); }
                if( "9".equals(stripes) ) { return new Prediction("0", 0, 0); }
                if( "2".equals(stripes) ) { return new Prediction("5", 1, 0); }
                if( "7".equals(stripes) ) { return new Prediction("0", 0, 0); }
            }
            if( "white".equals(mainhue) ) {
                if( "4".equals(zone) ) {
                    if( "green".equals(botright) ) { return new Prediction("5", 1, 0); }
                    if( "gold".equals(botright) ) { return new Prediction("0", 0, 0); }
                    if( "orange".equals(botright) ) { return new Prediction("0", 1, 0); }
                    if( "blue".equals(botright) ) { return new Prediction("0", 0, 0); }
                    if( "black".equals(botright) ) { return new Prediction("0", 0, 0); }
                    if( "white".equals(botright) ) { return new Prediction("0", 0, 0); }
                    if( "red".equals(botright) ) {
                        if( "3".equals(landmass) ) { return new Prediction("0", 0, 0); }
                        if( "1".equals(landmass) ) { return new Prediction("1", 2, 0); }
                        if( "5".equals(landmass) ) { return new Prediction("0", 0, 0); }
                        if( "4".equals(landmass) ) { return new Prediction("0", 0, 0); }
                        if( "2".equals(landmass) ) { return new Prediction("0", 1, 0); }
                        if( "6".equals(landmass) ) { return new Prediction("0", 0, 0); }
                    }
                    if( "brown".equals(botright) ) { return new Prediction("0", 0, 0); }
                }
                if( "2".equals(zone) ) { return new Prediction("0", 0, 0); }
                if( "3".equals(zone) ) { return new Prediction("0", 1, 0); }
                if( "1".equals(zone) ) {
                    if( "2".equals(language) ) { return new Prediction("0", 0, 0); }
                    if( "8".equals(language) ) { return new Prediction("0", 0, 0); }
                    if( "1".equals(language) ) { return new Prediction("0", 0, 0); }
                    if( "7".equals(language) ) { return new Prediction("0", 0, 0); }
                    if( "5".equals(language) ) { return new Prediction("6", 2, 0); }
                    if( "9".equals(language) ) {
                        if( area < 354.5 ) { return new Prediction("1", 1, 0); }
                        if( area >= 354.5 ) { return new Prediction("7", 1, 0); }
                    }
                    if( "4".equals(language) ) { return new Prediction("0", 0, 0); }
                    if( "10".equals(language) ) { return new Prediction("7", 2, 0); }
                    if( "3".equals(language) ) { return new Prediction("0", 1, 0); }
                    if( "6".equals(language) ) { return new Prediction("0", 1, 0); }
                }
            }
            if( "black".equals(mainhue) ) {
                if( "2".equals(language) ) { return new Prediction("0", 0, 0); }
                if( "8".equals(language) ) { return new Prediction("2", 2, 0); }
                if( "1".equals(language) ) { return new Prediction("5", 1, 0); }
                if( "7".equals(language) ) { return new Prediction("0", 0, 0); }
                if( "5".equals(language) ) { return new Prediction("0", 0, 0); }
                if( "9".equals(language) ) { return new Prediction("0", 0, 0); }
                if( "4".equals(language) ) { return new Prediction("1", 1, 0); }
                if( "10".equals(language) ) { return new Prediction("0", 0, 0); }
                if( "3".equals(language) ) { return new Prediction("0", 1, 0); }
                if( "6".equals(language) ) { return new Prediction("0", 0, 0); }
            }
            if( "blue".equals(mainhue) ) {
                if( "4".equals(stripes) ) { return new Prediction("0", 0, 0); }
                if( "13".equals(stripes) ) { return new Prediction("0", 0, 0); }
                if( "3".equals(stripes) ) { return new Prediction("0", 5, 0); }
                if( "0".equals(stripes) ) {
                    if( "0".equals(saltires) ) {
                        if( "green".equals(topleft) ) { return new Prediction("5", 1, 0); }
                        if( "white".equals(topleft) ) { return new Prediction("2", 1, 0); }
                        if( "gold".equals(topleft) ) { return new Prediction("0", 0, 0); }
                        if( "red".equals(topleft) ) { return new Prediction("0", 0, 0); }
                        if( "black".equals(topleft) ) { return new Prediction("0", 0, 0); }
                        if( "orange".equals(topleft) ) { return new Prediction("0", 0, 0); }
                        if( "blue".equals(topleft) ) {
                            if( "4".equals(zone) ) {
                                if( population >= 3 ) { return new Prediction("0", 2, 0); }
                                if( population < 3 ) { return new Prediction("1", 1, 0); }
                            }
                            if( "2".equals(zone) ) { return new Prediction("0", 0, 0); }
                            if( "3".equals(zone) ) { return new Prediction("0", 0, 0); }
                            if( "1".equals(zone) ) {
                                if( "2".equals(language) ) { return new Prediction("0", 0, 0); }
                                if( "8".equals(language) ) { return new Prediction("0", 0, 0); }
                                if( "1".equals(language) ) { return new Prediction("0", 0, 0); }
                                if( "7".equals(language) ) { return new Prediction("0", 0, 0); }
                                if( "5".equals(language) ) { return new Prediction("0", 0, 0); }
                                if( "9".equals(language) ) { return new Prediction("0", 0, 0); }
                                if( "4".equals(language) ) { return new Prediction("0", 0, 0); }
                                if( "10".equals(language) ) {
                                    if( "7".equals(colours) ) { return new Prediction("0", 0, 0); }
                                    if( "5".equals(colours) ) { return new Prediction("0", 0, 0); }
                                    if( "4".equals(colours) ) { return new Prediction("0", 1, 0); }
                                    if( "3".equals(colours) ) { return new Prediction("0", 0, 0); }
                                    if( "1".equals(colours) ) { return new Prediction("0", 0, 0); }
                                    if( "8".equals(colours) ) { return new Prediction("0", 0, 0); }
                                    if( "2".equals(colours) ) { return new Prediction("2", 1, 0); }
                                    if( "6".equals(colours) ) { return new Prediction("0", 0, 0); }
                                }
                                if( "3".equals(language) ) { return new Prediction("0", 0, 0); }
                                if( "6".equals(language) ) { return new Prediction("1", 1, 0); }
                            }
                        }
                    }
                    if( "1".equals(saltires) ) { return new Prediction("1", 2, 0); }
                }
                if( "6".equals(stripes) ) { return new Prediction("0", 0, 0); }
                if( "1".equals(stripes) ) { return new Prediction("0", 0, 0); }
                if( "5".equals(stripes) ) {
                    if( "4".equals(zone) ) {
                        if( area >= 83 ) { return new Prediction("6", 1, 0); }
                        if( area < 83 ) { return new Prediction("0", 1, 0); }
                    }
                    if( "2".equals(zone) ) { return new Prediction("5", 1, 0); }
                    if( "3".equals(zone) ) { return new Prediction("0", 0, 0); }
                    if( "1".equals(zone) ) { return new Prediction("6", 1, 0); }
                }
                if( "14".equals(stripes) ) { return new Prediction("0", 0, 0); }
                if( "11".equals(stripes) ) { return new Prediction("0", 0, 0); }
                if( "9".equals(stripes) ) { return new Prediction("1", 1, 0); }
                if( "2".equals(stripes) ) { return new Prediction("1", 1, 0); }
                if( "7".equals(stripes) ) { return new Prediction("0", 0, 0); }
            }
        }
        if( area < 20 ) {
            if( "4".equals(zone) ) {
                if( "2".equals(language) ) { return new Prediction("0", 1, 0); }
                if( "8".equals(language) ) { return new Prediction("0", 0, 0); }
                if( "1".equals(language) ) {
                    if( "7".equals(colours) ) { return new Prediction("1", 1, 0); }
                    if( "5".equals(colours) ) { return new Prediction("1", 2, 0); }
                    if( "4".equals(colours) ) {
                        if( "1".equals(icon) ) { return new Prediction("1", 1, 0); }
                        if( "0".equals(icon) ) {
                            if( "1".equals(green) ) { return new Prediction("5", 1, 0); }
                            if( "0".equals(green) ) { return new Prediction("1", 1, 0); }
                        }
                    }
                    if( "3".equals(colours) ) { return new Prediction("1", 7, 0); }
                    if( "1".equals(colours) ) { return new Prediction("0", 0, 0); }
                    if( "8".equals(colours) ) { return new Prediction("0", 0, 0); }
                    if( "2".equals(colours) ) { return new Prediction("0", 0, 0); }
                    if( "6".equals(colours) ) { return new Prediction("1", 6, 0); }
                }
                if( "7".equals(language) ) { return new Prediction("0", 0, 0); }
                if( "5".equals(language) ) { return new Prediction("0", 0, 0); }
                if( "9".equals(language) ) { return new Prediction("0", 0, 0); }
                if( "4".equals(language) ) { return new Prediction("0", 0, 0); }
                if( "10".equals(language) ) { return new Prediction("0", 0, 0); }
                if( "3".equals(language) ) { return new Prediction("0", 0, 0); }
                if( "6".equals(language) ) {
                    if( "3".equals(landmass) ) { return new Prediction("1", 1, 0); }
                    if( "1".equals(landmass) ) { return new Prediction("1", 1, 0); }
                    if( "5".equals(landmass) ) { return new Prediction("0", 0, 0); }
                    if( "4".equals(landmass) ) { return new Prediction("0", 1, 0); }
                    if( "2".equals(landmass) ) { return new Prediction("0", 0, 0); }
                    if( "6".equals(landmass) ) { return new Prediction("0", 0, 0); }
                }
            }
            if( "2".equals(zone) ) {
                if( "green".equals(mainhue) ) { return new Prediction("2", 1, 0); }
                if( "red".equals(mainhue) ) {
                    if( population < 0.5 ) { return new Prediction("1", 3, 0); }
                    if( population >= 0.5 ) { return new Prediction("4", 1, 0); }
                }
                if( "brown".equals(mainhue) ) { return new Prediction("0", 0, 0); }
                if( "orange".equals(mainhue) ) { return new Prediction("0", 0, 0); }
                if( "gold".equals(mainhue) ) { return new Prediction("0", 0, 0); }
                if( "white".equals(mainhue) ) { return new Prediction("0", 0, 0); }
                if( "black".equals(mainhue) ) { return new Prediction("0", 0, 0); }
                if( "blue".equals(mainhue) ) { return new Prediction("1", 4, 0); }
            }
            if( "3".equals(zone) ) {
                if( "1".equals(black) ) { return new Prediction("0", 1, 0); }
                if( "0".equals(black) ) { return new Prediction("1", 6, 0); }
            }
            if( "1".equals(zone) ) {
                if( "4".equals(sunstars) ) { return new Prediction("1", 1, 0); }
                if( "7".equals(sunstars) ) { return new Prediction("0", 0, 0); }
                if( "14".equals(sunstars) ) { return new Prediction("0", 0, 0); }
                if( "3".equals(sunstars) ) { return new Prediction("0", 0, 0); }
                if( "6".equals(sunstars) ) { return new Prediction("0", 0, 0); }
                if( "50".equals(sunstars) ) { return new Prediction("0", 0, 0); }
                if( "15".equals(sunstars) ) { return new Prediction("0", 0, 0); }
                if( "9".equals(sunstars) ) { return new Prediction("0", 0, 0); }
                if( "10".equals(sunstars) ) { return new Prediction("0", 0, 0); }
                if( "5".equals(sunstars) ) { return new Prediction("3", 1, 0); }
                if( "0".equals(sunstars) ) {
                    if( "1".equals(text) ) {
                        if( "7".equals(colours) ) { return new Prediction("1", 1, 0); }
                        if( "5".equals(colours) ) { return new Prediction("0", 0, 0); }
                        if( "4".equals(colours) ) { return new Prediction("2", 1, 0); }
                        if( "3".equals(colours) ) { return new Prediction("0", 0, 0); }
                        if( "1".equals(colours) ) { return new Prediction("0", 0, 0); }
                        if( "8".equals(colours) ) { return new Prediction("0", 0, 0); }
                        if( "2".equals(colours) ) { return new Prediction("0", 0, 0); }
                        if( "6".equals(colours) ) { return new Prediction("3", 1, 0); }
                    }
                    if( "0".equals(text) ) {
                        if( "2".equals(language) ) { return new Prediction("0", 0, 0); }
                        if( "8".equals(language) ) { return new Prediction("2", 4, 0); }
                        if( "1".equals(language) ) { return new Prediction("0", 0, 0); }
                        if( "7".equals(language) ) { return new Prediction("0", 0, 0); }
                        if( "5".equals(language) ) { return new Prediction("0", 0, 0); }
                        if( "9".equals(language) ) { return new Prediction("0", 0, 0); }
                        if( "4".equals(language) ) { return new Prediction("0", 2, 0); }
                        if( "10".equals(language) ) {
                            if( "2".equals(bars) ) { return new Prediction("0", 1, 0); }
                            if( "3".equals(bars) ) { return new Prediction("0", 0, 0); }
                            if( "0".equals(bars) ) { return new Prediction("2", 1, 0); }
                            if( "1".equals(bars) ) { return new Prediction("0", 0, 0); }
                            if( "5".equals(bars) ) { return new Prediction("0", 0, 0); }
                        }
                        if( "3".equals(language) ) { return new Prediction("0", 1, 0); }
                        if( "6".equals(language) ) {
                            if( "2".equals(bars) ) { return new Prediction("0", 1, 0); }
                            if( "3".equals(bars) ) { return new Prediction("0", 1, 0); }
                            if( "0".equals(bars) ) {
                                if( "green".equals(botright) ) { return new Prediction("0", 0, 0); }
                                if( "gold".equals(botright) ) { return new Prediction("0", 0, 0); }
                                if( "orange".equals(botright) ) { return new Prediction("0", 0, 0); }
                                if( "blue".equals(botright) ) { return new Prediction("0", 1, 0); }
                                if( "black".equals(botright) ) { return new Prediction("0", 0, 0); }
                                if( "white".equals(botright) ) { return new Prediction("1", 1, 0); }
                                if( "red".equals(botright) ) { return new Prediction("0", 0, 0); }
                                if( "brown".equals(botright) ) { return new Prediction("0", 0, 0); }
                            }
                            if( "1".equals(bars) ) { return new Prediction("0", 0, 0); }
                            if( "5".equals(bars) ) { return new Prediction("0", 0, 0); }
                        }
                    }
                }
                if( "1".equals(sunstars) ) { return new Prediction("1", 2, 0); }
                if( "2".equals(sunstars) ) { return new Prediction("0", 1, 0); }
                if( "22".equals(sunstars) ) { return new Prediction("0", 0, 0); }
            }
        }
        return null;
    }
}

