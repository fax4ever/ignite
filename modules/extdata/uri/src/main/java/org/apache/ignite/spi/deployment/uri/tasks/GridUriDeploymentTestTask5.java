/* @java.file.header */

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

package org.apache.ignite.spi.deployment.uri.tasks;

import org.apache.ignite.*;
import org.apache.ignite.compute.*;
import org.gridgain.grid.*;

import java.util.*;

/**
 * Simple URI deployment test task.
 */
public class GridUriDeploymentTestTask5 extends ComputeTaskSplitAdapter<Object, Object> {
    /**
     * {@inheritDoc}
     */
    @Override public Collection<? extends ComputeJob> split(int gridSize, Object arg) throws IgniteCheckedException {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override public Object reduce(List<ComputeJobResult> results) throws IgniteCheckedException {
        return null;
    }
}
