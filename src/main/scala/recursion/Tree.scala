package recursion

trait Tree

final case class Node(l: Tree, r: Tree) extends Tree
final case class Leaf(elt: Int) extends Tree
