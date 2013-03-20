/*
 * Copyright 2012-2013 Gephi Consortium
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.gephi.graph.store;

/**
 *
 * @author mbastian
 */
public final class GraphStoreConfiguration {

    //Features
    public static final boolean ENABLE_AUTO_LOCKING = true;
    public static final boolean ENABLE_AUTO_TYPE_REGISTRATION = true;
    public static final boolean ENABLE_INDEX_NODES = true;
    public static final boolean ENABLE_INDEX_EDGES = true;
    public static final boolean ENABLE_OBSERVERS = true;
    //NodeStore
    public final static int NODESTORE_BLOCK_SIZE = 5000;
    public final static int NODESTORE_DEFAULT_BLOCKS = 10;
    public static final int NODESTORE_DEFAULT_DICTIONARY_SIZE = 1000;
    public final static float NODESTORE_DICTIONARY_LOAD_FACTOR = .7f;
    //EdgeStore
    public static final int EDGESTORE_BLOCK_SIZE = 8192;
    public static final int EDGESTORE_DEFAULT_BLOCKS = 10;
    public static final int EDGESTORE_DEFAULT_TYPE_COUNT = 1;
    public static final int EDGESTORE_DEFAULT_DICTIONARY_SIZE = 1000;
    public static final float EDGESTORE_DICTIONARY_LOAD_FACTOR = .7f;
    //GraphView
    public static final int VIEW_DEFAULT_TYPE_COUNT = 1;
    public static final double VIEW_GROWING_FACTOR = 1.1;
}
