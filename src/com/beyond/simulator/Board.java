package com.beyond.simulator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jared on 1/31/2017.
 */
public class Board {

    private List<BoardSpace> _spaces = new ArrayList<>();

    public Board() {
        initialize();
    }

    public List<BoardSpace> getSpaces() {
        return _spaces;
    }

    private void initialize() {
        int index = 0;
        while (index++ < Constants.NUM_BOARD_SPACES) {
            _spaces.add(new BoardSpace(index));
        }

        setNeighbors();
    }

    /**
     * Do this somewhat manually for now.
     */
    private void setNeighbors() {

        // Organize the tiles.
        int[] middleUp = {9, 11, 15, 17, 21, 23};
        int[] middleDown = {8, 10, 14, 16, 20, 22};
        int[] left = {7, 13, 19};
        int[] right = {12, 18, 24};
        int[] topUp = {3, 5};
        int[] topDown = {2, 4};
        int[] bottomUp = {27, 29};
        int[] bottomDown = {26, 28};
        int topLeft = 1;
        int topRight = 6;
        int bottomLeft = 25;
        int bottomRight = 30;

        // Set up the middle (up) neighbors.
        for (int tile : middleUp) {
            int index = tile - 1;
            BoardSpace topLeftNeighbor = _spaces.get(index - 7);
            BoardSpace topNeighbor = _spaces.get(index - 6);
            BoardSpace topRightNeighbor = _spaces.get(index - 5);
            BoardSpace bottomRightNeighbor = _spaces.get(index + 1);
            BoardSpace bottomNeighbor = _spaces.get(index + 6);
            BoardSpace bottomLeftNeighbor = _spaces.get(index - 1);
            _spaces.get(index).setTopLeftNeighbor(topLeftNeighbor);
            _spaces.get(index).setTopNeighbor(topNeighbor);
            _spaces.get(index).setTopRightNeighbor(topRightNeighbor);
            _spaces.get(index).setBottomRightNeighbor(bottomRightNeighbor);
            _spaces.get(index).setBottomNeighbor(bottomNeighbor);
            _spaces.get(index).setBottomLeftNeighbor(bottomLeftNeighbor);
        }

        // Set up the middle (down) neighbors.
        for (int tile : middleDown) {
            int index = tile - 1;
            BoardSpace topLeftNeighbor = _spaces.get(index - 1);
            BoardSpace topNeighbor = _spaces.get(index - 6);
            BoardSpace topRightNeighbor = _spaces.get(index + 1);
            BoardSpace bottomRightNeighbor = _spaces.get(index + 7);
            BoardSpace bottomNeighbor = _spaces.get(index + 6);
            BoardSpace bottomLeftNeighbor = _spaces.get(index + 5);
            _spaces.get(index).setTopLeftNeighbor(topLeftNeighbor);
            _spaces.get(index).setTopNeighbor(topNeighbor);
            _spaces.get(index).setTopRightNeighbor(topRightNeighbor);
            _spaces.get(index).setBottomRightNeighbor(bottomRightNeighbor);
            _spaces.get(index).setBottomNeighbor(bottomNeighbor);
            _spaces.get(index).setBottomLeftNeighbor(bottomLeftNeighbor);
        }

        // Set up the left side neighbors.
        for (int tile : left) {
            int index = tile - 1;
            BoardSpace topNeighbor = _spaces.get(index - 6);
            BoardSpace topRightNeighbor = _spaces.get(index - 5);
            BoardSpace bottomNeighbor = _spaces.get(index + 6);
            BoardSpace bottomRightNeighbor = _spaces.get(index + 1);
            _spaces.get(index).setTopNeighbor(topNeighbor);
            _spaces.get(index).setTopRightNeighbor(topRightNeighbor);
            _spaces.get(index).setBottomRightNeighbor(bottomRightNeighbor);
            _spaces.get(index).setBottomNeighbor(bottomNeighbor);
        }

        // Set up the top (down) neighbors.
        for (int tile : topDown) {
            int index = tile - 1;
            BoardSpace topLeftNeighbor = _spaces.get(index - 1);
            BoardSpace topRightNeighbor = _spaces.get(index + 1);
            BoardSpace bottomLeftNeighbor = _spaces.get(index + 5);
            BoardSpace bottomNeighbor = _spaces.get(index + 6);
            BoardSpace bottomRightNeighbor = _spaces.get(index + 7);
            _spaces.get(index).setTopLeftNeighbor(topLeftNeighbor);
            _spaces.get(index).setTopRightNeighbor(topRightNeighbor);
            _spaces.get(index).setBottomRightNeighbor(bottomRightNeighbor);
            _spaces.get(index).setBottomNeighbor(bottomNeighbor);
            _spaces.get(index).setBottomLeftNeighbor(bottomLeftNeighbor);
        }

        // Set up the top (up) neighbors.
        for (int tile : topUp) {
            int index = tile - 1;
            BoardSpace bottomLeftNeighbor = _spaces.get(index - 1);
            BoardSpace bottomNeighbor = _spaces.get(index + 6);
            BoardSpace bottomRightNeighbor = _spaces.get(index + 1);
            _spaces.get(index).setBottomRightNeighbor(bottomRightNeighbor);
            _spaces.get(index).setBottomNeighbor(bottomNeighbor);
            _spaces.get(index).setBottomLeftNeighbor(bottomLeftNeighbor);
        }

        // Set up the right side neighbors.
        for (int tile : right) {
            int index = tile - 1;
            BoardSpace topLeftNeighbor = _spaces.get(index - 1);
            BoardSpace topNeighbor = _spaces.get(index - 6);
            BoardSpace bottomLeftNeighbor = _spaces.get(index + 5);
            BoardSpace bottomNeighbor = _spaces.get(index + 6);
            _spaces.get(index).setTopLeftNeighbor(topLeftNeighbor);
            _spaces.get(index).setTopNeighbor(topNeighbor);
            _spaces.get(index).setBottomNeighbor(bottomNeighbor);
            _spaces.get(index).setBottomLeftNeighbor(bottomLeftNeighbor);
        }

        // Set up the bottom (up) neighbors.
        for (int tile : bottomUp) {
            int index = tile - 1;
            BoardSpace topLeftNeighbor = _spaces.get(index - 7);
            BoardSpace topNeighbor = _spaces.get(index - 6);
            BoardSpace topRightNeighbor = _spaces.get(index - 5);
            BoardSpace bottomLeftNeighbor = _spaces.get(index - 1);
            BoardSpace bottomRightNeighbor = _spaces.get(index + 1);
            _spaces.get(index).setTopLeftNeighbor(topLeftNeighbor);
            _spaces.get(index).setTopNeighbor(topNeighbor);
            _spaces.get(index).setTopRightNeighbor(topRightNeighbor);
            _spaces.get(index).setBottomRightNeighbor(bottomRightNeighbor);
            _spaces.get(index).setBottomLeftNeighbor(bottomLeftNeighbor);
        }

        // Set up the bottom (down) neighbors.
        for (int tile : bottomDown) {
            int index = tile - 1;
            BoardSpace topLeftNeighbor = _spaces.get(index - 1);
            BoardSpace topNeighbor = _spaces.get(index - 6);
            BoardSpace topRightNeighbor = _spaces.get(index + 1);
            _spaces.get(index).setTopLeftNeighbor(topLeftNeighbor);
            _spaces.get(index).setTopNeighbor(topNeighbor);
            _spaces.get(index).setTopRightNeighbor(topRightNeighbor);
        }

        // Set up top left corner.
        {
            int index = topLeft - 1;
            BoardSpace bottomRightNeighbor = _spaces.get(index + 1);
            BoardSpace bottomNeighbor = _spaces.get(index + 6);
            _spaces.get(index).setBottomRightNeighbor(bottomRightNeighbor);
            _spaces.get(index).setBottomNeighbor(bottomNeighbor);
        }

        // Set up top right corner.
        {
            int index = topRight - 1;
            BoardSpace bottomNeighbor = _spaces.get(index + 6);
            BoardSpace bottomLeftNeighbor = _spaces.get(index + 5);
            BoardSpace topLeftNeighbor = _spaces.get(index - 1);
            _spaces.get(index).setBottomNeighbor(bottomNeighbor);
            _spaces.get(index).setBottomLeftNeighbor(bottomLeftNeighbor);
            _spaces.get(index).setTopLeftNeighbor(topLeftNeighbor);
        }

        // Set up bottom right corner.
        {
            int index = bottomRight - 1;
            BoardSpace topLeftNeighbor = _spaces.get(index - 1);
            BoardSpace topNeighbor = _spaces.get(index - 6);
            _spaces.get(index).setTopLeftNeighbor(topLeftNeighbor);
            _spaces.get(index).setTopNeighbor(topNeighbor);
        }

        // Set up bottom left corner.
        {
            int index = bottomLeft - 1;
            BoardSpace topNeighbor = _spaces.get(index - 6);
            BoardSpace topRightNeighbor = _spaces.get(index - 5);
            BoardSpace bottomRightNeighbor = _spaces.get(index + 1);
            _spaces.get(index).setTopNeighbor(topNeighbor);
            _spaces.get(index).setTopNeighbor(topNeighbor);
            _spaces.get(index).setTopRightNeighbor(topRightNeighbor);
            _spaces.get(index).setBottomRightNeighbor(bottomRightNeighbor);
        }
    }
}
