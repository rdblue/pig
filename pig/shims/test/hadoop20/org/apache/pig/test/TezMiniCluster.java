/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.pig.test;

import org.apache.pig.ExecType;
import org.apache.pig.test.MiniGenericCluster;

/**
 * Dummy class for compile-time compatibility with Hadoop 1.x and 0.20.x
 */
public class TezMiniCluster extends MiniGenericCluster {
    TezMiniCluster() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ExecType getExecType() {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void setupMiniDfsAndMrClusters() {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void shutdownMiniMrClusters() {
        throw new UnsupportedOperationException();
    }
}