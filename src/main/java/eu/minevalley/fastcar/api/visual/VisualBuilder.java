package eu.minevalley.fastcar.api.visual;

import eu.minevalley.fastcar.api.characteristics.VehicleColor;
import eu.minevalley.fastcar.api.characteristics.body.Addon;
import org.bukkit.World;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface VisualBuilder {

    /**
     * Updates this vehicles color
     *
     * @param color color to set
     * @throws IllegalArgumentException if the color is null
     */
    void setColor(@Nonnull VehicleColor color) throws IllegalArgumentException;

    /**
     * Sets the world, this visual is located in.
     */
    void setWorld(@Nonnull World world) throws IllegalArgumentException;

    /**
     * Sets the yaw of this visual's rotation.
     * <p>
     * <b>Default:</b> 0
     */
    void setYaw(float yaw);

    /**
     * Sets the pitch of this visual's rotation.
     * <p>
     * <b>Default:</b> 0
     */
    void setPitch(float pitch);

    /**
     * Gets the roll of this visual's rotation.
     * <p>
     * <b>Default:</b> 0
     */
    void setRoll(float roll);

    /**
     * Attaches the given addons to this visual.
     *
     * @param addons addons to attach
     * @throws IllegalArgumentException if the addons array is null
     */
    void setAddons(@Nonnull Addon... addons) throws IllegalArgumentException;

    /**
     * Sets the state of the siren to the given boolean
     *
     * @param siren true, if siren should be on, false otherwise
     * @throws IllegalStateException if the model does not support sirens
     */
    void setSiren(boolean siren) throws IllegalStateException;

    /**
     * Places the actual visual.
     *
     * @return newly created visual
     * @throws NullPointerException if the world or the color is not set
     */
    @Nonnull
    @Contract("_, _, _ -> new")
    Visual place(float x, float y, float z) throws NullPointerException;
}