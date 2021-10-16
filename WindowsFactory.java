package factories;

import bitcoin.Bitcoin;
import buttons.WindowsBitocoin;
import checkboxes.Checkbox;
import checkboxes.WindowsCheckbox;
// this is WindowsFactory varient of facotries
public class WindowsFactory implements GUIFactory {

    @Override
    public Bitcoin createBitcoin() {
        return new WindowsBitcoin();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
