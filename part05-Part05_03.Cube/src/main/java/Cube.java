public class Cube {
    private int edgeLenth;

    public Cube(int edgeLength) {
        this.edgeLenth = edgeLength;
    }

    public int volume() {
        return edgeLenth * edgeLenth * edgeLenth;
    }

    public String toString() {
        return "The length of the edge is " + edgeLenth + " and the volume " + volume();
    }
}
