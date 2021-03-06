package jamthree.engine.component

import com.badlogic.ashley.core.Component
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.utils.Pool
import ktx.ashley.mapperFor

class MovementComponent : Component, Pool.Poolable {
    val velocity = Vector2(4f, 4f)


    override fun reset() {
        velocity.set(4f, 4f)
    }

    companion object {
        val mapper = mapperFor<MovementComponent>()
    }
}