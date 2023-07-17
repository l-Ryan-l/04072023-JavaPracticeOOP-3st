import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box boxOne = new Box(1, 10);
        Box boxTwo = new Box(2, 15);
        System.out.println(boxOne);
        List<Box> boxListOne = new ArrayList<>();
        boxListOne.add(boxOne);
        boxListOne.add(boxTwo);

        Box boxThree = new Box(3, 5);
        Box boxFour = new Box(4, 7);
        List<Box> boxListTwo = new ArrayList<>();
        boxListTwo.add(boxThree);
        boxListTwo.add(boxFour);


        Box boxFive = new Box(5, 12);
        Box boxSix = new Box(6, 9);
        List<Box> boxListThree = new ArrayList<>();
        boxListThree.add(boxFive);
        boxListThree.add(boxSix);

        Container containerOne = new Container(1, boxListOne);
        Container containerTwo = new Container(2, boxListTwo);
        Container containerThree = new Container(3, boxListThree);

        System.out.println(containerOne);
        System.out.println(containerTwo);
        System.out.println(containerThree);

        List<Container> containersGroup = new ArrayList<>();
        containersGroup.add(containerOne);
        containersGroup.add(containerTwo);
        containersGroup.add(containerThree);

        var containers = containersGroup;

        containers.sort((o1, o2) -> {
            int placeOne = o1.getContainerWeight();
            int placeTwo = o2.getContainerWeight();
            return o1.compareTo(o2);
        });

        System.out.println(containers);

        Comparator comparator = new ContainerCountComparator();
        Collections.sort(containers, comparator);
        System.out.println(containers);

        containers.stream().flatMap(container -> container.getBoxesList().stream()).forEach(System.out::println);
    }
}
