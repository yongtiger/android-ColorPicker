package cc.brainbook.android.colorpicker.builder;

import cc.brainbook.android.colorpicker.ColorPickerView;
import cc.brainbook.android.colorpicker.renderer.ColorWheelRenderer;
import cc.brainbook.android.colorpicker.renderer.FlowerColorWheelRenderer;
import cc.brainbook.android.colorpicker.renderer.SimpleColorWheelRenderer;

public class ColorWheelRendererBuilder {
	public static ColorWheelRenderer getRenderer(ColorPickerView.WHEEL_TYPE wheelType) {
		switch (wheelType) {
			case CIRCLE:
				return new SimpleColorWheelRenderer();
			case FLOWER:
				return new FlowerColorWheelRenderer();
		}
		throw new IllegalArgumentException("wrong WHEEL_TYPE");
	}
}