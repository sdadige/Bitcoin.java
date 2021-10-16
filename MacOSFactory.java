/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import bitcoin.Bitcoin;
import bitcoin.MacOSBitcoin;
import checkboxes.Checkbox;
import checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 * This is MacOSFactory 
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Bitcoin createBitcoin() {
        return new MacOSBitcoin();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
