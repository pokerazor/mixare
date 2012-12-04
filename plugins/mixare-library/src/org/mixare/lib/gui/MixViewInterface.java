package org.mixare.lib.gui;

import android.view.SurfaceView;

/**
 * Used to acces zoombar from GLThread
 * @author Edwin Schriek
 * Nov 14, 2012
 * mixare-library
 *
 */
public interface MixViewInterface {
	boolean isZoombarVisible();
	int getZoomProgress();
	String getZoomLevel();
	
}