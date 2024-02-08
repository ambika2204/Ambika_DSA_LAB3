package Test;

import dsa.binarySearchTree.BSTPairFinder;
import dsa.binarySearchTree.BSTUtils;
import dsa.binarySearchTree.BinarySearchTree;

public class BSTPairFinderTest {
    public static void main(String[] args) {

        BinarySearchTree bst = BSTUtils.sampleBST();
        BSTPairFinder pairFinder = new BSTPairFinder(bst, 120);
        pairFinder.findPairs();
    }
}