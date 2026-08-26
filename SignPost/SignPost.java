package SignPost;

public class SignPost {
    public int getArea(String multiLiner) {
        String[] lines = multiLiner.split("\n");

        int width = 0;

        for (String line : lines) {
            width = Math.max(width, line.length());
        }

        int height = lines.length;

        return width * height;
    }
}
