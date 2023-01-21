package FamilyTree;

import java.util.List;

public interface TreeNode {

    public List<TreeNode> getParent();

    public List<TreeNode> getChildren();

    public void setParent(TreeNode parent);

    public void addChild(TreeNode child);
}
