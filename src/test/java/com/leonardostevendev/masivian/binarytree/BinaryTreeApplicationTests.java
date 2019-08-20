package com.leonardostevendev.masivian.binarytree;

import com.leonardostevendev.masivian.binarytree.structure.Node;
import com.leonardostevendev.masivian.binarytree.structure.Tree;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BinaryTreeApplicationTests {

    static Tree tree;

    @BeforeClass
    public static void prepareTree() {
        tree = new Tree(67);
        tree.addNode(new Node(39));
        tree.addNode(new Node(76));
        tree.addNode(new Node(28));
        tree.addNode(new Node(44));
        tree.addNode(new Node(74));
        tree.addNode(new Node(85));
        tree.addNode(new Node(29));
        tree.addNode(new Node(83));
        tree.addNode(new Node(87));

    }

    @Test
    public void testLCA() {
        System.out.println(tree.getRoot());
        assertEquals(39, tree.lowestCommonAncestor(tree.getRoot(), tree.searchNode(tree.getRoot(), 29), tree.searchNode(tree.getRoot(), 44)).getVal());
        assertEquals(67, tree.lowestCommonAncestor(tree.getRoot(), tree.searchNode(tree.getRoot(), 44), tree.searchNode(tree.getRoot(), 85)).getVal());
        assertEquals(85, tree.lowestCommonAncestor(tree.getRoot(), tree.searchNode(tree.getRoot(), 83), tree.searchNode(tree.getRoot(), 87)).getVal());
    }

}
