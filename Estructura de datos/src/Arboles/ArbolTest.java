package Arboles;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ArbolTest {
public static void main(String[] args) {
	
	
    ArbolBinario arbolBinario;

    arbolBinario = new ArbolBinario();

    // El arbol esta vacio
    System.out.println(arbolBinario.isEmpty()? "Arbol vacio." : "Arbol no vacio.");
    System.out.println("Hay " + arbolBinario.getSize() + " elementos.");
 
    // Se anaden algunos valores
    arbolBinario.add(6);
    arbolBinario.add(4);
    arbolBinario.add(8);
    arbolBinario.add(3);
    arbolBinario.add(5);
    arbolBinario.add(7);
    arbolBinario.add(9);

    // El arbol ya no esta vacio
    System.out.println(arbolBinario.isEmpty()? "Arbol vacio." : "Arbol no vacio.");
    System.out.println("Hay " + arbolBinario.getSize() + " elementos.");

    // Buscamos algunos valores
    System.out.println(arbolBinario.containsNode(6) ? "Si est? el 6." : "No esta el 6.");
    System.out.println(arbolBinario.containsNode(4) ? "Si est? el 4." : "No esta el 4.");
    System.out.println(arbolBinario.containsNode(1) ? "Si est? el 1." : "No esta el 1.");

    // Borramos y verificamos
    System.out.println(arbolBinario.containsNode(9) ? "Si est? el 9." : "No esta el 9.");
    arbolBinario.delete(9);
    System.out.println(arbolBinario.containsNode(9) ? "Si est? el 9." : "No esta el 9.");

    // Hacemos los recorridos
    System.out.println("\nRecorrido preOrden");
    arbolBinario.traversePreOrder(arbolBinario.raiz);

    System.out.println("\nRecorrido postOrden");
    arbolBinario.traversePostOrder(arbolBinario.raiz);

    System.out.println("\nRecorrido inOrden");
    arbolBinario.traverseInOrder(arbolBinario.raiz);

    System.out.println("\nRecorrido por nivel");
    arbolBinario.traverseLevelOrder();

    System.out.println("\n?Siga jugando con los arboles!");


}
}



// La clase para el arbol binario
class ArbolBinario {
    Node raiz;

    public ArbolBinario BinaryTree() {
         raiz = null;
         return this;
    }

// A?adir elementos al arbol, la funcion publica es add
    public void add(int value) {
        raiz = addRecursive(raiz, value);
    }

    private Node addRecursive(Node actual, int valor) {

        if (actual == null) {
            return new Node(valor);
        }

        if (valor < actual.value) {
            actual.left = addRecursive(actual.left, valor);
        } else if (valor > actual.value) {
            actual.right = addRecursive(actual.right, valor);
        }

        return actual;
    }

// Indica si el arbol esta vacio
    public boolean isEmpty() {
        return raiz == null;
    }

// Indica cuantos nodos hay en el arbol
    public int getSize() {
        return getSizeRecursive(raiz);
    }

    private int getSizeRecursive(Node current) {
        return current == null ? 0 : getSizeRecursive(current.left) + 1 + getSizeRecursive(current.right);
    }

// Busca un valor
    public boolean containsNode(int value) {
        return containsNodeRecursive(raiz, value);
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }

        if (value == current.value) {
            return true;
        }

        return value < current.value
          ? containsNodeRecursive(current.left, value)
          : containsNodeRecursive(current.right, value);
    }

    public void delete(int value) {
        raiz = deleteRecursive(raiz, value);
    }

    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {
            // Caso 1: nodo sin hijos 
            if (current.left == null && current.right == null) {
                return null;
            }

            // Case 2: nodo con un solo hijo
            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }

            // Case 3: nodo con dos hijos
            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }

        current.right = deleteRecursive(current.right, value);
        return current;
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

// Recorrido InOrder
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            visit(node.value);
            traverseInOrder(node.right);
        }
    }

// Recorrido PreOrden
    public void traversePreOrder(Node node) {
        if (node != null) {
            visit(node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

// Recorrido PostOrden
    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            visit(node.value);
        }
    }

// Recorrido por nivel
    public void traverseLevelOrder() {
        if (raiz == null) {
            return;
        }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(raiz);

        while (!nodes.isEmpty()) {

            Node node = nodes.remove();

            System.out.print(" " + node.value);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }
    }

// Recorrido InOrden no recursivo
    public void traverseInOrderWithoutRecursion() {
        Stack<Node> stack = new Stack<>();
        Node current = raiz;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            Node top = stack.pop();
            visit(top.value);
            current = top.right;
        }
    }

// Recorrido PreOrden sin recursion
    public void traversePreOrderWithoutRecursion() {
        Stack<Node> stack = new Stack<>();
        Node current = raiz;
        stack.push(raiz);

        while (current != null && !stack.isEmpty()) {
            current = stack.pop();
            visit(current.value);

            if (current.right != null)
                stack.push(current.right);

            if (current.left != null)
                stack.push(current.left);
        }
    }
    
// Recorrido PostOrden sin recursion
    public void traversePostOrderWithoutRecursion() {
        Stack<Node> stack = new Stack<>();
        Node prev = raiz;
        Node current = raiz;
        stack.push(raiz);

        while (current != null && !stack.isEmpty()) {
            current = stack.peek();
            boolean hasChild = (current.left != null || current.right != null);
            boolean isPrevLastChild = (prev == current.right || (prev == current.left && current.right == null));

            if (!hasChild || isPrevLastChild) {
                current = stack.pop();
                visit(current.value);
                prev = current;
            } else {
                if (current.right != null) {
                    stack.push(current.right);
                }
                if (current.left != null) {
                    stack.push(current.left);
                }
            }
        }   
    }    
 
// Visitar un nodo es simplemente mostrar su valor en la pantalla   
    private void visit(int value) {
        System.out.print(" " + value);        
    }
}
    
// Esta es la clase auxiliar nodo


// Note que puede redefinir el nodo como generico, o cambiar el tipo de la estructura de datos a almacenar
    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }