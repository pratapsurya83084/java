class surfaceareaandvolume {
    public static void main(String[] args)
    {
    double r = 5.0, surfacearea = 0.0, volume = 0.0;
    surfacearea = 4 * 3.14 * (r * r);
    volume = ((double)4 / 3) * 3.14 * (r * r * r);
    System.out.println("surfacearea of sphere = "+ surfacearea);
    System.out.println("volume of sphere = " + volume);
    }
    }