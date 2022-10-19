/*******************************************************************************
 * Copyright (c) 2010, 2015 Sonatype, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Stuart McCulloch (Sonatype, Inc.) - initial API and implementation
 *******************************************************************************/
package org.eclipse.sisu.bean.beta;

import javax.inject.Singleton;

@Singleton
public class HiddenPackage
    extends HiddenProtected
{
    void c()
    {
        results.append( "!" );
    }

    void x()
    {
        results.append( "!" );
    }
}
