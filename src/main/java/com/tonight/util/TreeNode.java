package com.tonight.util;

import java.util.List;
import java.util.Map;

/**
 * Created by 85181 on 2018/11/7.
 */
public class TreeNode {
//    id：节点ID，对加载远程数据很重要。
//    text：显示节点文本。
//    state：节点状态，'open' 或 'closed'，默认：'open'。如果为'closed'的时候，将不自动展开该节点。
//    checked：表示该节点是否被选中。
//    attributes: 被添加到节点的自定义属性。
//    children: 一个节点数组声明了若干节点。


    private Integer id;
    private String text;
    private String state;
    private Boolean checked;
    private Map<String,Object> attributes;
    private List<TreeNode> children;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }
}
