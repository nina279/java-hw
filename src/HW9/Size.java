package HW9;

public enum Size {
    S("S", 5, 10),
    L("L", 7, 12),
    M("M", 9, 14);

    private final String shortname;
    private final int width;
    private final int length;

    Size(String shortname, int width, int length) {
        this.shortname = shortname;
        this.width = width;
        this.length = length;
    }

    public String getShortname() {
        return shortname;
    }
    public int getWidth() {
        return width;
    }
    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Size{" +
                "shortname='" + shortname + '\'' +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
