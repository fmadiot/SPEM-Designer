/*****************************************************************************
 * Copyright (c) 2011 Atos Origin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Barthelemy HABA (Atos Origin) barthelemy.haba@atosorigin.com - 
 *  Axel RICHARD (Obeo) - add aird diagram file management
 *****************************************************************************/
//CHECKSTYLE:OFF
package org.obeonetwork.dsl.spem.gen.doc.wizard;

import java.net.URL;

/**
 * represent the type of format that can be generated by a template type to use it, create a list of it in a
 * runner. This class comes from :pserver:cvs.gforge.enseeiht.fr:/cvsroot/topcased-gendoc
 * ,plugins/gendoc2/org.topcased.gendoc2.wizard,org.topcased.gendoc2.wizard.
 */
public interface IGendoc2Template {

	/**
	 * @return the out put extension of the format of document to generate
	 */
	String getOutPutExtension();

	/**
	 * @return the access path URI to specify where is the file containing acceleo script for generation
	 */
	URL getTemplate();

	/**
	 * @return the generic model key associated to the future model
	 */
	String getModelKey();

	/**
	 * @return the generic key to use in order to specify output repository
	 */
	String getOutputKey();

	/**
	 * @return the generic key to use in order to specify the aird diagram use for the generation
	 */
	String getAirdDiagramKey();

	/**
	 * @return give description associated to the kind of document generation user is going to do.
	 */
	String getDescription();
	
}
