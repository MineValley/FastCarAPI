package eu.minevalley.fastcar.api.visual;

import eu.minevalley.fastcar.api.characteristics.VehicleBody;
import eu.minevalley.fastcar.api.characteristics.VehicleColor;
import eu.minevalley.fastcar.api.characteristics.body.Addon;
import org.bukkit.World;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;
import java.util.Set;

@SuppressWarnings("unused")
public interface Visual {

    /**
     * Get the vehicle body used in this visual.
     *
     * @return the vehicle body
     */
    @Nonnull
    @Contract(pure = true)
    VehicleBody body();

    /**
     * Gets this vehicles color
     *
     * @return vehicle color
     */
    @Nonnull
    @Contract(pure = true)
    VehicleColor color();

    /**
     * Updates this vehicles color
     *
     * @param color color to set
     * @throws IllegalArgumentException if the color is null
     */
    void color(@Nonnull VehicleColor color) throws IllegalArgumentException;

    /**
     * Gets the world, this visual is located in.
     *
     * @return world
     */
    @Nonnull
    @Contract(pure = true)
    World getWorld();

    /**
     * Gets the x coordinate of this visual's location.
     *
     * @return x coordinate
     */
    float getX();

    /**
     * Gets the y coordinate of this visual's location.
     *
     * @return y coordinate
     */
    float getY();

    /**
     * Gets the z coordinate of this visual's location.
     *
     * @return z coordinate
     */
    float getZ();

    /**
     * Gets the yaw of this visual's rotation.
     *
     * @return yaw
     */
    float getYaw();

    /**
     * Gets the pitch of this visual's rotation.
     *
     * @return pitch
     */
    float getPitch();

    /**
     * Gets the roll of this visual's rotation.
     *
     * @return roll
     */
    float getRoll();

    /**
     * Moves this visual to the specific location and updates it's rotation
     *
     * @param x     x coordinate
     * @param y     y coordinate
     * @param z     z coordinate
     * @param yaw   yaw
     * @param pitch pitch
     * @param roll  roll
     */
    void move(float x, float y, float z, float yaw, float pitch, float roll);

    /**
     * Moves this visual to the specific location and updates it's 2D rotation
     *
     * @param x     x coordinate
     * @param y     y coordinate
     * @param z     z coordinate
     * @param yaw   yaw
     * @param pitch pitch
     */
    default void move(float x, float y, float z, float yaw, float pitch) {
        move(x, y, z, yaw, pitch, getPitch());
    }

    /**
     * Moves this visual to the specific location
     *
     * @param x x coordinate
     * @param y y coordinate
     * @param z z coordinate
     */
    default void move(float x, float y, float z) {
        move(x, y, z, getYaw(), getPitch(), getRoll());
    }

    /**
     * Rotates this visual to the specific rotation
     *
     * @param yaw   yaw
     * @param pitch pitch
     * @param roll  roll
     */
    void rotate(float yaw, float pitch, float roll);

    /**
     * Rotates this visual to a specific yaw, while keeping the current pitch and roll
     *
     * @param yaw yaw
     */
    default void rotate(float yaw) {
        rotate(yaw, getPitch(), getRoll());
    }

    /**
     * Get a set of all addons currently attached to the visual.
     *
     * @return a set of attached addons
     */
    @Nonnull
    @Contract(pure = true)
    Set<Addon> getAttachedAddons();

    /**
     * Attaches the given addon to this visual.
     * <p>
     * <b>Note:</b> If the addon is already attached, this method does nothing!
     *
     * @param addon addon to attach
     * @throws IllegalArgumentException if the addon is null
     */
    void attach(@Nonnull Addon addon) throws IllegalArgumentException;

    /**
     * Detaches the given addon to this visual.
     * <p>
     * <b>Note:</b> If the addon is not attached, this method does nothing!
     *
     * @param addon addon to detach
     * @throws IllegalArgumentException if the addon is null
     */
    void detach(@Nonnull Addon addon) throws IllegalArgumentException;

    /**
     * Makes this visual visible.
     * <p>
     * <b>Note:</b>
     * <ul>
     *     <li>This is the default state! No need to actively call this method, after creating the visual</li>
     *     <li>If this visual is already visible, this method does nothing!</li>
     * </ul>
     *
     * @see #isVisible()
     */
    void show();

    /**
     * Hides this visual.
     * <p>
     * <b>Note:</b> If this visual is already hidden, this method does nothing!
     *
     * @see #show()
     */
    void hide();

    /**
     * Checks whether this visual is currently visible.
     *
     * @return true, if the visual is visible
     */
    @Contract(pure = true)
    boolean isVisible();

    /**
     * Sets the state of the siren to the given boolean
     *
     * @param siren true, if siren should be on, false otherwise
     * @throws IllegalStateException if the model does not support sirens
     */
    void siren(boolean siren) throws IllegalStateException;

    /**
     * Checks whether the siren is currently activated.
     *
     * @return true, if the siren is activated, false otherwise
     */
    @Contract(pure = true)
    boolean siren();
}