package com.leonardostevendev.masivian.binarytree.structure;

public class Tree {

    private Node root;

    public Tree( int val ) {
        this.root = new Node( val );
    }

    public Tree( Node root ) {
        this.root = root;
    }

    private void addNode( Node node, Node root ) {
        /* 2.- Partiendo de la raíz preguntamos: Nodo == null ( o no existe ) ? */
        if ( root == null ) {
            this.setRoot(node);
        }
        else {
            /* 4.- En caso negativo preguntamos: X < Nodo */
            if ( node.getVal() <= root.getVal() ) {
                /*
                 * 5.- En caso de ser menor pasamos al Nodo de la IZQUIERDA del
                 * que acabamos de preguntar y repetimos desde el paso 2
                 * partiendo del Nodo al que acabamos de visitar
                 */
                if (root.getLeft() == null) {
                    root.setLeft(node);
                }
                else {
                    addNode( node , root.getLeft() );
                }
            }
            else {
                /*
                 * 6.- En caso de ser mayor pasamos al Nodo de la DERECHA y tal
                 * cual hicimos con el caso anterior repetimos desde el paso 2
                 * partiendo de este nuevo Nodo.
                 */
                if (root.getRight() == null) {
                    root.setRight(node);
                }
                else {
                    addNode( node, root.getRight() );
                }
            }
        }
    }

    public void addNode( Node node ) {
        this.addNode( node , this.root );
    }

    public boolean removeNode( Node node ) {

        boolean hasRightNode = node.getRight() != null ? true : false;
        boolean hasLeftNode = node.getLeft() != null ? true : false;

        if (!hasRightNode && !hasLeftNode) {
            return removeNodeNoChild( node );
        }

        if ( (hasRightNode && !hasLeftNode) || (!hasRightNode && hasLeftNode)) {
            return removeNodeWithSingleChild( node );
        }

        if ( hasLeftNode && hasRightNode ) {
            return removeComplexNode( node );
        }

        return false;
    }

    private boolean removeNodeNoChild( Node node ) {

        Node leftChild = node.getParent().getLeft();
        Node rightChild = node.getParent().getRight();

        if ( leftChild == node ) {
            node.getParent().setLeft( null );
            return true;
        }

        if ( rightChild == node) {
            node.getParent().setRight( null );
            return true;
        }

        return false;
    }

    private boolean removeNodeWithSingleChild( Node node ) {

        Node leftChild = node.getParent().getLeft();
        Node rightChild = node.getParent().getRight();

        Node currentChild = node.getLeft() != null ?
                node.getLeft() : node.getRight();

        if ( leftChild == node ) {
            node.getParent().setLeft( currentChild );

            currentChild.setParent(node.getParent());
            node.setRight(null);
            node.setLeft(null);

            return true;
        }

        if ( rightChild == node) {
            node.getParent().setRight( currentChild );

            currentChild.setParent(node.getParent());
            node.setRight(null);
            node.setLeft(null);

            return true;
        }

        return false;
    }

    private boolean removeComplexNode( Node node ) {
        /* Tomar el hijo derecho del Nodo que queremos eliminar */
        Node mostLeftNode = iterateLeft( node.getRight() );
        if ( mostLeftNode != null ) {
            node.setVal( mostLeftNode.getVal() );
            removeNode( mostLeftNode );
            return true;
        }
        return false;
    }

    private Node iterateLeft(Node node) {
        if (node.getLeft() != null) {
            return iterateLeft( node.getLeft() );
        }
        return node;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

}
