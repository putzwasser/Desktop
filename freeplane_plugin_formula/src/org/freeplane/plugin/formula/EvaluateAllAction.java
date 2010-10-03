package org.freeplane.plugin.formula;

import java.awt.event.ActionEvent;

import org.freeplane.core.controller.Controller;
import org.freeplane.core.ui.AFreeplaneAction;
import org.freeplane.core.ui.ActionLocationDescriptor;
import org.freeplane.features.common.map.MapModel;
import org.freeplane.view.swing.map.MapView;

@ActionLocationDescriptor(locations = { Activator.MENU_BAR_LOCATION })
public class EvaluateAllAction extends AFreeplaneAction {
	private static final long serialVersionUID = 1L;

	public EvaluateAllAction() {
		super(FormulaUtils.getFormulaKey("EvaluateAllAction"));
	}

	public void actionPerformed(final ActionEvent e) {
		final MapModel map = Controller.getCurrentController().getMap();
		org.freeplane.plugin.script.FormulaUtils.clearCache(map);
		MapView mapView = (MapView)Controller.getCurrentController().getMapViewManager().getMapViewComponent();
		mapView.getRoot().updateAll();
	}
}
