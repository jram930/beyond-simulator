package com.beyond.simulator;

/**
 * Created by Jared on 1/31/2017.
 */
public class BoardSpace {

    private int _id;

    private boolean _isTraveledTo = false;

    private boolean _isCurrentSpace = false;

    private BoardSpace _topLeftNeighbor = null;
    private BoardSpace _topNeighbor = null;
    private BoardSpace _topRightNeighbor = null;
    private BoardSpace _bottomRightNeighbor = null;
    private BoardSpace _bottomNeighbor = null;
    private BoardSpace _bottomLeftNeighbor = null;

    public BoardSpace(int id) {
        _id = id;
    }

    public boolean isTraveledTo() {
        return _isTraveledTo;
    }

    public void travelTo() {
        this._isTraveledTo = true;
    }

    public boolean isCurrentSpace() {
        return _isCurrentSpace;
    }

    public void makeCurrent() {
        _isCurrentSpace = true;
    }

    public void leaveSpace() {
        _isCurrentSpace = false;
    }

    public int getId() {
        return _id;
    }

    public BoardSpace getTopLeftNeighbor() {
        return _topLeftNeighbor;
    }

    public void setTopLeftNeighbor(BoardSpace b) {
        _topLeftNeighbor = b;
    }

    public BoardSpace getTopNeighbor() {
        return _topNeighbor;
    }

    public void setTopNeighbor(BoardSpace b) {
        _topNeighbor = b;
    }

    public BoardSpace getTopRightNeighbor() {
        return _topRightNeighbor;
    }

    public void setTopRightNeighbor(BoardSpace b) {
        _topRightNeighbor = b;
    }

    public BoardSpace getBottomLeftNeighbor() {
        return _bottomLeftNeighbor;
    }

    public void setBottomLeftNeighbor(BoardSpace b) {
        _bottomLeftNeighbor = b;
    }

    public BoardSpace getBottomNeighbor() {
        return _bottomNeighbor;
    }

    public void setBottomNeighbor(BoardSpace b) {
        _bottomNeighbor = b;
    }

    public BoardSpace getBottomRightNeighbor() {
        return _bottomRightNeighbor;
    }

    public void setBottomRightNeighbor(BoardSpace b) {
        _bottomRightNeighbor = b;
    }

    public boolean hasTopLeftNeighbor() {
        return _topLeftNeighbor != null;
    }

    public boolean hasTopNeighbor() {
        return _topNeighbor != null;
    }

    public boolean hasTopRightNeighbor() {
        return _topRightNeighbor != null;
    }

    public boolean hasBottomRightNeighbor() {
        return _bottomRightNeighbor != null;
    }

    public boolean hasBottomNeighbor() {
        return _bottomNeighbor != null;
    }

    public boolean hasBottomLeftNeighbor() {
        return _bottomLeftNeighbor != null;
    }
}
