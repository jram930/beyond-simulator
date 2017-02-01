package com.beyond.simulator;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Jared on 1/31/2017.
 */
public class BoardTest {

    @Test
    public void initializeBoard_Basic_Test() {

        Board target = new Board();

        List<BoardSpace> spaces = target.getSpaces();

        assertEquals(30, spaces.size());
    }

    @Test
    public void initializeBoard_Space1_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(0);

        // Check its ID
        assertEquals(1, space.getId());

        // Check its neighbors
        assertFalse(space.hasTopLeftNeighbor());
        assertFalse(space.hasTopNeighbor());
        assertFalse(space.hasTopRightNeighbor());
        assertTrue(space.hasBottomRightNeighbor());
        assertTrue(space.hasBottomNeighbor());
        assertFalse(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        assertEquals(2, space.getBottomRightNeighbor().getId());
        assertEquals(7, space.getBottomNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }

    @Test
    public void initializeBoard_Space2_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(1);

        // Check its ID
        assertEquals(2, space.getId());

        // Check its neighbors
        assertTrue(space.hasTopLeftNeighbor());
        assertFalse(space.hasTopNeighbor());
        assertTrue(space.hasTopRightNeighbor());
        assertTrue(space.hasBottomRightNeighbor());
        assertTrue(space.hasBottomNeighbor());
        assertTrue(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        assertEquals(1, space.getTopLeftNeighbor().getId());
        //assertEquals(2, space.getTopNeighbor().getId());
        assertEquals(3, space.getTopRightNeighbor().getId());
        assertEquals(9, space.getBottomRightNeighbor().getId());
        assertEquals(8, space.getBottomNeighbor().getId());
        assertEquals(7, space.getBottomLeftNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }

    @Test
    public void initializeBoard_Space3_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(2);

        // Check its ID
        assertEquals(3, space.getId());

        // Check its neighbors
        assertFalse(space.hasTopLeftNeighbor());
        assertFalse(space.hasTopNeighbor());
        assertFalse(space.hasTopRightNeighbor());
        assertTrue(space.hasBottomRightNeighbor());
        assertTrue(space.hasBottomNeighbor());
        assertTrue(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        //assertEquals(1, space.getTopLeftNeighbor().getId());
        //assertEquals(2, space.getTopNeighbor().getId());
        //assertEquals(3, space.getTopRightNeighbor().getId());
        assertEquals(4, space.getBottomRightNeighbor().getId());
        assertEquals(9, space.getBottomNeighbor().getId());
        assertEquals(2, space.getBottomLeftNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }

    @Test
    public void initializeBoard_Space4_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(3);

        // Check its ID
        assertEquals(4, space.getId());

        // Check its neighbors
        assertTrue(space.hasTopLeftNeighbor());
        assertFalse(space.hasTopNeighbor());
        assertTrue(space.hasTopRightNeighbor());
        assertTrue(space.hasBottomRightNeighbor());
        assertTrue(space.hasBottomNeighbor());
        assertTrue(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        assertEquals(3, space.getTopLeftNeighbor().getId());
        //assertEquals(2, space.getTopNeighbor().getId());
        assertEquals(5, space.getTopRightNeighbor().getId());
        assertEquals(11, space.getBottomRightNeighbor().getId());
        assertEquals(10, space.getBottomNeighbor().getId());
        assertEquals(9, space.getBottomLeftNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }

    @Test
    public void initializeBoard_Space5_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(4);

        // Check its ID
        assertEquals(5, space.getId());

        // Check its neighbors
        assertFalse(space.hasTopLeftNeighbor());
        assertFalse(space.hasTopNeighbor());
        assertFalse(space.hasTopRightNeighbor());
        assertTrue(space.hasBottomRightNeighbor());
        assertTrue(space.hasBottomNeighbor());
        assertTrue(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        //assertEquals(1, space.getTopLeftNeighbor().getId());
        //assertEquals(2, space.getTopNeighbor().getId());
        //assertEquals(3, space.getTopRightNeighbor().getId());
        assertEquals(6, space.getBottomRightNeighbor().getId());
        assertEquals(11, space.getBottomNeighbor().getId());
        assertEquals(4, space.getBottomLeftNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }

    @Test
    public void initializeBoard_Space6_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(5);

        // Check its ID
        assertEquals(6, space.getId());

        // Check its neighbors
        assertTrue(space.hasTopLeftNeighbor());
        assertFalse(space.hasTopNeighbor());
        assertFalse(space.hasTopRightNeighbor());
        assertFalse(space.hasBottomRightNeighbor());
        assertTrue(space.hasBottomNeighbor());
        assertTrue(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        assertEquals(5, space.getTopLeftNeighbor().getId());
        //assertEquals(2, space.getTopNeighbor().getId());
        //assertEquals(3, space.getTopRightNeighbor().getId());
        //assertEquals(4, space.getBottomRightNeighbor().getId());
        assertEquals(12, space.getBottomNeighbor().getId());
        assertEquals(11, space.getBottomLeftNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }

    @Test
    public void initializeBoard_Space7_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(6);

        // Check its ID
        assertEquals(7, space.getId());

        // Check its neighbors
        assertFalse(space.hasTopLeftNeighbor());
        assertTrue(space.hasTopNeighbor());
        assertTrue(space.hasTopRightNeighbor());
        assertTrue(space.hasBottomRightNeighbor());
        assertTrue(space.hasBottomNeighbor());
        assertFalse(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        //assertEquals(1, space.getTopLeftNeighbor().getId());
        assertEquals(1, space.getTopNeighbor().getId());
        assertEquals(2, space.getTopRightNeighbor().getId());
        assertEquals(8, space.getBottomRightNeighbor().getId());
        assertEquals(13, space.getBottomNeighbor().getId());
        //assertEquals(2, space.getBottomLeftNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }

    @Test
    public void initializeBoard_Space8_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(7);

        // Check its ID
        assertEquals(8, space.getId());

        // Check its neighbors
        assertTrue(space.hasTopLeftNeighbor());
        assertTrue(space.hasTopNeighbor());
        assertTrue(space.hasTopRightNeighbor());
        assertTrue(space.hasBottomRightNeighbor());
        assertTrue(space.hasBottomNeighbor());
        assertTrue(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        assertEquals(7, space.getTopLeftNeighbor().getId());
        assertEquals(2, space.getTopNeighbor().getId());
        assertEquals(9, space.getTopRightNeighbor().getId());
        assertEquals(15, space.getBottomRightNeighbor().getId());
        assertEquals(14, space.getBottomNeighbor().getId());
        assertEquals(13, space.getBottomLeftNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }

    @Test
    public void initializeBoard_Space9_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(8);

        // Check its ID
        assertEquals(9, space.getId());

        // Check its neighbors
        assertTrue(space.hasTopLeftNeighbor());
        assertTrue(space.hasTopNeighbor());
        assertTrue(space.hasTopRightNeighbor());
        assertTrue(space.hasBottomRightNeighbor());
        assertTrue(space.hasBottomNeighbor());
        assertTrue(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        assertEquals(2, space.getTopLeftNeighbor().getId());
        assertEquals(3, space.getTopNeighbor().getId());
        assertEquals(4, space.getTopRightNeighbor().getId());
        assertEquals(10, space.getBottomRightNeighbor().getId());
        assertEquals(15, space.getBottomNeighbor().getId());
        assertEquals(8, space.getBottomLeftNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }

    @Test
    public void initializeBoard_Space10_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(9);

        // Check its ID
        assertEquals(10, space.getId());

        // Check its neighbors
        assertTrue(space.hasTopLeftNeighbor());
        assertTrue(space.hasTopNeighbor());
        assertTrue(space.hasTopRightNeighbor());
        assertTrue(space.hasBottomRightNeighbor());
        assertTrue(space.hasBottomNeighbor());
        assertTrue(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        assertEquals(9, space.getTopLeftNeighbor().getId());
        assertEquals(4, space.getTopNeighbor().getId());
        assertEquals(11, space.getTopRightNeighbor().getId());
        assertEquals(17, space.getBottomRightNeighbor().getId());
        assertEquals(16, space.getBottomNeighbor().getId());
        assertEquals(15, space.getBottomLeftNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }

    @Test
    public void initializeBoard_Space11_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(10);

        // Check its ID
        assertEquals(11, space.getId());

        // Check its neighbors
        assertTrue(space.hasTopLeftNeighbor());
        assertTrue(space.hasTopNeighbor());
        assertTrue(space.hasTopRightNeighbor());
        assertTrue(space.hasBottomRightNeighbor());
        assertTrue(space.hasBottomNeighbor());
        assertTrue(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        assertEquals(4, space.getTopLeftNeighbor().getId());
        assertEquals(5, space.getTopNeighbor().getId());
        assertEquals(6, space.getTopRightNeighbor().getId());
        assertEquals(12, space.getBottomRightNeighbor().getId());
        assertEquals(17, space.getBottomNeighbor().getId());
        assertEquals(10, space.getBottomLeftNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }

    @Test
    public void initializeBoard_Space12_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(11);

        // Check its ID
        assertEquals(12, space.getId());

        // Check its neighbors
        assertTrue(space.hasTopLeftNeighbor());
        assertTrue(space.hasTopNeighbor());
        assertFalse(space.hasTopRightNeighbor());
        assertFalse(space.hasBottomRightNeighbor());
        assertTrue(space.hasBottomNeighbor());
        assertTrue(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        assertEquals(11, space.getTopLeftNeighbor().getId());
        assertEquals(6, space.getTopNeighbor().getId());
        //assertEquals(3, space.getTopRightNeighbor().getId());
        //assertEquals(4, space.getBottomRightNeighbor().getId());
        assertEquals(18, space.getBottomNeighbor().getId());
        assertEquals(17, space.getBottomLeftNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }

    @Test
    public void initializeBoard_Space13_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(12);

        // Check its ID
        assertEquals(13, space.getId());

        // Check its neighbors
        assertFalse(space.hasTopLeftNeighbor());
        assertTrue(space.hasTopNeighbor());
        assertTrue(space.hasTopRightNeighbor());
        assertTrue(space.hasBottomRightNeighbor());
        assertTrue(space.hasBottomNeighbor());
        assertFalse(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        //assertEquals(1, space.getTopLeftNeighbor().getId());
        assertEquals(7, space.getTopNeighbor().getId());
        assertEquals(8, space.getTopRightNeighbor().getId());
        assertEquals(14, space.getBottomRightNeighbor().getId());
        assertEquals(19, space.getBottomNeighbor().getId());
        //assertEquals(2, space.getBottomLeftNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }

    @Test
    public void initializeBoard_Space14_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(13);

        // Check its ID
        assertEquals(14, space.getId());

        // Check its neighbors
        assertTrue(space.hasTopLeftNeighbor());
        assertTrue(space.hasTopNeighbor());
        assertTrue(space.hasTopRightNeighbor());
        assertTrue(space.hasBottomRightNeighbor());
        assertTrue(space.hasBottomNeighbor());
        assertTrue(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        assertEquals(13, space.getTopLeftNeighbor().getId());
        assertEquals(8, space.getTopNeighbor().getId());
        assertEquals(15, space.getTopRightNeighbor().getId());
        assertEquals(21, space.getBottomRightNeighbor().getId());
        assertEquals(20, space.getBottomNeighbor().getId());
        assertEquals(19, space.getBottomLeftNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }

    @Test
    public void initializeBoard_Space15_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(14);

        // Check its ID
        assertEquals(15, space.getId());

        // Check its neighbors
        assertTrue(space.hasTopLeftNeighbor());
        assertTrue(space.hasTopNeighbor());
        assertTrue(space.hasTopRightNeighbor());
        assertTrue(space.hasBottomRightNeighbor());
        assertTrue(space.hasBottomNeighbor());
        assertTrue(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        assertEquals(8, space.getTopLeftNeighbor().getId());
        assertEquals(9, space.getTopNeighbor().getId());
        assertEquals(10, space.getTopRightNeighbor().getId());
        assertEquals(16, space.getBottomRightNeighbor().getId());
        assertEquals(21, space.getBottomNeighbor().getId());
        assertEquals(14, space.getBottomLeftNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }

    @Test
    public void initializeBoard_Space16_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(15);

        // Check its ID
        assertEquals(16, space.getId());

        // Check its neighbors
        assertTrue(space.hasTopLeftNeighbor());
        assertTrue(space.hasTopNeighbor());
        assertTrue(space.hasTopRightNeighbor());
        assertTrue(space.hasBottomRightNeighbor());
        assertTrue(space.hasBottomNeighbor());
        assertTrue(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        assertEquals(15, space.getTopLeftNeighbor().getId());
        assertEquals(10, space.getTopNeighbor().getId());
        assertEquals(17, space.getTopRightNeighbor().getId());
        assertEquals(23, space.getBottomRightNeighbor().getId());
        assertEquals(22, space.getBottomNeighbor().getId());
        assertEquals(21, space.getBottomLeftNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }

    @Test
    public void initializeBoard_Space17_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(16);

        // Check its ID
        assertEquals(17, space.getId());

        // Check its neighbors
        assertTrue(space.hasTopLeftNeighbor());
        assertTrue(space.hasTopNeighbor());
        assertTrue(space.hasTopRightNeighbor());
        assertTrue(space.hasBottomRightNeighbor());
        assertTrue(space.hasBottomNeighbor());
        assertTrue(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        assertEquals(10, space.getTopLeftNeighbor().getId());
        assertEquals(11, space.getTopNeighbor().getId());
        assertEquals(12, space.getTopRightNeighbor().getId());
        assertEquals(18, space.getBottomRightNeighbor().getId());
        assertEquals(23, space.getBottomNeighbor().getId());
        assertEquals(16, space.getBottomLeftNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }

    @Test
    public void initializeBoard_Space18_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(17);

        // Check its ID
        assertEquals(18, space.getId());

        // Check its neighbors
        assertTrue(space.hasTopLeftNeighbor());
        assertTrue(space.hasTopNeighbor());
        assertFalse(space.hasTopRightNeighbor());
        assertFalse(space.hasBottomRightNeighbor());
        assertTrue(space.hasBottomNeighbor());
        assertTrue(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        assertEquals(17, space.getTopLeftNeighbor().getId());
        assertEquals(12, space.getTopNeighbor().getId());
        //assertEquals(3, space.getTopRightNeighbor().getId());
        //assertEquals(4, space.getBottomRightNeighbor().getId());
        assertEquals(24, space.getBottomNeighbor().getId());
        assertEquals(23, space.getBottomLeftNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }

    @Test
    public void initializeBoard_Space19_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(18);

        // Check its ID
        assertEquals(19, space.getId());

        // Check its neighbors
        assertFalse(space.hasTopLeftNeighbor());
        assertTrue(space.hasTopNeighbor());
        assertTrue(space.hasTopRightNeighbor());
        assertTrue(space.hasBottomRightNeighbor());
        assertTrue(space.hasBottomNeighbor());
        assertFalse(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        //assertEquals(1, space.getTopLeftNeighbor().getId());
        assertEquals(13, space.getTopNeighbor().getId());
        assertEquals(14, space.getTopRightNeighbor().getId());
        assertEquals(20, space.getBottomRightNeighbor().getId());
        assertEquals(25, space.getBottomNeighbor().getId());
        //assertEquals(2, space.getBottomLeftNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }

    @Test
    public void initializeBoard_Space20_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(19);

        // Check its ID
        assertEquals(20, space.getId());

        // Check its neighbors
        assertTrue(space.hasTopLeftNeighbor());
        assertTrue(space.hasTopNeighbor());
        assertTrue(space.hasTopRightNeighbor());
        assertTrue(space.hasBottomRightNeighbor());
        assertTrue(space.hasBottomNeighbor());
        assertTrue(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        assertEquals(19, space.getTopLeftNeighbor().getId());
        assertEquals(14, space.getTopNeighbor().getId());
        assertEquals(21, space.getTopRightNeighbor().getId());
        assertEquals(27, space.getBottomRightNeighbor().getId());
        assertEquals(26, space.getBottomNeighbor().getId());
        assertEquals(25, space.getBottomLeftNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }

    @Test
    public void initializeBoard_Space21_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(20);

        // Check its ID
        assertEquals(21, space.getId());

        // Check its neighbors
        assertTrue(space.hasTopLeftNeighbor());
        assertTrue(space.hasTopNeighbor());
        assertTrue(space.hasTopRightNeighbor());
        assertTrue(space.hasBottomRightNeighbor());
        assertTrue(space.hasBottomNeighbor());
        assertTrue(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        assertEquals(14, space.getTopLeftNeighbor().getId());
        assertEquals(15, space.getTopNeighbor().getId());
        assertEquals(16, space.getTopRightNeighbor().getId());
        assertEquals(22, space.getBottomRightNeighbor().getId());
        assertEquals(27, space.getBottomNeighbor().getId());
        assertEquals(20, space.getBottomLeftNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }

    @Test
    public void initializeBoard_Space22_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(21);

        // Check its ID
        assertEquals(22, space.getId());

        // Check its neighbors
        assertTrue(space.hasTopLeftNeighbor());
        assertTrue(space.hasTopNeighbor());
        assertTrue(space.hasTopRightNeighbor());
        assertTrue(space.hasBottomRightNeighbor());
        assertTrue(space.hasBottomNeighbor());
        assertTrue(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        assertEquals(21, space.getTopLeftNeighbor().getId());
        assertEquals(16, space.getTopNeighbor().getId());
        assertEquals(23, space.getTopRightNeighbor().getId());
        assertEquals(29, space.getBottomRightNeighbor().getId());
        assertEquals(28, space.getBottomNeighbor().getId());
        assertEquals(27, space.getBottomLeftNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }

    @Test
    public void initializeBoard_Space23_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(22);

        // Check its ID
        assertEquals(23, space.getId());

        // Check its neighbors
        assertTrue(space.hasTopLeftNeighbor());
        assertTrue(space.hasTopNeighbor());
        assertTrue(space.hasTopRightNeighbor());
        assertTrue(space.hasBottomRightNeighbor());
        assertTrue(space.hasBottomNeighbor());
        assertTrue(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        assertEquals(16, space.getTopLeftNeighbor().getId());
        assertEquals(17, space.getTopNeighbor().getId());
        assertEquals(18, space.getTopRightNeighbor().getId());
        assertEquals(24, space.getBottomRightNeighbor().getId());
        assertEquals(29, space.getBottomNeighbor().getId());
        assertEquals(22, space.getBottomLeftNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }

    @Test
    public void initializeBoard_Space24_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(23);

        // Check its ID
        assertEquals(24, space.getId());

        // Check its neighbors
        assertTrue(space.hasTopLeftNeighbor());
        assertTrue(space.hasTopNeighbor());
        assertFalse(space.hasTopRightNeighbor());
        assertFalse(space.hasBottomRightNeighbor());
        assertTrue(space.hasBottomNeighbor());
        assertTrue(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        assertEquals(23, space.getTopLeftNeighbor().getId());
        assertEquals(18, space.getTopNeighbor().getId());
        //assertEquals(3, space.getTopRightNeighbor().getId());
        //assertEquals(4, space.getBottomRightNeighbor().getId());
        assertEquals(30, space.getBottomNeighbor().getId());
        assertEquals(29, space.getBottomLeftNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }

    @Test
    public void initializeBoard_Space25_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(24);

        // Check its ID
        assertEquals(25, space.getId());

        // Check its neighbors
        assertFalse(space.hasTopLeftNeighbor());
        assertTrue(space.hasTopNeighbor());
        assertTrue(space.hasTopRightNeighbor());
        assertTrue(space.hasBottomRightNeighbor());
        assertFalse(space.hasBottomNeighbor());
        assertFalse(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        //assertEquals(1, space.getTopLeftNeighbor().getId());
        assertEquals(19, space.getTopNeighbor().getId());
        assertEquals(20, space.getTopRightNeighbor().getId());
        assertEquals(26, space.getBottomRightNeighbor().getId());
        //assertEquals(25, space.getBottomNeighbor().getId());
        //assertEquals(2, space.getBottomLeftNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }

    @Test
    public void initializeBoard_Space26_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(25);

        // Check its ID
        assertEquals(26, space.getId());

        // Check its neighbors
        assertTrue(space.hasTopLeftNeighbor());
        assertTrue(space.hasTopNeighbor());
        assertTrue(space.hasTopRightNeighbor());
        assertFalse(space.hasBottomRightNeighbor());
        assertFalse(space.hasBottomNeighbor());
        assertFalse(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        assertEquals(25, space.getTopLeftNeighbor().getId());
        assertEquals(20, space.getTopNeighbor().getId());
        assertEquals(27, space.getTopRightNeighbor().getId());
        //assertEquals(26, space.getBottomRightNeighbor().getId());
        //assertEquals(25, space.getBottomNeighbor().getId());
        //assertEquals(2, space.getBottomLeftNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }

    @Test
    public void initializeBoard_Space27_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(26);

        // Check its ID
        assertEquals(27, space.getId());

        // Check its neighbors
        assertTrue(space.hasTopLeftNeighbor());
        assertTrue(space.hasTopNeighbor());
        assertTrue(space.hasTopRightNeighbor());
        assertTrue(space.hasBottomRightNeighbor());
        assertFalse(space.hasBottomNeighbor());
        assertTrue(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        assertEquals(20, space.getTopLeftNeighbor().getId());
        assertEquals(21, space.getTopNeighbor().getId());
        assertEquals(22, space.getTopRightNeighbor().getId());
        assertEquals(28, space.getBottomRightNeighbor().getId());
        //assertEquals(25, space.getBottomNeighbor().getId());
        assertEquals(26, space.getBottomLeftNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }

    @Test
    public void initializeBoard_Space28_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(27);

        // Check its ID
        assertEquals(28, space.getId());

        // Check its neighbors
        assertTrue(space.hasTopLeftNeighbor());
        assertTrue(space.hasTopNeighbor());
        assertTrue(space.hasTopRightNeighbor());
        assertFalse(space.hasBottomRightNeighbor());
        assertFalse(space.hasBottomNeighbor());
        assertFalse(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        assertEquals(27, space.getTopLeftNeighbor().getId());
        assertEquals(22, space.getTopNeighbor().getId());
        assertEquals(29, space.getTopRightNeighbor().getId());
        //assertEquals(26, space.getBottomRightNeighbor().getId());
        //assertEquals(25, space.getBottomNeighbor().getId());
        //assertEquals(2, space.getBottomLeftNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }

    @Test
    public void initializeBoard_Space29_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(28);

        // Check its ID
        assertEquals(29, space.getId());

        // Check its neighbors
        assertTrue(space.hasTopLeftNeighbor());
        assertTrue(space.hasTopNeighbor());
        assertTrue(space.hasTopRightNeighbor());
        assertTrue(space.hasBottomRightNeighbor());
        assertFalse(space.hasBottomNeighbor());
        assertTrue(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        assertEquals(22, space.getTopLeftNeighbor().getId());
        assertEquals(23, space.getTopNeighbor().getId());
        assertEquals(24, space.getTopRightNeighbor().getId());
        assertEquals(30, space.getBottomRightNeighbor().getId());
        //assertEquals(25, space.getBottomNeighbor().getId());
        assertEquals(28, space.getBottomLeftNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }

    @Test
    public void initializeBoard_Space30_Test() {

        Board target = new Board();

        BoardSpace space = target.getSpaces().get(29);

        // Check its ID
        assertEquals(30, space.getId());

        // Check its neighbors
        assertTrue(space.hasTopLeftNeighbor());
        assertTrue(space.hasTopNeighbor());
        assertFalse(space.hasTopRightNeighbor());
        assertFalse(space.hasBottomRightNeighbor());
        assertFalse(space.hasBottomNeighbor());
        assertFalse(space.hasBottomLeftNeighbor());

        // Check its neighbors IDs
        assertEquals(29, space.getTopLeftNeighbor().getId());
        assertEquals(24, space.getTopNeighbor().getId());
        //assertEquals(22, space.getTopRightNeighbor().getId());
        //assertEquals(28, space.getBottomRightNeighbor().getId());
        //assertEquals(25, space.getBottomNeighbor().getId());
        //assertEquals(26, space.getBottomLeftNeighbor().getId());

        // Check its state
        assertFalse(space.isCurrentSpace());
        assertFalse(space.isTraveledTo());
    }
}