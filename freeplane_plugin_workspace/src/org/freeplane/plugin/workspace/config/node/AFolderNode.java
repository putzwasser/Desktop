/**
 * author: Marcel Genzmehr
 * 16.08.2011
 */
package org.freeplane.plugin.workspace.config.node;

import org.freeplane.plugin.workspace.model.AWorkspaceTreeNode;


/**
 * 
 */
public abstract class AFolderNode extends AWorkspaceTreeNode {
	final public static String FOLDER_TYPE_PHYSICAL = "physical";
	final public static String FOLDER_TYPE_VIRTUAL = "virtual";
	
	
	/***********************************************************************************
	 * CONSTRUCTORS
	 **********************************************************************************/	

	/**
	 * @param type
	 */
	public AFolderNode(String type) {
		super(type);
	}
	
	/***********************************************************************************
	 * METHODS
	 **********************************************************************************/

	public void refresh() {
		//do nothing for now
	}
	/***********************************************************************************
	 * REQUIRED METHODS FOR INTERFACES
	 **********************************************************************************/
	
	
	public final String getTagName() {
		return "folder";
	}

	@Override
	public void initializePopup() {
		
	}
}