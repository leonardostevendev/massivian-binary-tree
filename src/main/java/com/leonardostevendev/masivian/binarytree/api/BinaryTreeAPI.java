package com.leonardostevendev.masivian.binarytree.api;

import com.leonardostevendev.masivian.binarytree.structure.Node;
import com.leonardostevendev.masivian.binarytree.structure.Tree;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tree")
public class BinaryTreeAPI {
    @PostMapping()

    public ResponseEntity<Long> crearArbol(@RequestBody List<Long> dataTree) {

        Tree tree = new Tree(dataTree.get(0));
        dataTree.remove(0);
        dataTree.forEach(aLong -> tree.addNode(new Node(aLong)));

        Node lca = tree.lowestCommonAncestor(tree.getRoot(), tree.searchNode(tree.getRoot(), 44), tree.searchNode(tree.getRoot(), 85));

        return ResponseEntity.ok(lca.getVal());
    }
}
