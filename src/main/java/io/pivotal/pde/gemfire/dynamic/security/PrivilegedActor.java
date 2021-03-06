/*
 * Copyright (c) 2018 Pivotal Software, Inc. All Rights Reserved.
 */
package io.pivotal.pde.gemfire.dynamic.security;

import org.apache.geode.security.ResourcePermission;

public interface PrivilegedActor {
	public boolean canDo(ResourcePermission perm);
}
