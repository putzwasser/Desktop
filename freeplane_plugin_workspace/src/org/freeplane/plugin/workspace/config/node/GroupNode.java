package org.freeplane.plugin.workspace.config.node;

public class GroupNode extends WorkspaceNode {

	public GroupNode(String id) {
		super(id); 
	}
	
	public String toString() {
		return this.getName();
	}


}