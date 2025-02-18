/*
 * Copyright (c) 2024 Tim Langhammer.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.jpangolin.jpangomaze.core;

import eu.jpangolin.jpangomaze.core.cell.ICell;

/**
 * Weighted Edge.
 * <p>
 *     A weighted edge has a weight or cost to travel along from one cell to an other.
 * </p>
 * @param <C>
 */
public interface IWeightedEdge<C extends ICell> extends IEdge<C> {

    /**
     * An edge without cost.
     */
    long FREE = 0L;
    /**
     * Default weight.
     */
    long SIMPLE = 1L;
    /**
     * Maximal Weight to a visitable neighbour cell.
     */
    long MAX_NEIGHBOUR = 128L;
    /**
     * Infinity weight.
     */
    long INF = Long.MAX_VALUE;

    /**
     * Weight of this edge.
     * @return weight to travel this edge
     */
    long weight();
}