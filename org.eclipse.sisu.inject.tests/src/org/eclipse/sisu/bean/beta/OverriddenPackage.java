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

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Singleton;

@Singleton
public class OverriddenPackage
    extends OverriddenProtected
{
    @PostConstruct
    void c()
    {
        results.append( "C" );
    }

    @PreDestroy
    void x()
    {
        results.append( "X" );
    }
}
