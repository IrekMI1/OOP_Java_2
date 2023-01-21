package FamilyTree;

import java.util.ArrayList;
import java.util.List;

public abstract class Member implements TreeNode {
    private String fullName;
    private TreeNode spouse;
    private List<TreeNode> parents;
    private List<TreeNode> children;

    {
        parents = new ArrayList<>();
        children = new ArrayList<>();
    }

    public Member(String fullName) {
        this.fullName = fullName;
    }

    public Member(String fullName, TreeNode parent) {
        this(fullName);
        this.setParent(parent);
    }

    public Member(String fullName, TreeNode parent1, TreeNode parent2) {
        this(fullName, parent1);
        this.setParent(parent2);
    }

    public String getFullName() {
        return fullName;
    }

    public TreeNode getSpouse() {
        return spouse;
    }

    public void setSpouse(Member spouse) {
        this.spouse = spouse;
        if (spouse.getSpouse() == null) {
            spouse.setSpouse(this);
        }
    }

    @Override
    public List<TreeNode> getParent() {
        return parents;
    }

    @Override
    public void setParent(TreeNode parent) {
        if (parents.size() < 2) {
            parents.add(parent);
        } else {
            System.out.println("Не может быть более 2 родителей.");
        }
        parent.addChild(this);
    }

    @Override
    public List<TreeNode> getChildren() {
        return children;
    }

    @Override
    public void addChild(TreeNode child) {
        children.add(child);
        if (!(child.getParent().contains(this))) {
            child.setParent(this);
        }
    }
}