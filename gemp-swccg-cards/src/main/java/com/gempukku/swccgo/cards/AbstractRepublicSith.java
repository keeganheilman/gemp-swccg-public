package com.gempukku.swccgo.cards;

import com.gempukku.swccgo.common.CardType;
import com.gempukku.swccgo.common.Icon;
import com.gempukku.swccgo.common.Side;
import com.gempukku.swccgo.common.Uniqueness;

/**
 * The abstract class providing the common implementation for characters that are Republic and Sith.
 */
public abstract class AbstractRepublicSith extends AbstractCharacter {

    /**
     * Creates a blueprint for a character that is a Republic and Sith.
     *
     * @param side       the side of the Force
     * @param destiny    the destiny value
     * @param deployCost the deploy cost
     * @param power      the power value
     * @param forfeit    the forfeit value
     * @param title      the card title
     */
    protected AbstractRepublicSith(Side side, float destiny, float deployCost, float power, float ability, float forfeit, String title) {
        this(side, destiny, deployCost, power, ability, forfeit, title, null);
    }

    /**
     * Creates a blueprint for a character that is a Republic and Sith.
     *
     * @param side       the side of the Force
     * @param destiny    the destiny value
     * @param deployCost the deploy cost
     * @param power      the power value
     * @param forfeit    the forfeit value
     * @param title      the card title
     * @param uniqueness the uniqueness
     */
    protected AbstractRepublicSith(Side side, float destiny, float deployCost, float power, float ability, float forfeit, String title, Uniqueness uniqueness) {
        super(side, destiny, deployCost, power, ability, forfeit, title, uniqueness);
        addCardType(CardType.REPUBLIC);
        addCardType(CardType.SITH);
        addIcons(Icon.REPUBLIC, Icon.SITH);
    }
}
