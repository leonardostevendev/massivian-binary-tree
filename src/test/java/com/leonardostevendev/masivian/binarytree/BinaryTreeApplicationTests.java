package com.leonardostevendev.masivian.binarytree;

import com.leonardostevendev.masivian.binarytree.structure.Tree;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BinaryTreeApplicationTests {

    Tree tree;

    @Before
    public void prepareTree() {

    }

    @Test
    public void testLCA() {
        Tree tree = new Tree(39);
        assertEquals(0, 0);
    }

}
