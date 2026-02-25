package minevalley.fastcar.api.production.shape;

import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public interface Attachment extends ShapeProperty {

    /**
     * Gets the name of this attachment.
     * This corresponds to the database name of the attachment and is used to identify it.
     *
     * @return The attachment name.
     */
    @Nonnull
    @Contract(pure = true)
    String name();
}
