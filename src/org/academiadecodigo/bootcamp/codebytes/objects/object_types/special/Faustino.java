package org.academiadecodigo.bootcamp.codebytes.objects.object_types.special;

import org.academiadecodigo.bootcamp.codebytes.grid.GridPosition;
import org.academiadecodigo.bootcamp.codebytes.objects.object_factory.GameObjectType;
import org.academiadecodigo.bootcamp.codebytes.objects.object_types.GameObject;
import org.academiadecodigo.bootcamp.codebytes.objects.object_interfaces.Bonus;

public class Faustino extends GameObject{

    public Faustino(GridPosition position, GameObjectType gameObjectType) {
        super(position, GameObjectType.FAUSTINO);
    }

}
