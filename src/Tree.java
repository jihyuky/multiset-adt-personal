import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

public class Tree {
    private int root;  //TODO: Change this to Optional[Any]
    private ArrayList<Tree> subTrees;
    private String s;

    public Tree(int root, ArrayList<Tree> subTrees) {
        this.root = root;
        this.subTrees = subTrees;
    }
}

