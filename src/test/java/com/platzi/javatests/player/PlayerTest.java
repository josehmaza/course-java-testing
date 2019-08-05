package com.platzi.javatests.player;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void looses_when_dice_number_is_too_long(){
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);
        Player player = new Player(dice, 3);
        assertFalse(player.play());
    }
    @Test
    public void win_when_dice_number_is_biG(){
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(4);
        Player player = new Player(dice, 3);
        assertTrue(player.play());
    }
}