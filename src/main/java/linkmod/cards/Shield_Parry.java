package linkmod.cards;

import com.megacrit.cardcrawl.actions.common.GainBlockAction;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import linkmod.character.LinkCharacter;
import linkmod.util.CardInfo;

import static linkmod.LinkMod.makeID;

public class Shield_Parry extends BaseCard {
    private final static CardInfo cardInfo = new CardInfo(
            "Shield_Parry",
            1,
            CardType.SKILL,
            CardTarget.SELF,
            CardRarity.BASIC,
            LinkCharacter.Enums.CARD_COLOR);

    public static final String ID = makeID(cardInfo.baseId);

    private static final int BLOCK = 6;
    private static final int UPG_BLOCK = 2;

    public Shield_Parry() {
        super(cardInfo);

        setBlock(BLOCK, UPG_BLOCK);
    }

    @Override
    public void use(AbstractPlayer p, AbstractMonster m) {
        addToBot(new GainBlockAction(p, p, block));
    }

    @Override
    public AbstractCard makeCopy() { //Optional
        return new Shield_Parry();
    }
}
