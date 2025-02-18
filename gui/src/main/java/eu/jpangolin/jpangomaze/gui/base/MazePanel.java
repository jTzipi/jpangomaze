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

package eu.jpangolin.jpangomaze.gui.base;

import eu.jpangolin.jpangomaze.core.algo.IPlantable;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;

public class MazePanel extends BorderPane {


    private ToolBar mainToolbar;
    private ComboBox<IPlantable<?,?>> plantAlgoComboBox;
    private Canvas canvas;


    MazePanel() {
        initMazePanel();
    }

    private void initMazePanel() {




    }
}