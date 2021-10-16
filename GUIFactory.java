package factories;

import bitcoin.Bitcoin;
import checkboxes.Checkbox;
/**
 * Abstract factory knows about all (abstract) product types.
 */

public interface GUIFactory {
    Button createBitcoin();
    Checkbox createCheckbox();
}
