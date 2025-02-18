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

package eu.jpangolin.jpangomaze.core.algo;

import eu.jpangolin.jpangomaze.core.cell.ICell;
import eu.jpangolin.jpangomaze.core.grid.IGrid;

/**
 * Each algorithm can construct or 'plant' a grid.
 * @param <G> grid type
 * @param <C> cell type
 * @author jTzipi
 */
public interface IPlantable<G extends IGrid<C>, C extends ICell> {

    /**
     * 'Plant' the maze.
     * That is run the algorithm to create the maze.
     * @param grid Grid to plant the maze on
     * @throws NullPointerException if {@code grid}
     */
    void plant( G grid);

}