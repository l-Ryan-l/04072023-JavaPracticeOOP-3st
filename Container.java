import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Container implements Comparable<Container>, Iterable<Box> {
    private int id;
    private int containerWeight;

    private List<Box> boxesList;

    public Container(int id, List<Box> boxesList) {
        this.id = id;
        this.boxesList = boxesList;
    }

    public int getContainerWeight() {
        return boxesList.stream().mapToInt(Box::getWeight).sum();
    }

    public List<Box> getBoxesList() {
        return boxesList;
    }

    public List<Integer> getAllBoxesWeight() {
        return boxesList.stream().map(Box::getWeight).collect(Collectors.toList());
    }


    @Override
    public int compareTo(Container container) {
        return getContainerWeight() - container.getContainerWeight();
    }

    @Override
    public Iterator<Box> iterator() {
        return boxesList.iterator();
    }

    @Override
    public String toString() {
        return "Container{" +
                "id = " + id +
                ", containerWeight = " + getContainerWeight() +
                ", number of boxes inside = " + boxesList.size() +
                '}';
    }
}
