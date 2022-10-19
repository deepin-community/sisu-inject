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
package org.eclipse.sisu.launch;

import javax.inject.Inject;

import com.google.inject.Binder;

public final class RequireBindingsTestCase
    extends InjectedTestCase
{
    @Override
    public void configure( final Binder binder )
    {
        binder.requireExplicitBindings();
    }

    @Inject
    Foo bean;

    public void testRequireExplicitBindings()
    {
        assertNotNull( bean );
    }
}