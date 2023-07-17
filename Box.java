public class Box {
    private int weight;
    private int boxId;

    public Box(int boxId, int weight) {
        this.boxId = boxId;
        this.weight = weight;

    }

    @Override
    public String toString() {
        return String.format("Box id: %d, Box weight: %d", boxId, weight);
    }

    public int getWeight() {
        return weight;
    }

    public int getBoxId() {
        return boxId;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


}
