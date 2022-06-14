/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;
import javafx.util.Pair;

/**
 *
 * @author HP
 */
public class BinaryTree {

    public class Node {

        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    private class Treeinfo {

        int height;
        int diameter;

        Treeinfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }

        @Override
        public String toString() {
            return "Treeinfo{" + "diameter=" + diameter + '}';
        }
    }

    public Node root = null;
    private int inx = -1;

    public Node buildTree(int a[]) {
        inx++;
        if (a[inx] == -1) {
            return null;
        }
        Node newNode = new Node(a[inx]);
        newNode.left = buildTree(a);
        newNode.right = buildTree(a);

        
        return newNode;
    }

    public void preorder(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public void levelorder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node temp = q.remove();
            if (temp == null) {
                if (!q.isEmpty()) {
                    System.out.println();
                    q.add(null);
                } else {
                    break;
                }
            } else {
                System.out.print(temp.data + " ");
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
    }

    public void leftview(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
                Node temp = q.remove();
                if (i == 0) {
                    System.out.print(temp.data + " ");
                }
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
    }

    public void topview(Node root) {
        Pair<Integer, Node> p = new Pair<>(0, root);
        TreeMap<Integer, Node> h = new TreeMap<>();
        Queue<Pair<Integer, Node>> q = new LinkedList<>();
        q.add(p);
        h.put(0, root);
        while (!q.isEmpty()) {
            p = q.remove();
            Node prev = p.getValue();
            int vl = p.getKey();
            if (!h.containsKey(vl)) {
                h.put(vl, prev);
            }
            if (prev.left != null) {
                q.add(new Pair<>(vl - 1, prev.left));

            }
            if (prev.right != null) {
                q.add(new Pair<>(vl + 1, prev.right));

            }
        }
        h.entrySet().forEach(entry -> {
            System.out.print(entry.getValue().data + " ");
        });
    }

    public int countNode(Node root) {
        int left = 0, right = 0;
        if (root == null) {
            return 0;
        }

        left = countNode(root.left);
        right = countNode(root.right);

        return left + right + 1;
    }

    public int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftsum = sumOfNodes(root.left);
        int rightsum = sumOfNodes(root.right);

        return leftsum + rightsum + root.data;

    }

    public int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        } else {
            return rightHeight + 1;
        }
    }

    public int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftdia = diameter(root.left);
        int rightdia = diameter(root.right);
        int temp = height(root.left) + height(root.right) + 1;

        int dia = Math.max(temp, Math.max(leftdia, rightdia));
        return dia;
    }

    public Treeinfo diameteropt(Node root) {
        if (root == null) {
            return new Treeinfo(0, 0);
        }

        Treeinfo leftdia = diameteropt(root.left);
        Treeinfo rightdia = diameteropt(root.right);
        int myHeight = Math.max(leftdia.height, rightdia.height) + 1;

        int temp = leftdia.height + rightdia.height + 1;

        int maxdia = Math.max(temp, Math.max(leftdia.diameter, rightdia.diameter));

        return new Treeinfo(myHeight, maxdia);
    }

    private boolean isIdentical(Node root, Node sub) {
        boolean rootnode = true, left, right;
        if (sub == null && root == null) {
            return true;
        }

        if (sub == null) {
            return false;
        }

        if (root.data == sub.data) {
            return isIdentical(root.left, sub.left) && isIdentical(root.right, sub.right);
        }
        return false;
    }

    public boolean isSubTree(Node root, Node sub) {
        if (sub == null) {
            return true;
        }

        if (root == null) {
            return false;
        }

        if (isIdentical(root, sub)) {
            return true;
        }
        return isIdentical(root.left, sub) || isIdentical(root.right, sub);
    }
}
