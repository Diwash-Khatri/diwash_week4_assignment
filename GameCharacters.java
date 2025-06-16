class GameCharacter {
    private String name;

    public GameCharacter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String attack() {
        return name + " attacks with basic strike.";
    }
}

class Warrior extends GameCharacter {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return getName() + " attacks with a powerful melee strike.";
    }
}

class Archer extends GameCharacter {
    private int arrowCount;

    public Archer(String name, int arrowCount) {
        super(name);
        this.arrowCount = arrowCount;
    }

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    @Override
    public String attack() {
        if (arrowCount > 0) {
            arrowCount--;
            return getName() + " shoots an arrow. Arrows left: " + arrowCount;
        } else {
            return getName() + " has no arrows left to attack.";
        }
    }
}

class Mage extends GameCharacter {
    private int mana;

    public Mage(String name, int mana) {
        super(name);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String attack() {
        if (mana >= 10) {
            mana -= 10;
            return getName() + " casts a powerful spell. Mana left: " + mana;
        } else {
            return getName() + " does not have enough mana to attack.";
        }
    }
}

public class GameCharacters {
    public static void main(String[] args) {
        GameCharacter[] characters = {
            new Warrior("Alok"),
            new Archer("Messi", 3),
            new Mage("Mbape", 25)
        };

        for (GameCharacter character : characters) {
            System.out.println(character.attack());
        }
    }
}
