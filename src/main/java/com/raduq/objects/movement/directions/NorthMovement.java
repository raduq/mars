package com.raduq.objects.movement.directions;

import com.raduq.objects.locations.Position;
import com.raduq.objects.movement.Movement;

/**
 * Movimentação para norte.
 * Created by raduq on 17/01/17.
 */
public class NorthMovement implements Movement {

    @Override
    public Position move(Position oldPosition) {
        return oldPosition.plusY();
    }

}
