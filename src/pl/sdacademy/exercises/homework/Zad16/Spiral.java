package pl.sdacademy.exercises.homework.Zad16;

public class Spiral {
    protected static int[][] selectGenerete(int[][] table, boolean clockwise, boolean grows) {
        if (clockwise) {
            return genereteClockwise(table, grows);
        } else {
            return genereteReversGrow(table, grows);
        }
    }

    private static int[][] genereteClockwise(int[][] table, boolean grows) {
        int counter;
        int minHeight = 0;
        int minWight = 0;
        int maxWight = table[0].length;
        int maxHeight = table.length;
        int stop = table.length * table[0].length + 1;
        if (grows) {
            counter = 1;
        } else {
            counter = stop - 1;
        }

        do {
            for (int wight = minWight; wight < maxWight; wight++) {
                if (grows) {
                    if (counter == stop) {
                        break;
                    }
                } else {
                    if (counter == 0) {
                        break;
                    }
                }
                table[minHeight][wight] = counter;
                if (grows) {
                    counter++;
                } else {
                    counter--;
                }
                if (wight == maxWight - 1) {
                    minHeight += 1;
                }
            }
            for (int height = minHeight; height < maxHeight; height++) {
                if (grows) {
                    if (counter == stop) {
                        break;
                    }
                } else {
                    if (counter == 0) {
                        break;
                    }
                }
                table[height][maxWight - 1] = counter;
                if (grows) {
                    counter++;
                } else {
                    counter--;
                }
                if (height == maxHeight - 1) {
                    maxWight -= 1;
                }
            }
            for (int wight = maxWight - 1; wight >= minWight; wight--) {
                if (grows) {
                    if (counter == stop) {
                        break;
                    }
                } else {
                    if (counter == 0) {
                        break;
                    }
                }
                table[maxHeight - 1][wight] = counter;
                if (grows) {
                    counter++;
                } else {
                    counter--;
                }
                if (wight == minWight) {
                    maxHeight -= 1;
                }
            }
            for (int height = maxHeight - 1; height >= minHeight; height--) {
                if (grows) {
                    if (counter == stop) {
                        break;
                    }
                } else {
                    if (counter == 0) {
                        break;
                    }
                }
                table[height][minWight] = counter;
                if (grows) {
                    counter++;
                } else {
                    counter--;
                }
                if (height == minHeight) {
                    minWight += 1;

                }
            }
        } while (counter < stop && counter > 0);
        return table;
    }

    private static int[][] genereteReversGrow(int[][] table, boolean grows) {
        int counter;
        int minHeight = 0;
        int minWight = 0;
        int maxWight = table[0].length;
        int maxHeight = table.length;
        int stop = table.length * table[0].length + 1;
        if (grows) {
            counter = 1;
        } else {
            counter = stop - 1;
        }

        do {
            for (int wight = maxWight - 1; wight >= minWight; wight--) {
                if (grows) {
                    if (counter == stop) {
                        break;
                    }
                } else {
                    if (counter == 0) {
                        break;
                    }
                }
                table[minHeight][wight] = counter;
                if (grows) {
                    counter++;
                } else {
                    counter--;
                }
                if (wight == minWight) {
                    minHeight += 1;
                }
            }
            for (int height = minHeight; height < maxHeight; height++) {
                if (grows) {
                    if (counter == stop) {
                        break;
                    }
                } else {
                    if (counter == 0) {
                        break;
                    }
                }
                table[height][minWight] = counter;
                if (grows) {
                    counter++;
                } else {
                    counter--;
                }
                if (height == maxHeight - 1) {
                    minWight += 1;
                }
            }
            for (int wight = minWight; wight < maxWight; wight++) {
                if (grows) {
                    if (counter == stop) {
                        break;
                    }
                } else {
                    if (counter == 0) {
                        break;
                    }
                }
                table[maxHeight - 1][wight] = counter;
                if (grows) {
                    counter++;
                } else {
                    counter--;
                }
                if (wight == maxWight - 1) {
                    maxHeight -= 1;
                }
            }
            for (int height = maxHeight - 1; height >= minHeight; height--) {
                if (grows) {
                    if (counter == stop) {
                        break;
                    }
                } else {
                    if (counter == 0) {
                        break;
                    }
                }
                table[height][maxWight - 1] = counter;
                if (grows) {
                    counter++;
                } else {
                    counter--;
                }
                if (height == minHeight) {
                    maxWight -= 1;
                }
            }
        } while (counter < stop && counter > 0);
        return table;
    }
}
