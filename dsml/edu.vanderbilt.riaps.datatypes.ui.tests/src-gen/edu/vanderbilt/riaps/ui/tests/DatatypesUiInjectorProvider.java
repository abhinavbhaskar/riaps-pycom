/*
 * generated by Xtext 2.10.0
 */
package edu.vanderbilt.riaps.ui.tests;

import com.google.inject.Injector;
import edu.vanderbilt.riaps.datatypes.ui.internal.DatatypesActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class DatatypesUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DatatypesActivator.getInstance().getInjector("edu.vanderbilt.riaps.Datatypes");
	}

}
